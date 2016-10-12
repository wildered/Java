package euler0_50;

public class Euler33a {
	
	
	public static void main(String[] args) {
		double res = 1;
		
		for (int den = 11; den < 100; den++) {
			if (den%10 != 0) {
				for (int nom = 11; nom < den; nom++) {
					double tempnom = nom;
					double tempden = den;
					double fraction = tempnom/tempden;
					double nomfirst = nom/10;
					double nomlast = nom%10;
					double denfirst = den/10;
					double denlast = den%10;
					if (nomfirst == denfirst && fraction == nomlast/denlast) {
						System.out.println("this is " + nom + " / "  + den);
						res *= denlast;
					}
					else if (nomfirst == denlast && fraction == nomlast/denfirst) {
						System.out.println("this is " + nom + " / "  + den);
						res *= denfirst;
					}
					else if (nomlast == denfirst && fraction == nomfirst/denlast) {
						System.out.println("this is " + nom + " / "  + den);
						res *= denlast;
					}
					else if (nomlast == denlast && fraction == nomfirst/denfirst) {
						System.out.println("this is " + nom + " / "  + den);
						res *= denfirst;
					}
					
				}
				
			}

		}
		System.out.println("Done");
		System.out.println("2^6  + 13 * 5 + 5 * 19 + 2^5 * 3   " + 2*2*2*2*2*2*3*5*13*19 + "    " + 64*65*95*98);
		System.out.println(4*5*5*2);
	}

}
