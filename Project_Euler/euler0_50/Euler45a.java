package euler0_50;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Euler45a {
	
	
	public static void main(String[] args) {
		
		
		//System.out.println("Enter information: ");
		
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);
		
		//int n = scan.nextInt();
		int n = 1000000;
		
		ArrayList<Long> tlist = new ArrayList<Long>();
		ArrayList<Long> plist = new ArrayList<Long>();
		ArrayList<Long> hlist = new ArrayList<Long>();
		
		
		for (long i = 0; i <= n; i++) {
			
			long tri = i*(i+1)/2;
			long pent = i*(3*i-1)/2;
			long hex = i*(2*i-1);
			
			tlist.add(tri);
			plist.add(pent);
			hlist.add(hex);
			
			
		}
		
		for (long a : hlist) {
			if (plist.contains(a)) {
				if (tlist.contains(a) && a > 40755) {
					System.out.println("" + a);
					break;
				}
			}
			
		}
		
		
		System.out.println("Done");
		
		
		scan.close();
		
		
		
	}
	

}
