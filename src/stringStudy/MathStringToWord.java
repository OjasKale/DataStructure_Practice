package stringStudy;

import java.util.HashMap;

public class MathStringToWord {
	
	public static void main(String[] args) {
		String patten = "abba";
		String str = "dog dog dog dog";
		System.out.println(wordPattern(patten,str));
	}
	
	public static boolean wordPattern(String pattern, String str) {
        String[] wrdArr = str.split(" ");
        HashMap<String, Integer> wMap = new HashMap<String, Integer>();
        if(pattern.length() != wrdArr.length){
            return false;
        }
        
        for(int j=0; j<wrdArr.length;j++){
            if(!wMap.containsKey(wrdArr[j])){
            	wMap.put(wrdArr[j], j);
            }
        }
        
        int[] map1 = new int[256];
        int[] map2 = new int[wrdArr.length];
        for(int i=0; i<pattern.length(); i++){
        	char ch = pattern.charAt(i);
        	String st = wrdArr[i];
        	//System.out.println(st);
        	int index = wMap.get(st);
        	System.out.println("See: " + st + " For : " + index + " map1 " + map1[ch] + " Map2 " + map2[index]);
        	if(map1[ch] != map2[index]) return false;
        	map2[index] = i+1;
        	map1[ch] = i+1;
        }
        return true;
    }

}
