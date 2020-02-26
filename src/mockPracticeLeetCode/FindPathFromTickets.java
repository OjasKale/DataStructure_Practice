package mockPracticeLeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;

public class FindPathFromTickets {
	public static void main(String[] args) {
		List<List<String>> inp = new ArrayList<>();
		
		List<String> in1 = new ArrayList<>();
		in1.add("JFK");
		in1.add("KUL");
		inp.add(in1);
		
		List<String> in2 = new ArrayList<>();
		in2.add("JFK");
		in2.add("NRT");
		inp.add(in2);
		
		List<String> in3 = new ArrayList<>();
		in3.add("NRT");
		in3.add("JFK");
		inp.add(in3);
		
//		List<String> in4 = new ArrayList<>();
//		in4.add("LHR");
//		in4.add("SFO");
//		inp.add(in4);
		
//		List<String> in5 = new ArrayList<>();
//		in5.add("ATL");
//		in5.add("SFO");
//		inp.add(in5);
		
		List<String> res = findItinerary(inp);
		System.out.println(res);
	}
	
	public static List<String> findItinerary(List<List<String>> tickets) {
		List<String> res = new ArrayList<>();
		HashMap<String, PriorityQueue<String>> map = new HashMap<>();
		
		for (List<String> list : tickets) {
			//System.out.println(list);
			if(map.containsKey(list.get(0))){
				PriorityQueue<String> pq = map.getOrDefault(list.get(0), new PriorityQueue<String>( (a,b) -> (lexicalOrder(a,b))) );
				pq.offer(list.get(1));
			}else{
				PriorityQueue<String> pq = new PriorityQueue<>();
				pq.offer(list.get(1));
				map.put(list.get(0), pq);
			}
			
		}
		String V = "JFK";
		HashSet<String> visited = new HashSet<String>();
		DFS(V, visited, map, res);
        return res;
    }

	private static void DFS(String v, HashSet<String> visited, HashMap<String, PriorityQueue<String>> map, List<String> res) {
		visited.add(v);
		
		
		PriorityQueue<String> itr = map.get(v);
		while(itr != null && itr.peek() != null){
			//System.out.println(itr.peek());
			String n = itr.poll();
			//if(map.containsKey(n)){
				DFS(n,visited,map,res);
			//}
		}
		res.add(0,v);
	}
	
	public static int lexicalOrder(String s1, String s2){
		int num1=0,num2=0;
		for(int i=0; i < s1.length(); i++){
			num1 += Character.getNumericValue(s1.charAt(i));
		}
		for(int j=0; j < s2.length(); j++){
			num2 += Character.getNumericValue(s2.charAt(j));
		}
		return Integer.compare(num1, num2);
	}
}
