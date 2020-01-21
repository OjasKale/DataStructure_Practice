package treeStudy;

import java.util.*;

public class WordLadderAproach2 {
	
	public static void main(String[] args) {
		List<String> st = new ArrayList<String>();
		st.add("hot");
		st.add("dot");
		st.add("dog");
		st.add("lot");
		st.add("log");
		st.add("cog");
		String start = "hot";
		String end = "dog";
		
		int res = ladderLength(start,end,st);
		System.out.println(res);
	}

	private static int ladderLength(String start, String end, List<String> st) {
		
		if(!st.contains(end)){
			return 0;
		}
		HashMap<String, List<String>> dic = new HashMap<>();
		//HashSet<String> set = new HashSet<String>(st);
		int L = start.length();
		st.forEach(word -> {
			for(int i=0; i < L; i++){
				String newWord = new String(word.substring(0,i) + '*' + word.substring(i+1,L));
				List<String> currentList = dic.getOrDefault(newWord, new ArrayList<String>());
				currentList.add(word);
				dic.put(newWord, currentList);
			}
		});
		
		Queue<String> q = new LinkedList<String>();
		int res = 0;
		HashSet<String> visited = new HashSet<String>();
		q.offer(start);
		while(!q.isEmpty()){
			String tempWord = q.poll();
			for(int i=0; i<L; i++){
				String newWord = new String(tempWord.substring(0,i) +'*'+tempWord.substring(i+1,L));
				for(String singleWord: dic.getOrDefault(newWord, new ArrayList<String>())){
					if(singleWord.equals(end)){
						return res+1;
					}
					if(!visited.contains(singleWord)){
						visited.add(singleWord);
						q.offer(singleWord);
					}
				}
			}
			
			res++;
		}
		return res;
	}

}
