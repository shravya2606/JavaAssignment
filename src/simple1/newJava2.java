package simple1;
import java.util.Scanner;
public class newJava2{
	public static void main(String[] args) {
	
	try (Scanner myObj = new Scanner(System.in)) {
		System.out.println("Enter A & B");
		
		int a = myObj.nextInt();
		int b = myObj.nextInt();
		
		int c = a + b;
		int d = a - b;
		int e = a *  b;
		int f = a/b;
		System.out.println("Sum = " + c);
		System.out.println("Substraction = " +d);
		System.out.println("Multiplication = " + e);
		System.out.println("Division = " + f);
	}
	
	
	}

}
//1.	Write a Java program to print the sum of two numbers, subtraction, multiplication, division. (normal way)   
//2.	For above program take input from user.
