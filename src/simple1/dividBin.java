package simple1;

public class dividBin {

	static String div_bin(String x, String y)
	{
		int n1 = Integer.parseInt(x,2);
		int n2 = Integer.parseInt(y,2);
		int divide = n1 / n2;
		String result = Integer.toBinaryString(divide);
		
		return result;
	}


public static void main(String[] args) {
	
	String x = "11111", y = "00010";
	 
    System.out.print(div_bin(x, y));

}
}
//7.	Write a Java program to add two binary numbers and divide them. (both in different program).