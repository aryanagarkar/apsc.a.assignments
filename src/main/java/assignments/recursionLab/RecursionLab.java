//Arya Nagarkar
//Recursion lab
//AP computer science A
//Mr. Woffindin
//3-10-20

package assignments.recursionLab;

import java.util.Scanner;

public class RecursionLab {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      
      System.out.println("This is for the power function: ");
      System.out.println("What number do you want to raise to a power?");
      int n = scanner.nextInt();
      System.out.println("What power do you want to raise it too?");
      int pow = scanner.nextInt();
      
      System.out.println("The number " + n + " raised to the power of " + pow +
              " is " + power(n, pow));
      System.out.println();
      
      System.out.println("This is for the fibonacci function: ");
      System.out.println("What number of the fibonacci sequence do you want to know?");
      int fibnum = scanner.nextInt();
      
      System.out.println("The " + fibnum + 
              "th number of the fibonacci sequence is " + 
              fibonacciNumber(fibnum));
    }
    
    public static int power(int num, int power){
        if(power == 0){
            return 1;
        }
        else{
            return num * power(num, power -1);
        }
    }
    
    public static int fibonacciNumber(int num){
	if(num == 1){
            return 0;
	}
	if(num == 2 || num == 3){
	    return 1;
        }
        else{
	return fibonacciNumber(num-2) + fibonacciNumber(num-1);
        }
	}
}
