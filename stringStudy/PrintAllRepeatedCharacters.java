package stringStudy;

public class PrintAllRepeatedCharacters {
	public static void main(String[] args) {
		String s = "abbccsea";
		printAllRepetsInString(s);
	}

	private static void printAllRepetsInString(String s) {
		boolean[] checkArr = new boolean[128]; //Assuming this Sting would have only ASCII characters.
		
		for(int i=0; i < s.length();++i){
			char ch = s.charAt(i);
			if(checkArr[ch-'a']){
				System.out.println(ch);
			}else{
				checkArr[ch-'a'] = true;
			}
		}
	}
	
	
}
