package JavaDateHour;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDate {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date y1 = sdf1.parse("12/01/2024");
        Date y2 = sdf2.parse("12/01/2024 00:09:20");

        System.out.println(y1);
        System.out.println(y2);
    }

}
