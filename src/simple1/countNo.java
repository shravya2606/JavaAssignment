package simple1;

import java.util.Scanner;

public class countNo {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            
            System.out.println("Enter a string:");
            String input = scanner.nextLine();

            countCharacters(input);
        }
    }

    // Method to count letters, spaces, numbers, and other characters in a string
    private static void countCharacters(String input) {
        int letterCount = 0;
        int spaceCount = 0;
        int numberCount = 0;
        int otherCount = 0;

        // Loop through each character in the input string
        for (char c : input.toCharArray()) {
            // Check if the character is a letter
            if (Character.isLetter(c)) {
                letterCount++;
            }
            // Check if the character is a digit 
            else if (Character.isDigit(c)) {
                numberCount++;
            }
            // Check if the character is a space 
            else if (Character.isWhitespace(c)) {
                spaceCount++;
            }
            // The character is neither a letter, digit, nor space, so it's considered "other"
            else {
                otherCount++;
            }
        }

        // Display the counts of each category
        System.out.println("Letter count: " + letterCount);
        System.out.println("Number count: " + numberCount);
        System.out.println("Space count: " + spaceCount);
        System.out.println("Other character count: " + otherCount);
    }
}
