package simple1;
import java.lang.Math;
public class binToOct {
	int convert(long bin)
	{
		int oct = 0, dec = 0, i = 0;
		while (bin != 0) {
	        dec += (bin % 10) * (Math.pow(2, i));
	        ++i;
	        bin /= 10;
	    }
	    i = 1;

	    
	    while (dec != 0) {
	        oct += (dec % 8) * i;
	        dec /= 8;
	        i *= 10;
	    }
	    return oct; 
	}
public static void main(String[] args) {
	binToOct ob = new binToOct();
	System.out.println("octal number:"
            + ob.convert(100100));
}
}
//8.	Write a Java program to convert a binary number to an octal number.