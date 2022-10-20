import java.sql.SQLOutput;

public class Zadanie1 {
    public static void main(String[] args) {

        System.out.println(11/5);

        //var x = 5;
       // x += 10;
       // System.out.println(x);

        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        //czy zmienna jest tego typu czy nie
       // var x = "Hello";
       // System.out.println(x instanceof String);

        //Inkrementacja

        var x =10;
        System.out.println(x++); //najpier wywpisuje 10, dopiero wtedy podnosi o jeden
        System.out.println(x); //i dopiero tu pokazuje ten podniesiony

        //mozemy dac z przodu, wtedy bedzie od razu
        var y = 5;
        System.out.println(++y);
        System.out.println(y);

        //dekrementacja x-- oraz --x

        var greetings = "hello";
        var name = "Magda";

        System.out.println(greetings + ", " + name +". " + "Today is October, " + "13"); //", " - stala tekstowa

    }
}
