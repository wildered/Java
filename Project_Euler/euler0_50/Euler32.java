package euler0_50;

import java.util.ArrayList;


public class Euler32 {
	
	
	public static boolean pandigital(int a, int b) {
		ArrayList<Character> keuze = new ArrayList<Character>();
		for (Integer i = 1; i < 10; i++) {
			keuze.add(i.toString().charAt(0));
		}
		Integer prod = a*b;
		Integer f1 = a;
		Integer f2 = b;
		for (char c : prod.toString().toCharArray()) {
			int templength = keuze.size(); 
			Character d = c;
			keuze.remove(d);
			if (templength == keuze.size()) {return false; }
		}
		for (char c : f1.toString().toCharArray()) {
			int templength = keuze.size(); 
			Character d = c;
			keuze.remove(d);
			if (templength == keuze.size()) {return false; }
		}
		for (char c : f2.toString().toCharArray()) {
			int templength = keuze.size(); 
			Character d = c;
			keuze.remove(d);
			if (templength == keuze.size()) {return false; }
		}
		return true;
	}
	
	public static boolean checkin(int find, ArrayList<Integer> list) {
		for (int search : list) {
			if (find == search) {return true;}
		}
		return false;
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> products = new ArrayList<Integer>();

		
		for (Integer k = 1; k < 9999; k++) {
			for (Integer l = 1; l < 9999; l++) {
				Integer store = k*l;
				if (!checkin(k*l, products) && (k.toString().length() + l.toString().length() + store.toString().length()) == 9) {
					if (pandigital(k, l)) {
						products.add(k*l);
					}
				}
			}
		}
		
//		ArrayList<Character> keuze = new ArrayList<Character>();
//		for (Integer i = 1; i < 10; i++) {
//			keuze.add(i.toString().charAt(0));
//		}
//		
//		Integer prod = 123;
//		for (char c : prod.toString().toCharArray()) {
//			int templength = keuze.size(); 
//			//keuze.remove(c);
//		}
//		keuze.remove(keuze.get(2));
//		
//		Character d = '3';
//		keuze.remove(d);
		System.out.println(products);
		int res = 0;
		for (int m : products) {res += m;}
		System.out.println(res);
	}
	

}
