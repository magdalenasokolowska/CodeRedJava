import java.util.Currency;

public class Metody {
    public static void main(String[] args) {
        double root = Math.sqrt(16);
        System.out.println(root);
        Currency.getInstance("USD").getSymbol(); //returns $

        double biggestRoot = Math.max(Math.sqrt(16), Math.sqrt(9));
        System.out.println(biggestRoot);

        //creating new method


    }
    public static void nazwaMetody() {
        //metoda
    }

    //calculate average of 3 numbers:
    public static double calculateAverage (double num1, //parametr1
                                         double num2, //parametr 2
                                         double num3) {
        double sum = num1 + num2 + num3;
        double average = sum / 3;
        return average;


    }
    double average = calculateAverage(3.5, 4.2, 6.0); //3 arguments


}
