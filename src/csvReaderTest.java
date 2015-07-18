import java.io.File;
import java.util.List;

/**
 * Created by umityilmaz on 11-07-15.
 * test class for reading the csv file
 * after reading the csv file, the values are printed to console
 * The implementation of this assignment assumes there are no errors in the csv file,
 * thus the csv file has the correct format.
 */
public class csvReaderTest {


    public static void main(String[] args) {

        //define the path to the file that is to be read on your system
        //this one is hardcoded, so adjust according to your own path
        File fileName = new File("/Users/umityilmaz/projects/csvreader/src/input.csv");

        //call the CsvReaderFacade
        CsvReaderFacade csvReaderFacade = new CsvReaderFacade(fileName);
        List<Person> persons = csvReaderFacade.getPersons();

        System.out.println("\nRead CSV file:");

        //Print the list of persons to check it out
        for (Person person : persons) {
            System.out.println(person.toString());
        }
    }

}
