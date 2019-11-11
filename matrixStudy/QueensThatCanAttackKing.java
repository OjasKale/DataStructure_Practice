package matrixStudy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class QueensThatCanAttackKing {
	
	public static void main(String[] args) {
		int[][] queens = {{0,1},{1,0},{4,0},{0,4},{3,3},{2,4}};
		int[] king = {0,0};
		
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		res = GetAllQueens(queens,king);
		System.out.println(res.size());
		for(List<Integer> li:res){
			System.out.println("Res:" + li);
		}
	}

	private static List<List<Integer>> GetAllQueens(int[][] queens, int[] king) {

        List<List<Integer>> res = new ArrayList<List<Integer>>();
        HashMap<Integer, diffMember> dic = new HashMap<>();
        int kingI = king[0];
        int kingJ = king[1];
        for(int[] queen : queens){
            int i = queen[0];
            int j = queen[1];
            
            
            
            if(i == kingI || j == kingJ){
            	int slope = checkSlope(kingI,kingJ,i,j);
                int dist = getDistance(kingI,kingJ,i,j);
                if(dic.containsKey(slope)){
                	diffMember storedQueen = dic.get(slope);
                	if(storedQueen.distance > dist){
                		dic.put(slope, new diffMember(queen, dist));
                	}
                }else{
                	dic.put(slope, new diffMember(queen, dist));
                }
            }else if( checkDiagonal(kingI,kingJ,i,j) ){
            	int slope = checkSlope(kingI,kingJ,i,j);
                int dist = getDistance(kingI,kingJ,i,j);
                if(dic.containsKey(slope)){
                	diffMember storedQueen = dic.get(slope);
                	if(storedQueen.distance > dist){
                		dic.put(slope, new diffMember(queen, dist));
                	}
                }else{
                	dic.put(slope, new diffMember(queen, dist));
                }
            }
        }
        
        for(int key : dic.keySet()){
        	int[] temp = dic.get(key).queen;
        	List<Integer> newList = Arrays.stream(temp).boxed().collect(Collectors.toList());
        	res.add(newList);
        }
        return res;
	}

	private static boolean checkDiagonal(int x1, int y1, int x2, int y2) {
		int m = Math.abs((y2-y1)/(x2-x1));
        return m == 1;
	}

	private static int getDistance(int x1, int x2, int y1, int y2) {
		int dist = 0;
		dist = (int) Math.sqrt( ((x2-x1)*(x2-x1)) + ((y2-y1)*(y2-y1)) );
		return dist;
	}

	private static int checkSlope(int x1, int y1, int x2, int y2) {
		if((x2-x1) == 0){
			return 0;
		}
		int m = (y2-y1)/(x2-x1);
        return m;
	}

}

class diffMember{
	public int[] queen;
	public int distance;
	
	diffMember(int[] qun, int dist){
		queen = qun;
		distance = dist;
	}
}
