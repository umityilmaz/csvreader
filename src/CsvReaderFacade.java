import java.io.File;
import java.util.List;

/**
 * Created by umityilmaz on 11-07-15.
 * Facade for SomeCoolCsvReader
 */
public class CsvReaderFacade {

    private SomeCoolCsvReader someCoolCsvReader;

    public CsvReaderFacade(File randomCsvFile) {

        someCoolCsvReader = new SomeCoolCsvReader(randomCsvFile, Person.class);
    }

    public List<Person> getPersons() {

        return someCoolCsvReader.getPersons();
    }
}
