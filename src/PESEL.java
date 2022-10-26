import java.time.LocalDate;
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
        LocalDate localDate1 = LocalDate.now();

        System.out.println("When is your next birthday? (format YYY-MM-DD");
        String birthday = console.next();

        LocalDate birthdayDate = birthday;

        ChronoUnit.DAYS.between(localDate1, birthdayDate);


    }
}
