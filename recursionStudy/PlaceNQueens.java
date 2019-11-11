package recursionStudy;

import java.util.ArrayList;
import java.util.List;

public class PlaceNQueens {

	public static void main(String[] args) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		result = nQueens(4);
		for(List<Integer> single : result){
			System.out.println(single);
		}
		
	}

	private static List<List<Integer>> nQueens(int n) {
		List<List<Integer>> result = new ArrayList<>();
		placeQueens(n, 0, new ArrayList<Integer>(), result);
		return result;
	}

	private static void placeQueens(int n, int row, ArrayList<Integer> columnList, List<List<Integer>> result) {
		if(row == n){
			System.out.println("Adding!!");
			System.out.println(columnList);
			result.add(new ArrayList<>(columnList));
		}else{
			for(int col = 0; col < n; ++col){
				columnList.add(col);
				if(isValid(columnList)){
					placeQueens(n,row+1, columnList, result);
				}
				columnList.remove(columnList.size()-1);
			}
		}
	}
	
	public static boolean isValid(ArrayList<Integer> colList) {
		
		int itemId = colList.size() - 1;
		for(int i = 0; i < itemId; ++i){
			int diff = Math.abs(colList.get(i) - colList.get(itemId));
			 //System.out.println("Comparing " + colList.get(i) + " & " + colList.get(itemId) + " Resulted in Diff : " + diff);
			if(diff == 0 || diff == itemId - i){
				
				return false;
			}
		}
		
		return true;
	}
	
	
	
}
