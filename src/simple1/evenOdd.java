package simple1;
import java.util.Scanner;

public class evenOdd{
	int compareTwo(int A) 
	{
		if(A%2 == 0)
			return 1;
		else
			return 0;
	}

public static void main(String[] args) {
	try (// TODO Auto-generated method stub
	Scanner myObj = new Scanner(System.in)) {
		System.out.println("Enter A");
		int A = myObj.nextInt();
		evenOdd ob = new evenOdd();
		System.out.println("Ans is " + ob.compareTwo(A));
	}
}
}
//19.	Write a Java program to accept a number and check whether the number is even or not. Prints 1 if the number is even or 0 if odd.