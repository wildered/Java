package euler0_50;
import java.util.ArrayList;

public class euler26 {
	public static int loop(int n){
		int res = 10;
		ArrayList<Integer> ares = new ArrayList<Integer>();
		int val;
		while (res%n != 0){
			ares.add(res%n);
			res = 10*(res%n);
			if (ares.contains(res%n)){
				val = ares.size()-ares.indexOf(res%n);
				return val;
			}
		}
		return 0;
	}

	public static void main(String[] args){
		long startTime = System.currentTimeMillis();
		int max_val = 0;
		int out_n = 0;
		int val;
		for (int i = 1; i < 1000; i++){
			val = loop(i);
			if (val >= max_val){
				max_val = val;
				out_n = i;
			}
		}
		long stopTime = System.currentTimeMillis();
		long elapsedTime = stopTime - startTime;
		System.out.println(out_n);
		System.out.println(elapsedTime);	
		
	}
}


