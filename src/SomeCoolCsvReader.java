/**
 * Created by umityilmaz on 11-07-15.
 * Basic reader class for reading our csv file
 */

import java.io.*;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.io.FileReader;
import java.io.BufferedReader;

public class SomeCoolCsvReader {

    private static List<Person> mappedPersons = new ArrayList<Person>();

    public SomeCoolCsvReader(File filename, Class<Person> person) {

        read(filename);
    }

    public static void read(File fileName) {

        BufferedReader fileReader = null;
        //get the separator as declared in Person
        String separator = Person.class.getAnnotation(FileMetaData.class).separator();

        try {

            String line;

            //Create the file reader
            fileReader = new BufferedReader(new FileReader(fileName));

            //Read the file line by line
            while ((line = fileReader.readLine()) != null) {

                //get the fields from Person
                Field[] fields = Person.class.getDeclaredFields();
                //create a new person object
                Person person = new Person();

                //iterate through the fields and map the values
                //from the read line to the according field from Person
                for (Field field : fields) {
                    int indx = field.getAnnotation(CSVColumn.class).indx();
                    String[] data = line.split(separator);
                    String value = data[(indx -1)];
                    if (indx == 1) {
                        person.setFirstName(value);
                    }
                    else if (indx == 2){
                        person.setLastName(value);
                    }
                }
                //add the person object to the list of persons
                mappedPersons.add(person);
            }
        }
        catch (Exception e) {
            System.out.println("error in SomeCoolCsvReader");
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                System.out.println("error in closing filereader");
                e.printStackTrace();
            }
        }
    }

    public List<Person> getPersons() {

        return mappedPersons;

    }
}
