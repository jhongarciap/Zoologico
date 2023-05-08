package Utilities;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author garci
 */
public class CurrentDate {

    public static String currentDate() {

        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY");

        return dateFormat.format(date);
    }

}
