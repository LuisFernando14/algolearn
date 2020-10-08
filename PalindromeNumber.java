import java.util.Scanner;

class PalindromeNumbner {
    /**
     * Determinate if the integer "x" is palindrome. The trick here is to do it
     * without converting the param to string
     */

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int x = read.nextInt();
        boolean result = isPalindrome(x);
        System.out.println(result);
        read.close();
    }

    public static boolean isPalindrome(int x) {
        int aux = x;
        int newInteger = 0;
        int lastDigit = 0;
        while (aux > 0) {
            lastDigit = aux % 10;
            newInteger = (newInteger * 10) + lastDigit;
            aux = aux / 10;
        }
        return x == newInteger;
    }

    /**
     * What is the difference between an abstract class and an interface in java?
     * https://www.edureka.co/blog/difference-between-abstract-class-and-interface
     * 
     * 
     * 
     */

}