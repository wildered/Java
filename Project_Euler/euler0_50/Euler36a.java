package euler0_50;

public class Euler36a {
	
	
	
	public static void main(String[] args) {
		int sum = 0;
		
		for (Integer i = 1; i < 1000000; i++) {
			String bin = Integer.toBinaryString(i);
			String dec = i.toString();
			boolean palindrome = true;
			int binlang = bin.length(); int declang = dec.length();
			for (int kdx = 0; kdx < declang/2; kdx++){
				//System.out.println("hakki");
				if (dec.charAt(kdx) != dec.charAt(declang-1-kdx)) {palindrome = false; }
			}
			if (palindrome) {
				for (int idx = 0; idx < binlang/2; idx++){
					if (bin.charAt(idx) != bin.charAt(binlang-1-idx)) {palindrome = false; }
				}
			}
			if (palindrome) { sum += i; }

		}
		System.out.println(sum);
	}

}
