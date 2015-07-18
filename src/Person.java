/**
 * Created by umityilmaz on 11-07-15.
 * Person class as described in the assignment
 */
@FileMetaData(separator = ",")
public class Person {

    //first name at index 1
    @CSVColumn(indx = 1)
    private String firstName;

    //last name at index 2
    @CSVColumn(indx = 2)
    private String lastName ;

    //getters
    public String getFirstName() {

        return this.firstName;
    }

    public String getLastName() {

        return this.lastName;
    }

    //setters
    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    //toString method for printing the Persons
    @Override
    public String toString () {

        return "Person [firstname =" + firstName + ", lastname = " + lastName + "]";
    }
}
