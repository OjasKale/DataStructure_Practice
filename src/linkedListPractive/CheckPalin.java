package linkedListPractive;

public class CheckPalin {

	public static void main(String[] args) {
		
	}
	
	public static int lPalin(ListNode A) throws Exception{
		if(A == null)
            return 0;
        StringBuilder st = new StringBuilder();
        while(A != null){
            st.append(A.data);
            A = A.next;
        }
        int mid = st.length() /2;
        if(st.length()%2 != 0){
            System.out.println("Yo");
            System.out.println(st.substring(0, mid+1));
            StringBuilder stb = new StringBuilder(st.substring(mid, st.length()));
            System.out.println(stb.reverse());
            if((st.substring(0, mid+1)).equals(stb.reverse().toString())){
                return 1;
            }else{
                return 0;
            }
        }else{
            System.out.println("Jo");
            System.out.println(st.subSequence(0, mid));
            System.out.println(st.subSequence(mid, st.length()));
            StringBuilder stb = new StringBuilder(st.substring(mid, st.length()));
            if((st.substring(0, mid)).equals(stb.reverse().toString())){
                return 1;
            }else{
                return 0;
            }
        }
    }
	
}
