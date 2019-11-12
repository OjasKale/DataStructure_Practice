package matrixStudy;

public class CellsWithOddValuesInMatrix {
	
	public static void main(String[] args) {
		int[][] ind = {{0,1},{1,1}};
		int res = oddCells(2,3,ind);
		System.out.println(res);
		
	}

	public static int oddCells(int n, int m, int[][] indices) {
        int[][] mat = new int[n][m];
        int oddCount = 0;
        for(int[] ind : indices){
        	int row = ind[0];
        	int col = ind[1];
        	
        	for(int i = 0; i < m; ++i){
        		mat[row][i] = mat[row][i] + 1; 
        	}
        	
        	for(int j = 0; j < n; ++j){
        		mat[j][col] = mat[j][col] + 1;
        	}
        }
        
        
        for(int i = 0; i < n; ++i){
        	for(int j =0; j < m; ++j){
        		if(mat[i][j] % 2 != 0)
        			oddCount++;
        	}
        }
		
		return oddCount;
    }

}
