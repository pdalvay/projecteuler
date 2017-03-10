import java.util.Scanner;
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
        int i=999;
        int j=999;
        int max = 0;
        while(i>1){
        	j=999;
            while(j>1){
            	if(isPal(i*j)){
            		if(i*j > max){
            			max = i*j;
            		}
            	}
            	j--;
            }
            i--;
        }
        System.out.println(max);
    }

	private static boolean isPal(int i) {
		int x =i;
		int ifin = 0;
		while(x>0){
			ifin = ifin*10 + x%10;
			x/=10;
		}
		if(i==ifin) return true;
		return false;
	}
}
