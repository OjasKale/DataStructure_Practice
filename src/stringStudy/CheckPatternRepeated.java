package stringStudy;

public class CheckPatternRepeated {
	public void main(String[] args) {
		String st = "abab";
		boolean res = repeatedSubstringPattern(st);
		System.out.println(res);
	}
	
    public boolean repeatedSubstringPattern(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));
        
        Character c = s.charAt(0);
        int i = 1;
        while(true) {
            //System.out.println("Here: " + s.charAt(i));
            if(i>=s.length() || c == s.charAt(i)){
                break;
            }
            sb.append(s.charAt(i));
            
            i++;
        }
        int j = i + (sb.length());
        System.out.println("Here: " + i + " && " + j);
        while(j < s.length()) {
            System.out.println("Comparing: " + s.substring(i,j) + " && " + sb.toString());
            if(!sb.toString().equals(s.substring(i,j))) {
                return false;
            }
            i += (sb.length()-1);
            j += (sb.length()-1);
        }
        return true;
    }
}


