import java.util.Scanner;
//scanner example

public class UserInputExample {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("How old are you?");
        int age = console.nextInt();

        int years = 65 - age;
        System.out.println(years + " " + "years until retirement");



    }
}
