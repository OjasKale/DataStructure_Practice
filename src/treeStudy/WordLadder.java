package treeStudy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


import javafx.util.Pair;

public class WordLadder {
	
	public static HashMap<String, List<String>> WORDMAP = new HashMap<>();
	
	public static void main(String[] args) {
		List<String> st = new ArrayList<String>();
		st.add("hot");
		st.add("dot");
		st.add("dog");
		st.add("lot");
		st.add("log");
		st.add("cog");
		String start = "hit";
		String end = "dog";
		
		int res = ladderLength(start,end,st);
		System.out.println(res);
	}
	
	
public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
		
	
		if(!wordList.contains(beginWord)){
			wordList.add(beginWord);
		}
			
		if(!wordList.contains(endWord)){
			return 0;
		}
			
		//System.out.println("After: " + wordList);
		
		for(int i=0; i < wordList.size(); i++){
			for(int j=i+1; j < wordList.size(); j++){
				//System.out.println("Matching: " + wordList.get(i) + " && " + wordList.get(j) + " Where I & J is " + i + "<>" + j);
				if(CheckOneEditAway(wordList.get(i), wordList.get(j))){
					//System.out.println("Matched!!!" + wordList.get(i) + " && " + wordList.get(j));
					List<String> wrd1 = WORDMAP.getOrDefault(wordList.get(i), new ArrayList<>());
					wrd1.add(wordList.get(j));
					//System.out.println("For " + wordList.get(i) + " List is: " + wrd1);
					WORDMAP.put(wordList.get(i), wrd1);
					
					List<String> wrd2 = WORDMAP.getOrDefault(wordList.get(j), new ArrayList<>());
					wrd2.add(wordList.get(i));
					//System.out.println("For " + wordList.get(j) + " List is: " + wrd2);
					WORDMAP.put(wordList.get(j), wrd2);
				}else{
					if(!WORDMAP.containsKey(wordList.get(i))){
						WORDMAP.put(wordList.get(i), new ArrayList<>());
					}
					if(!WORDMAP.containsKey(wordList.get(j))){
						WORDMAP.put(wordList.get(j), new ArrayList<>());
					}
				}
				
			}
		}
		
		List<String> visited = new ArrayList<>();
		Queue<Pair<String, Integer>> q = new LinkedList<>();
		q.offer(new Pair<String, Integer>(beginWord, 1));
		visited.add(beginWord);
		while(!q.isEmpty()) {
			Pair<String, Integer> cur = q.poll();
			String wrd = cur.getKey();
			//System.out.println("Looking for :" + wrd);
			int lvl = cur.getValue();
			for(String itr: WORDMAP.get(wrd)){
				//System.out.println("Matching for! " + itr);
				if(itr.equals(endWord)){
					return lvl+1;
				}
				
				if(!visited.contains(itr)){
					visited.add(itr);
					q.offer(new Pair<String, Integer>(itr, lvl+1));
				}
			}
		}
		
		return 0;
    }


private static boolean CheckOneEditAway(String s1, String s2) {
	boolean oneChange = false;
	for(int i=0; i < s2.length(); i++){
		if(s1.charAt(i) != s2.charAt(i) && oneChange){
			return false;
		}else if(s1.charAt(i) != s2.charAt(i)){
			oneChange = true;
		}
	}
	return true;
}

}
