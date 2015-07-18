/**
 * Created by umityilmaz on 11-07-15.
 * Custom Annotation for CSVColumn.
 */

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface CSVColumn {

    int indx();
}