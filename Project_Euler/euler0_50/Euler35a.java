package euler0_50;

import java.util.ArrayList;

public class Euler35a {
	
	public static boolean checkPrime(int k) {
		if (k%2 == 0) { return false; }
		else {
			for (int m = 3; m < Math.sqrt(k) + 2; m += 2) {
				if (k%m == 0) { return false; }
			}
			return true;
		}
	}
	
	
	
	public static void main(String[] args) {
		
		int count = 0;
		
		for (Integer  i = 100; i < 1000000; i++) {
			if (checkPrime(i)) {
				boolean flag = true;
				//System.out.println("This is " + i);
				ArrayList<Integer> digits = new ArrayList<Integer>();
				int tempi = i; int groot = i.toString().length(); int tien = 1;
				for (int p = 0; p < groot - 1; p++) {tien *= 10;}
				for (int j = 0; j < groot; j++) {
					int digit = tempi/tien;
					digits.add(digit);
					tempi = tempi%tien;
					tien /= 10;
					//System.out.println(digit);
				}
				int tempsize = digits.size();
				for (int c = 0; c < tempsize; c++) {
					digits.add(digits.get(c));
				}
				//System.out.println(digits);
				for (int pos = 1; pos < tempsize; pos++) {
					int ten = 1; int som = 0;
					for (int p = 0; p < tempsize - 1; p++) {ten *= 10;}
					//System.out.println();
					//System.out.println(ten);
					for (int read = 0; read < tempsize; read++) {
						som += digits.get(pos + read) * ten;
						ten /= 10;
					}
					if (!checkPrime(som)) {flag = false;} 
					//System.out.println("possible   " + som);
					//System.out.println("IS is " + checkPrime(som) + " that it's prime");
					
				}
				if (flag) {count++;}
				//113113
			}
		}
		
		System.out.println(count+13);
		
	}

}
