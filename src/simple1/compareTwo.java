package simple1;
import java.util.Scanner;
public abstract class compareTwo {

	public static void main(String[] args) {
		try (
		Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter A");
			int A = sc.nextInt();
			System.out.println("Enter B");
			int B = sc.nextInt();
			if(A>B)
				System.out.println("A is greater than B");
			else
				System.out.println("B is greater than A");
		}
		

	}

}
//10.	Write a Java program to compare two numbers. (take user input).