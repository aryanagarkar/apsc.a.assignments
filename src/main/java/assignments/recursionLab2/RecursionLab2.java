//Arya Nagarkar
//Recursion lab 2
//AP computer science A
//Mr. Woffindin
//3-16-20
package assignments.recursionLab2;

import java.util.Scanner;

public class RecursionLab2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input a string");
        String word = scanner.nextLine();
        System.out.println();
        System.out.println("This is for the reverse function: ");
        System.out.println(word + " reversed is " + reverse(word));
        System.out.println();

        System.out.println("This is for the isPalindrome function: ");
        if (isPalindrome(word) == true) {
            System.out.println(word + " is a palindrome");
        } else {
            System.out.println(word + " is not a palindrome");
        }
        System.out.println();
    }

    public static String reverse(String word) {
        if (word.isEmpty()) {
            return word;
        } else {
            return reverse(word.substring(1)) + word.charAt(0);
        }
    }

    public static boolean isPalindrome(String word) {
        /*String reverse = reverse(word);
        if (word.equals(reverse)) {
            return true;
        } else {
            return false;
        }*/

        if (word.length() == 1) {
            return true;
        }
        if (word.length() == 2) {
            if (word.charAt(0) == word.charAt(1)) {
                return true;
            } else {
                return false;
            }
        }
        if (word.charAt(0) == word.charAt(word.length() - 1)) {
            String subString = word.substring(1, word.length() - 1);
            return isPalindrome(subString);
        } else {
            return false;
        }
    }
}
