import java.util.Scanner;

public class weekDays {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Give number from 1 to 7");

        int number = console.nextInt();

        if (number == 1) {
            System.out.println("Monday");
        } else if (number == 2) {
            System.out.println("Tuesday");

        } else if (number == 3) {
            System.out.println("Wednesday");
        } else if (number == 4) {
            System.out.println("Thursday");
        } else
            System.out.println("Friday");
    }
}
