package simple1;
import java.util.Scanner;
public class ageof3 {

	public static void main(String[] args) {
		try (
		Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter age of person1");
			int person1 = sc.nextInt();
			System.out.println("Enter age of person2");
			int person2 = sc.nextInt();
			System.out.println("Enter age of person3");
			int person3 = sc.nextInt();
			//logic for eldest
			if(person1>person3 && person1>person2)
				System.out.println("Person 1 is eldest");
			else if(person2>person3 && person2>person1)
				System.out.println("Person 2 is eldest");
			else
				System.out.println("Person 3 is eldest");
			//logic for youngest
			
			if(person1<person3 && person1<person2)
				System.out.println("Person 1 is youngest");
			else if(person2<person3 && person2<person1)
				System.out.println("Person 2 is youngest");
			else
				System.out.println("Person 3 is youngest");
		}
			
	}

}
//15.	Take input of age of 3 people by user and determine oldest and youngest among them.