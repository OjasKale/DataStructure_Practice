package mockPracticeLeetCode;

public class CanConstruct {
	
	public static void main(String[] args) {
		System.out.println(canConstruct("aa","aba"));
	}
	
	public static boolean canConstruct(String ransomNote, String magazine) {
		int[] alpha = new int[128];
		for(Character c : ransomNote.toCharArray()){
			alpha[c]++;
		}
		
		for(Character s : magazine.toCharArray()){
			if(alpha[s] > 0){
				alpha[s]--;
			}
		}
		
		for(int i : alpha){
			if(i > 0){
				return false;
			}
		}
		return true;
    }

}
