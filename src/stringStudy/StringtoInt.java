package stringStudy;

public class StringtoInt {

	
	public static void main(String[] args) {
		String inp = "                  213978";
		System.out.println(myAtoi(inp));
	}
	public static int myAtoi(String str) {
        int num = 0;
        boolean isNegative = str.indexOf('-') == -1 ? false : true ;
        
        for(int i = 0; i < str.length(); i++){
        	if(Character.isDigit(str.charAt(i))){
            	num = num * 10 + Character.getNumericValue(str.charAt(i));
        	}
        }
        
        if(isNegative){
        	num *= -1;
        }
        return num;
    }
}
