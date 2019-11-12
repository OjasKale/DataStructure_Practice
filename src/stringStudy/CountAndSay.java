package stringStudy;

public class CountAndSay {

	
	public static void main(String[] args) {
		String res = countSay(2);
		System.out.println(res);
	}
	
	public static String countSay(int n) {
        String res = "1";
        for(int i = 0; i < n-1; ++i){
            res = countAndSayHelper(res);
        }
        
        return res;
    }
    
    public static String countAndSayHelper(String res){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < res.length();i++){
            int cnt = 1;
            
            while( i + 1 <= res.length()-1 && res.charAt(i) == res.charAt(i+1)){
                i++;
                cnt++;
            }
            sb.append(cnt);
            sb.append(res.charAt(i));
            
        }
        
        return sb.toString();
    }
}
