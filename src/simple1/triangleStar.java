package simple1;

public class triangleStar {

    public static void main(String[] args) {
        int i, j;
        int n = 6;  // Number of rows in the triangle
        // Outer loop for the number of rows
        for (i = 0; i < n; i++) {
            
            // Inner loop to print spaces before the stars
            for (j = n - i; j > 1; j--) {
                System.out.print(" ");
            }

            // Inner loop to print the stars
            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }

            // Move to the next line after completing each row
            System.out.println();
        }
    }
}

//16.	Write a program triangle star Pattern.