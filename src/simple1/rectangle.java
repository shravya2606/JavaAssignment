package simple1;
import java.util.Scanner;
public class rectangle {
	public static void main(String[] args) {
		try (
		Scanner myObj = new Scanner(System.in)) {
			System.out.println("Enter length");
			int length = myObj.nextInt();
			System.out.println("Enter breadth");
			int breadth = myObj.nextInt();
			int area = length*breadth;
			int perimeter = 2 *(length+breadth);
			System.out.println("Area is " + area);
			System.out.println("Perimeter is " + perimeter);
		}
	}

}
//4.	Write a Java program to print the area and perimeter of a rectangle. (use user input).