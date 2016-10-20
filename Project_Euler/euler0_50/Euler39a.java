package euler0_50;

public class Euler39a {
	
	
	
	public static void main(String[] args) {
		int max = 0;
		int p = 0;
		for (int i = 1000; i > 1; i--) {
			int count = 0;
			for (int c = 1; c < i; c++) {
				for (int a = 1; a < i-c+1; a++) {
					//a, c, b = i-a-c
					if (a*a + (i-a-c)*(i-a-c) == c*c) {
						count++;
					}
				}
			}
			if (count > max) {
				max =  count;
				p = i;
			}
		}
		System.out.println("p = " + p +  " count = " + max);
	}

}
