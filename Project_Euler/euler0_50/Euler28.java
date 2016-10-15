package euler0_50;

public class Euler28 {
	
	public static void main(String[] args){
		long value = 1;
		long res = 1;
		long start = System.currentTimeMillis();
		
		for (long extra = 2; extra < 1001; extra += 2){
			value += extra;
			res += value;
			value += extra;
			res += value;
			value += extra;
			res += value;
			value += extra;
			res += value;
		}
		
		long Elapsedtime = System.currentTimeMillis() - start;
		System.out.println("res = " + res);
		System.out.println(Elapsedtime + "ms");
	}

}
