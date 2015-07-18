/**
 * Created by umityilmaz on 11-07-15.
 * Custom annotation for FileMetaData.
 */

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface FileMetaData {

    String separator();
}

