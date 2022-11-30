import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;


public class PESEL {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("What is your name and surname?");
        String nameAndSurname = console.nextLine();

        System.out.println("Name and surname: " + " " + nameAndSurname);

        System.out.println("What is your PESEL?");
        String pesel = console.nextLine();
        System.out.println("Your PESEL is:" + " " + pesel);

        if (pesel.charAt(9) % 2 == 0) {
            System.out.println("Gender: woman");
        } else {
            System.out.println("Gender: man");
        }
        //LocalDate. localDate1 = LocalDate.now();

       // int dayBirthday = pesel.charAt(4) & pesel.charAt(5);
       // System.out.println(dayBirthday);

       // LocalDate localDate = LocalDate.ofYearDay(22, 300);
        //LocalDate birthdayDate = LocalDate.ofYearDay();



    }
}
