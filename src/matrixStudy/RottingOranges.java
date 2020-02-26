package matrixStudy;

public class RottingOranges {
	
	public static void main(String[] args) {
		int[][] mat = {{2,1,1},{1,1,0},{0,1,1}};
		System.out.println(orangesRotting(mat));
	}
	
	public static int orangesRotting(int[][] grid) {
		int[][] marker = grid;
        int cnt = 0;
        boolean isFound = false;
        for(int i=0; i < grid.length;i++){
        	for(int j=0; j < grid[0].length;j++){
        		if(grid[i][j] == 2){
        			cnt = orangeHelper(grid, i,j,cnt,marker);
        			isFound = true;
        			break;
        		}
        	}
        	if(isFound)
        		break;
        }
        
        
        for(int i=0; i < grid.length;i++){
        	for(int j=0; j < grid[0].length;j++){
        		if(grid[i][j] == 1){
        			return -1;
        		}
        	}
        }
        
        return cnt;
        
    }

	private static int orangeHelper(int[][] grid, int i, int j, int cnt,int[][] marker) {
		if(grid[i][j] != 2){
			return cnt;
		}
		if(i > 0 && i < grid.length && j > 0 && j < grid[0].length){
			marker[i-1][j] = grid[i-1][j] == 1 ? 2 : grid[i-1][j];
		}
		return 0;
	}
	
	

}
