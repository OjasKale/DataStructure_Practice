package mockPracticeLeetCode;

public class CheckToken {
	public static void main(String[] args) {
		System.out.println(checkRecord("PPALLP"));
	}
	
	public static boolean checkRecord(String s){
		int aCount = 0;
        int j = 1;
        for(int i = 0; i < s.length(); i++){
            // if(s.charAt(i) == 'P'){
            //     System.out.println("This is P");
            // }else if(s.charAt(i) == 'A'){
            //     System.out.println("This is A");
            // }else if(s.charAt(i) == 'L'){
            //     System.out.println("This is L");
            //}
            
            if(s.charAt(i) == 'A' && aCount > 0){
                System.out.print("Return FFFf " + i);
                return false;
            }else if(s.charAt(i) == 'A'){
                System.out.println("Increasing at!!" + i);
                aCount++;
            }
            
            if(s.charAt(i) == 'L'){
                while(j < s.length() && s.charAt(j) == 'L'){
                    j++;
                }
                if((j - i) >= 3){
                    System.out.println("returning false bcz of L conditions " + i + " && " + j);
                    return false;
                }else{
                    i = j;    
                }
                j++;
            }
        
        }
        return true;
	}
}
