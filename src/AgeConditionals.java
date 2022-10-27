import java.util.Scanner;

public class AgeConditionals {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("How old are you?");
        int age = console.nextInt();

        if (age >= 1 && age <= 10) {
            System.out.println("Child");
        } else if (age >= 11 && age <= 19) {
            System.out.println("Teenager");
        } else if (age >= 20 && age < 120){
            System.out.println("Adult");
        } else {
            System.out.println("Number is invalid");
        }
    }
}
