import java.util.Scanner;

public class LoopWhile {
    //Ask user for numbers, stop if sum is greater than 20

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int sum = 0;

        while (sum <= 20) {
            System.out.println("Please enter a number");
            int number = console.nextInt();
          sum = sum + number; //modyfikacja warunku
        }

        System.out.println("The sum " + sum +" is greater than 20");

    }
}
