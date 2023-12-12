package simple1;
import java.util.Scanner;
public class tables {

	public static void main(String[] args) {
		try (
		Scanner myObj = new Scanner(System.in)) {
			System.out.println("which table do u want?!");
			int a = myObj.nextInt();
			for(int i = 1; i<=10; i++)
			{
				int c = i*a;
				System.out.println(a + "*" + i +"=" + c );
			}
		}
	}
}
//3.	Write a Java program that takes a number as input and prints its multiplication table up to 10. (Hint- use Loop).