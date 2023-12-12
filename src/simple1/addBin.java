package simple1;

public class addBin {

    static String add_bin(String x, String y)
    {
        // Convert binary strings to decimal integers
        int n1 = Integer.parseInt(x, 2);
        int n2 = Integer.parseInt(y, 2);

        // Calculate the sum of the decimal integers
        int sum = n1 + n2;

        // Convert the sum back to a binary string
        String result = Integer.toBinaryString(sum);

        // Return the binary sum
        return result;
    }

    public static void main(String[] args) {

        String x = "11111", y = "00000";
        System.out.print(add_bin(x, y));
    }
}

//7.	Write a Java program to add two binary numbers and divide them. (both in different program).