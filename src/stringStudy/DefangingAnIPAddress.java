package stringStudy;

public class DefangingAnIPAddress {

	public static void main(String[] args) {
		String S = "172.16.54.33";
		
		String res = defangIPaddr(S);
		
		System.out.println(res);
	}

	private static String defangIPaddr(String address) {
		int numOfPeriods = 0;
        for(char c: address.toCharArray()){
            if(c == '.'){
                numOfPeriods++;
            }
        }
        int index = address.length() + (2 * numOfPeriods);
        StringBuilder sb = new StringBuilder();
        sb.setLength(index);
        index = index-1;
        for(int j = address.length()-1; j >= 0; j--){
        	if(address.charAt(j) == '.'){
        		sb.setCharAt(index, ']');
        		sb.setCharAt(index-1, '.');
        		sb.setCharAt(index-2, '[');
        		index -= 3;
        	}else{
        		sb.setCharAt(index, address.charAt(j));
        		index--;
        	}
        }
        
        
		return sb.toString();
	}
	
}
