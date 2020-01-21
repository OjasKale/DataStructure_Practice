package mockPracticeLeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetInvalidTransaction {
	static class Trasaction{
		public String Name;
		public int time;
		public int amount;
		public String city;
		
		public Trasaction(String _name,int _time,int _amount,String _city){
			this.Name = _name;
			this.time = _time;
			this.amount = _amount;
			this.city = _city;
		}
		
		public String toString(){
			return Name+","+time+","+amount+","+city;
		}
	}
	
	public static void main(String[] args) {
		String[] st = {"bob,649,842,prague","alex,175,1127,mexico","iris,164,119,paris","lee,991,1570,mexico","lee,895,1876,taipei"};
		List<String> res = invalidTransactions(st);
		System.out.println(res);
	}
	
	public static List<String> invalidTransactions(String[] transactions) {
		Trasaction[] tran = new Trasaction[transactions.length];
		int i = 0;
		List<String> res = new ArrayList<>();
		for(String currTrans : transactions){
			String[] st = currTrans.split(",");
			tran[i++] = new Trasaction(st[0], Integer.parseInt(st[1]), Integer.parseInt(st[2]), st[3]);
		}
		
		
		Arrays.sort(tran, (a1,b1) -> a1.time - b1.time);
		
		for(i = 0; i < tran.length; i++){
			if(tran[i].amount > 1000){
				res.add(tran[i].toString());
			}
			int j = i-1;
			while(j >= 0){
				if(Math.abs(tran[j].time - tran[i].time) <= 60  ){
					if(tran[j].Name.equals(tran[i].Name) && !tran[j].city.equals(tran[i].city)){
						if(!res.contains(tran[i].toString())){
							res.add(tran[i].toString());
						}
						
						String invTran = tran[j].toString(); 
						if(!res.contains(invTran)){
							res.add(invTran);
						}
						
						break;
					}
				}
				j--;
			}
		}
		
		return res;
    }
	
	
}
