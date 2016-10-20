package euler0_50;

public class Euler34 {
	
	public static int factorial(int k) {
		int temp = 1;
		for (int m = 1; m <= k; m++ ) {
			temp *= m;
		}
		return temp;
	}
	
	public static void main(String[] args) {
		System.out.println("Starting");
		int sum = 0;
		for (Integer i = 3; i < 1000000 ; i++) {
			int res = 0; int div = 10; int tempi = i;
			for (int j = 0; j < i.toString().length(); j++) {
				int digit = tempi%div;
				tempi /= 10;
				if (i == 145) {
					System.out.println(digit);
				}
				res += factorial(digit);
			}
			if (res == i) {
				System.out.println(i);
				sum += res;
			}
				
		}
		
		System.out.println("done");
		System.out.println(sum);
	}

}
