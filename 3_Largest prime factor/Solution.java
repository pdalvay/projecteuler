import java.util.Scanner;
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long x =fermat(n);
        System.out.println(x+","+(n/x));
    }
    public static long fermat(long n){
    	long a = (long) Math.ceil(Math.sqrt(Double.valueOf(String.valueOf(n))));
    	long b2 = a*a - n;
    	double sqrt = Math.sqrt(b2);
    	long x = (long) sqrt;
    	while(!(Math.pow(sqrt,2) == Math.pow(x,2))){
    		a = a+1;
    		b2 = a*a - n;
        	sqrt = Math.sqrt(b2);
        	x = (long) sqrt;
    	}
    	return (a - (long)Math.sqrt(b2));
    }
}
