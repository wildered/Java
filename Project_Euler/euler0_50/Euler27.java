package euler0_50;

import java.util.ArrayList;
import java.util.HashMap;

public class Euler27 {
	static HashMap<Long, Boolean> d = new HashMap<Long, Boolean>();
	
	public static boolean prime(long n){
		if (d.containsKey(n)){
			return d.get(n);
		}
		if (n%2 == 0 ){
			d.put(n, false);
			return false;
		}
		if (n < 1){
			return false;
		}
		if (n == 1){
			d.put(n, false);
			return false;
		}
		for (long i = 3; i*i <= n; i += 2){
			if (n%i == 0){
				d.put(n, false);
				return false;
			}
		}
		d.put(n, true);
		return true;
	}
	
	public static long func(long a, long b, long n){
		return n*n + a*n + b;
	}
	
	public static void main(String[] args){
		
		long Starttime = System.currentTimeMillis();
		//ArrayList<Integer> d = new ArrayList<Integer>();
		//HashMap<Integer, Boolean> e = new HashMap<Integer, Boolean>();
		long end = 0;
		long max_n = 0;
		long a_out = 0;
		long b_out = 0;
		for (long k = -999; k < 1000; k++){
			for (long l = 1000; l >= Math.max(2, 2-2-max_n*max_n-max_n*k); l--){
				if (prime(l)){
					long n = 0;
					long res = func(k, l, n);
					while (res >= 0 && prime(res)){
						n++;
						res = func(k, l, n);
					}
					if (n > max_n){
						end = k*l;
						max_n = n;
						a_out = k;
						b_out = l;
					}
				}
				if (max_n > l){
					break;
				}
			}
		}
		System.out.println(prime(338));
		System.out.println(end);
		System.out.println("a " + a_out);
		System.out.println("b " + b_out);
		System.out.println(System.currentTimeMillis()-Starttime + "ms");
	}
}
