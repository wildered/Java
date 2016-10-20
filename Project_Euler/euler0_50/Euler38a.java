package euler0_50;
import java.util.ArrayList;

public class Euler38a {
	
	public static int power(int base, int exp) {
		int res = 1;
		for (int k = 0; k < exp; k++) {
			res *= base;
		}
		return res;
	}
	
	public static boolean isPan(Integer number) {
		char[] arr = number.toString().toCharArray();
		CharSequence zero = "0";
		if (number.toString().contains(zero)){ return false;}
		int size = number.toString().toCharArray().length;
		for (int idx = 0; idx < size; idx++) {
			for (int kdx = 0; kdx < size; kdx++) {
				if (idx != kdx && arr[idx] == arr[kdx]) {
					return false;
				}
			}
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		int max = 1;
		//case first = 1 digit
		for (Integer first = 9999; first > 9160; first--) {
			String res = "";
			int n = 1;
			while (res.length() <9) {
				Integer erbij = first * n;
				res += erbij.toString();
				n++;
			}
			if (res.length() == 9) {
				if (isPan(Integer.parseInt(res))) {
					if (Integer.parseInt(res) > max){
						 max = Integer.parseInt(res);
					}
					
					
				}
			}
			
		}
		System.out.println(max);
		
				
	}

}
