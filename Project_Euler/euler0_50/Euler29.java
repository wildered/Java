package euler0_50;
import java.util.HashSet;
import java.util.TreeSet;


public class Euler29 {
	public static void main(String[] args){
		long start = System.currentTimeMillis();
		HashSet<Integer> s = new HashSet<Integer>();
		
		for (int a = 2; a < 101; a++){
			for (int b = 2; b < 101; b++){
				s.add((int) Math.pow(a, b));
			}
		}
		System.out.println(s.size());
		System.out.println(System.currentTimeMillis()-start + "ms");		
	}
}


