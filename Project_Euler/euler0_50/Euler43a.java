package euler0_50;


import java.util.ArrayList;

public class Euler43a {
	
	
	public static ArrayList<ArrayList<Integer>> genList(ArrayList<Integer> list) {
		ArrayList<ArrayList<Integer>> master = new ArrayList<ArrayList<Integer>>();
		if (list.size() == 1) {
			ArrayList<Integer> sub = new ArrayList<Integer>();
			sub.add(list.get(0));
			master.add(sub);
			return master;
		}
		else {
			int idx = 0;
			for (int el : list) {
				//ArrayList<Integer> sub = new ArrayList<Integer>();
				ArrayList<Integer> templist = new ArrayList<Integer>(list);
				templist.remove(idx);
				idx++;
				ArrayList<ArrayList<Integer>> tempel = genList(templist);
				for (ArrayList<Integer> kal : tempel) {
					kal.add(0, el);
					master.add(kal);
				}
					
			}
			
			return master;
		}
	}
	
	
	public static long join(ArrayList<Integer> list) {
		
		long res = 0;
		long base = 1;
		for (int idx = list.size()-1; idx >= 0; idx--) {
			res += list.get(idx)*base;
			base *= 10;
		}
		return res;
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		long count = 0;
		
		ArrayList<Integer> res = new ArrayList<Integer>(1);
		for (int k = 0; k < 10; k++) {res.add(k); }
		ArrayList<ArrayList<Integer>> full = genList(res);
		int[] divlist = new int[7];
		divlist[0] = 2; divlist[1] = 3; divlist[2] = 5; divlist[3] = 7; divlist[4] = 11; divlist[5] = 13; divlist[6] = 17;
		
		for (ArrayList<Integer> number : full) {
			if (number.get(0) == 0) {;}
			else {
				
			boolean snake = true;
			for (int start = 1; start < 8; start++) {
				Integer som = number.get(start)*100 + number.get(start+1)*10 + number.get(start+2);
				
				int div = divlist[start-1];
				
//				if (number == full.get(486150)) {
//					
//					System.out.println(number + " index is " + full.indexOf(number));
//					System.out.println("The sum is " + som);
//					System.out.println(div + " is the div");
//					
//					}
				
				if (som%div != 0) {
					snake = false;
					break;
				}
				
			}
			if (snake) {count += join(number); 
			//System.out.println("the number is " + number + " which is equal to " + join(number));
			}
		}
		}
		//1406357289
		System.out.println("the count is = "+ count);
		
		
		

	}

}
