package trieStudy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class DynamicWordSuggestion {

	public static void main(String[] args) {
		
		List<String> rep = new ArrayList<>();
		rep.add("mouse");
		rep.add("mousePad");
		System.out.println(threeProductSuggestions(0, rep, "mouse"));
	}
	
	
	static class TrieNode {
        char c;
        int freq;
        HashMap<Character, TrieNode> children;

        public TrieNode(char c){
            this.c = c;
            this.freq = 0;
            this.children = new HashMap<>();
        }
    }

    static class Trie{
        TrieNode root;

        public Trie(){
            this.root = new TrieNode(' ');
        }

        public void addWord(String word){
            TrieNode current = root;
            for (char letter : word.toCharArray()){
                if (!current.children.containsKey(letter)){
                    current.children.put(letter, new TrieNode(letter));
                }
                current = current.children.get(letter);
            }
            ++current.freq;
        }

        public List<String> getWords(String prefix){
            List<String> result = new ArrayList<>();
            TrieNode current = root;
            for (char letter : prefix.toCharArray()){
                
                if (!current.children.containsKey(letter)){
                    return result;
                }
                current = current.children.get(letter);
            }
            prefix = prefix.substring(0, prefix.length() - 1);
            getAllWordsRecurse(current, result, prefix);
            return result;
        }

        public void getAllWordsRecurse(TrieNode current, List<String> res, String prefix){
            if (current == null)
                return;

            if (current.freq > 0){
                res.add(prefix + current.c);
            }
            for (TrieNode child : current.children.values()){
                getAllWordsRecurse(child, res, prefix + current.c);
            }
        }


        public boolean checkWord(String word){
            TrieNode current = root;
            for (char letter : word.toCharArray()){
                if (!current.children.containsKey(letter)){
                    return false;
                }
                current = current.children.get(letter);
            }
            if (current.freq > 0) return true;
            return false;
        }
    }

    static List<List<String>> threeProductSuggestions(int numProducts,
                                                      List<String> repository,
                                                      String customerQuery) {
        Trie trie = new Trie();

        for (String product : repository)
            trie.addWord(product.toLowerCase());

        String sub = "";
        List<List<String>> results = new ArrayList<>();
        for (int i = 2; i <= customerQuery.length(); ++i){
            sub = customerQuery.toLowerCase().substring(0, i);
            List<String> res = trie.getWords(sub);
            Collections.sort(res);
            List<String> finalRes = new ArrayList<>();
            for (int j = 0; j < Math.min(3, res.size()); ++j){
                finalRes.add(res.get(j));
            }
            results.add(finalRes);
        }

        return results;
    }
	
	
	
}
