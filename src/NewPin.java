import java.util.Scanner;

public class NewPin {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int proby = 1;
        System.out.println("Give me your PIN");
        String pin = "2222";

        for (int i = 1; i <= 3;i++ ) {
            if (console.next().equals(pin)) {
                System.out.println("Pin prawidlowy");
                break;
            } else proby ++;
                if (proby <=3 ) {
                    System.out.println("Try again, you have " + (4 - proby) + " tries left.");

            } else {
                    System.out.println("Gameover");
                }
        }

    }
}
