import java.util.Scanner;

public class ArraysLoops {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Give me three numbers");

        int[] tablicaInt = new int[3];
        tablicaInt[0] = console.nextInt();
        tablicaInt[1] = console.nextInt();
        tablicaInt[2] = console.nextInt();


        for (int i = 0; i < tablicaInt.length; i++)
        {
            System.out.println(tablicaInt[i]);
        }











    }
}
