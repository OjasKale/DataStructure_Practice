package stringStudy;

public class IntToString {
	
	public static void main(String[] args) {
		int num = -33;
		String res = convertIntToString(num);
		System.out.println(res);
	}
	
	private static String convertIntToString(int num) {
		StringBuilder sb = new StringBuilder();
		boolean isNegative = (num < 0);
		num = Math.abs(num);
		do{
			sb.append(num%10);
			num = num / 10;
		}while(num != 0);
		
		if(isNegative){
			sb.append("-");
		}
		sb = sb.reverse();
		return sb.toString();
	}


}
