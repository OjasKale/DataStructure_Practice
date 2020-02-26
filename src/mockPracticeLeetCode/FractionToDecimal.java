package mockPracticeLeetCode;

public class FractionToDecimal {

	public static void main(String[] args) {
		int a = 2;
		int b = 3;
		System.out.println(fractionToDecimal(a,b));
	}
	
	public static String fractionToDecimal(int numerator, int denominator) {
		Double a = 1.0 * numerator;
		Double b = 1.0 * denominator;
		Double ans = a/b;
		StringBuilder sb = new StringBuilder(ans+"");
		int ind = sb.indexOf(".");
		while(ind < sb.length()){
			
		}
		
		return ans+"";
    }
	
}
