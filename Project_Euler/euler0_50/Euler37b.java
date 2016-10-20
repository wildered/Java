package euler0_50;

public class Euler37b {
	
	public static boolean isPrime(int k) {
		if (k == 2) {return true; }
		else {
		if (k%2 == 0 || k == 1) { return false; }
		else if (k == 3) {return true; }
		else {
			for (int m = 3; m < Math.sqrt(k) + 2; m += 2) {
				if (k%m == 0) { return false; }
			}
			return true;
		}
	}
	}
	
	public static boolean test(Integer k) {
		//van links naar rechts
		int lang = k.toString().length(); int tien = 1; Integer temp = k;
		for (int i = 0; i < lang-1; i++) { tien *= 10; }
		while (temp.toString().length() != 1) {
				temp = temp%tien;
				tien /= 10;
				//System.out.println("current" + temp);
				if (!isPrime(temp)) {return false;}

		}
		Integer tijde = k;
		while (tijde.toString().length() != 1) {
				tijde = tijde/10;
				//System.out.println("current" + tijde);
				if (!isPrime(tijde)) {return false;}

		}
		return true;
	}
	
	
	public static void main(String[] args) {
		int res = 0;
		for (int a = 11; a < 1000000; a += 2) {
			if (isPrime(a)) {
				if (test(a)) {
					//System.out.println(a);
					res += a;
				}
				
			}
		}
		System.out.println("final sum = " + res);
	}
	
	

}
