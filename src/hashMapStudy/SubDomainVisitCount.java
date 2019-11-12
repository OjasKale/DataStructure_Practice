package hashMapStudy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// Leetcode Problem
public class SubDomainVisitCount {

	public static void main(String[] args) {
		String [] inp = {"900 google.mail.com","10 leet.code.mail.com"};
		System.out.println(givebackTheMap(inp));
	}
	
	public static List<String> givebackTheMap(String[] cpdomains){
		HashMap<String, Integer> dictionary = new HashMap<>();
		List<String> result = new ArrayList<>();
		for(String st : cpdomains){
			String[] temp = st.split(" ");
			int count = Integer.parseInt(temp[0]);
			List<String> domainList = giveListOfDomains(temp[1]);
			for(String currDomain : domainList){
				if(dictionary.containsKey(currDomain)){
					dictionary.put(currDomain, (dictionary.get(currDomain) + count));
				}else{
					dictionary.put(currDomain, count);
				}
			}
		}
		
		for(String key : dictionary.keySet()){
			String st = dictionary.get(key) + " " + key;
			result.add(st);
		}
		return result;
	}
	
	public static List<String> giveListOfDomains(String domains) {
		List<String> res = new ArrayList<>();
		StringBuilder sb = new StringBuilder(domains);
		while(sb.length() >= 0){
			res.add(sb.toString());
			int index = sb.indexOf(".");
			if(index != -1){
				sb.delete(0,index+1);
			}else if(index == -1){
				break;
			}
			
		}
		return res;
	}
}
