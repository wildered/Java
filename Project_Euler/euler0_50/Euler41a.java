package euler0_50;

public class Euler41a {
	
	public static boolean isPrime(int k) {
		if (k%2 == 0) { return false; }
		else {
			for (int m = 3; m < Math.sqrt(k) + 2; m += 2) {
				if (k%m == 0) { return false; }
			}
			return true;
		}
	}
	
	public static boolean isPan(Integer number) {
		char[] arr = number.toString().toCharArray();
		int size = number.toString().toCharArray().length;
		for (int idx = 0; idx < size; idx++) {
			for (int kdx = 0; kdx < size-1; kdx++) {
				if ((idx != kdx && arr[idx] == arr[kdx]) || arr[idx] == '0' || arr[idx] == '9'|| arr[idx] == '8') {
					return false;
				}
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		//System.out.println("is prime" + isPrime(7652413));
		int count = 0;
		for (int i = 7654321; i > 0; i--) {
			if (isPrime(i)) {
				count++;
				if (count == 100) {
					//System.out.println(i + " is prime");
					count = 0;
				}

				if (isPan(i)) {
					System.out.println(i + " is pandigit and prime");
					return;
				}
			}
		}
	}

}
