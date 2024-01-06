package JavaDateHour;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ConverterDate {

    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");

        System.out.println("d04 = " + d04);
        System.out.println("d05 = " + d05);
    }

}
