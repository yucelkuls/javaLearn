package j15_DateTime;

import java.time.LocalDate;
import java.time.Month;

public class C10_OCA {
    public static void main(String[] args) {
/*
           Which of the following can be inserted into the blank to create a date of June 21, 2014 ?
           21 Haziran 2014 tarihini olusturmak için bos bırakılan yere asagidakilerden hangisi veya hangileri getirilebilir?
           A. new LocalDate(2014, 5, 21);
           B. new LocalDate(2014, 6, 21);
           C. LocalDate.of(2014, 5, 21);
           D. LocalDate.of(2014, 6, 21);
           F. LocalDate.of(2014, Month.JUNE, 21);
         */
        LocalDate date = LocalDate.of(2014,6,21);
        LocalDate date2 = LocalDate.of(2014, Month.JUNE,21);
        System.out.println(date + "\n"+ date2);
    }
}
