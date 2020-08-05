package day33_LocalDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeFormating {
        /*
        year: yy, yyyy
        Month: MM(number). MMM(three letters), MMMM(full name)
        days: dd
        days Name: E(three letters)
         */
    public static void main(String[] args) {
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MMM/dd/yyyy, E");

        LocalDate ld = LocalDate.of(2020,7,25);

        System.out.println(ld);
        System.out.println( ld.format(dateFormat) );

        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("hh:mm a");
        LocalTime now = LocalTime.now();
        System.out.println(now);
        System.out.println(now.format(timeFormat));


        // May/20/2019 Dayname 4:30pm
        DateTimeFormatter DTFormat = DateTimeFormatter.ofPattern("MMM/dd/yy EEEE hh:mm: a");
        LocalDateTime time1 = LocalDateTime.of(2019,5,20,16,30);
        System.out.println(time1);
        System.out.println(time1.format(DTFormat));

        System.out.println(LocalDateTime.now().format(DTFormat) );

        // Saturday 4:34 pm
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE hh:mm:ss a");
        LocalDateTime Now = LocalDateTime.now();
        System.out.println(Now.format(dtf));







    }


}
