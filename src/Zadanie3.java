public class Zadanie3 {
    public static void main(String[] args) {
        var x = -3;

        if (x % 2 == 0) {
            System.out.println(x + " " + "Is even");

        } else {
            System.out.println(x + " " + "Is odd");
        }

        var y = 2;

        if ((y % 2 == 0) && (y < 20)) {
            System.out.println(y + " " + "Is odd and lower than 20");

        } else {
            System.out.println(y + " " + "is not odd and lower than 20");
        }

        var z = 22;
        //if number is odd and greater or equal than 20 print 'number is odd and value and 20 or more"

        if ((z % 2 == 0) && (z >= 20)) {
            System.out.println(z + " " + "number is odd and value and 20 or more");
        } else {
            System.out.println(z + " " + "number is not odd and value and 20 or more");
        }
        //if number is even print "number x is even"
        var s = 13;
        if (s % 2 == 1) {
            System.out.println(s + " " + "is even");
        } else {
            System.out.println(s + " " + "is not even");
        }

        //of number is negative print "number is negative"
        var t = -11;
        if (t < 0) {
            System.out.println(t + " " + "is negative");
        } else {
            System.out.println(t + " " + "is not negative");

        }
    }
}



