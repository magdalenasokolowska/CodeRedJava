import java.util.Scanner;

public class weekDays {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Give number from 1 to 7");
        int number = console.nextInt();

        switch (number) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
            default:
                System.out.println("Your number is invalid");
        }

    }
}
