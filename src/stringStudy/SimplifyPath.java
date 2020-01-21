package stringStudy;

import java.util.Deque;
import java.util.LinkedList;

public class SimplifyPath {

	public static void main(String[] args) {
		String path = "/a//b////c/d//././/..";
		System.out.println(simplifyPath(path));
	}
	
	public static String simplifyPath(String path) {
		//Stack<String> st = new Stack<>();
		//Dequeue<String> st = new LinkedList<>();
		Deque<String> st = new LinkedList<>();
		StringBuilder sb = new StringBuilder();
		//sb.append("/");
		String[] epath = path.split("/");
		for(String dic : epath) {
			if(dic.length() > 0){
				switch (dic) {
				case ".":
					//ignore
					break;
				case "..":
					if(!st.isEmpty()){
						st.removeLast();
					}
				default:
					if(!dic.equalsIgnoreCase("..")){
						st.addLast("/"+dic);
					}
					break;
				}
			}
			
		}
		while(!st.isEmpty()) {
			sb.append(st.removeFirst());
			//sb.append("/");
		}
		//sb.reverse();
		//sb.deleteCharAt(sb.length()-1);
        return sb.length() == 0? "/" : sb.toString();
    }
}
