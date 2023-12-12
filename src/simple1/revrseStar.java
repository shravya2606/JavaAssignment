package simple1;

public class revrseStar {

    public static void main(String[] args) {
        int number = 6;
        int i = number, j;

        // Outer loop for the number of rows
        while (i > 0) {
            j = 0;

            // Inner loop to print spaces before the stars
            while (j++ < number - i) {
                System.out.print(" ");
            }

            j = 0;

            // Inner loop to print the stars
            while (j++ < (i * 2) - 1) {
                System.out.print("*");
            }

            // Move to the next line after completing each row
            System.out.println();

            // Decrement the row counter
            i--;
        }
    }
}

//17.	Write a program on reverse star pattern.