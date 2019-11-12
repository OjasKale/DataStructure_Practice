package matrixStudy;

import java.util.ArrayList;
import java.util.List;

public class SearchForShip {

	private static int[][] mat = {{0,	0,	0,	0},
			   {0,	1,	0,	0},
			   {0,	1,	0,	0},
			   {0,	1,	0,	0}};
	public static void main(String[] args) {
			List<int[]>res = findTheShip(mat.length);
			System.out.println(res);
		}

	private static List<int[]> findTheShip(int len) {
		List<int[]> result = new ArrayList<>();
		
		for(int i=0; i < len; ++i){
			for(int j=0; j < len; ++j){
				if(isShipHit(i,j)){
					result.add(new int[] {i,j});
					int row = i;
					int col = j;
					// go Left
					while(col >= 0 && isShipHit(row, --col)){
						result.add(new int[] {row,col});
					}
					if(result.size() != 3){
						row = i;
						col = j;
					}else{
						break;
					}
					// go right
					while(col <= len && isShipHit(row, ++col)){
						result.add(new int[] {row,col});
					}
					if(result.size() != 3){
						row = i;
						col = j;
					}else{
						break;
					}
					//go bot
					while(row <= len && isShipHit(++row, col)){
						result.add(new int[] {row,col});
					}
					if(result.size() != 3){
						row = i;
						col = j;
					}else{
						break;
					}
				}
				if(result.size() == 3){
					break;
				}
			}
		}
		
		return result;
	}

	private static boolean isShipHit(int i, int j) {
		System.out.println("Query: " + i + " && " + j);
		return mat[i][j] == 1;
	}
	
	
}
