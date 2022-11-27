public class PalindromZadanie {

    public static void main(String[] args) {

        /*String word = "racecar";

        char[] converted = word.toCharArray();

        for (int i = converted.length - 1; i >=0; i--)
            System.out.println(converted[i]);
            do porownania equals
            */

        var text = "racecar";
        if (isPalindrome(text)) {
            System.out.println(text + " is palindrome");
        } else {
            System.out.println(text + " is not a palindrome");
        }
    }

        private static boolean isPalindrome(String text) {
            var len = text.length();
            for (int i =0; i <= len / 2; i++){ //pozycja litery
                if (text.charAt(i) != text.charAt(len - i - 1)) {
                    return false;
                }
            }
            return true;
        }
    }
/*
break - wychodizmy zupelnie z petli
continue - przejdz do nastepnej nie sprawdzajac kodu
 */
