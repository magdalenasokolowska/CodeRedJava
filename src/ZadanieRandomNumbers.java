import java.util.Random;
import java.util.Scanner;

public class ZadanieRandomNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Random rd = new Random();

        System.out.println("Provide number of elements");

        int[] array = new int[console.nextInt()];
        //int randomInt = rd.nextInt(100);

        for (int i = 0; i < array.length; i ++) {
           for (int j = 0; j < array.length; j++) {
               array[j] = rd.nextInt(100);
           } System.out.println(array[i]);
        }

    }
}
