package euler0_50;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Euler44solve {
	
	
	public static void main(String[] args) {
		
		//System.out.println("Enter how far to calculate numbers: ");
		
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);
		
		//int n = scan.nextInt();
		int n = 3000;
		
		ArrayList<Long> list = new ArrayList<Long>();
		long min = n*(3*n+1)/2;
		
		for (int i = 1; i <= n; i++) {
			long pent = i*(3*i-1)/2;
			
			list.add(pent);
			
		}
		
		for (long a : list){
			for (long k : list) {
				if(a == k) {continue; }
				long sum = a + k;
				long diff = a - k;
				if (list.contains(sum) && list.contains(diff)) {
					//System.out.println( "DEBUG");
					if (diff < min) min = diff;
				}
			}
			
		}
		
		System.out.println("The value is: " + min);
		
		
		
		
		
		scan.close();
		
		
	}
	

}
