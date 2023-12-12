package simple1;
import java.util.Scanner;
public class compareIntegers {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter the first integer: ");
			int firstNumber = sc.nextInt();
			System.out.print("Enter the second integer: ");
			int secondNumber = sc.nextInt();

			int result = compareIntegers(firstNumber, secondNumber);
			System.out.println("Result: " + result);
		}
    }

    private static int compareIntegers(int a, int b){
        if (a == b) 
            return 0;
        else if (a % 6 == b % 6) 
        	return Math.min(a, b);
         else 
            return Math.max(a, b);
        
    }
}

/* 18.	Write a Java program that accepts two integer
 *  values from the user and returns the largest value. However, if the two values are the same, return 0 and find 
 *  the smallest value if the two values have the same remainder when divided by 6. */
 