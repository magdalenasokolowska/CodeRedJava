import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Give me two numbers.");
        int firstNumber = console.nextInt();
        int secondNumber = console.nextInt();

        if (firstNumber > secondNumber) {
            System.out.println(firstNumber);
        } else if (firstNumber == secondNumber) {
            System.out.println("Numbers are equal");
        } else {
            System.out.println(secondNumber);
        }
    }
}
