package matrixStudy;

public class Matrix01 {
	public static void main(String[] args) {
		int[][] mat = {{0,0,0},{0,1,0},{1,1,0}};
		int[][] res = updateMatrix(mat);
		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res.length; j++) {
				System.out.print(res[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static int[][] updateMatrix(int[][] matrix) {
		int[][] res = new int[matrix.length][matrix[0].length];
		if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
			return res;
		}
		
		for(int i=0; i < matrix.length;i++){
			for(int j=0; j < matrix[0].length; j++){
				res[i][j] = calculateDistanceWithBfs(matrix, i, j, res, 0);
			}
		}
		return res;
    }

	private static int calculateDistanceWithBfs(int[][] matrix, int i, int j, int[][] res, int k) {
		if((i >= 0 && i < matrix.length) && (j >= 0 && j < matrix[0].length )){
			if(matrix[i][j] == 0){
				return k;
			}else{
				System.out.println("recursive call: " + matrix[i][j] + " for " + i + " " + j);
				return Math.min(
						Math.min(calculateDistanceWithBfs(matrix,i-1, j, res, k+1), calculateDistanceWithBfs(matrix,i+1, j, res, k+1)),
						Math.min(calculateDistanceWithBfs(matrix,i, j-1, res, k+1), calculateDistanceWithBfs(matrix,i, j+1, res, k+1))
						);
			}
			
		}else{
			return k;
		}
			
	}
}
