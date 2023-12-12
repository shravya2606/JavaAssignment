package simple1;
import java.util.Scanner;

public class asciiCh {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a character: ");
            
            // Read the first character entered by the user
            char inputChar = scanner.next().charAt(0);

            // Convert the character to its ASCII value
            int asciiValue = (int) inputChar;

            // Display the ASCII value of the entered character
            System.out.println("ASCII value of '" + inputChar + "' is: " + asciiValue);
        }
    }
}

//12.	Write a Java program to print the ASCII value of a given character.