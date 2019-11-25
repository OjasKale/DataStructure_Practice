package matrixStudy;

public class FillSprial {
	public static void main(String[] args) {
		int[][] res = fillMatrixInSpiralOrder(3);
		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res[0].length; j++) {
				System.out.print(" " + res[i][j]);
			}
			System.out.println("");
		}
	}

	private static int[][] fillMatrixInSpiralOrder(int n) {
		int[][] result = new int[n][n];
		int i=0, j=0, col_end = n, row_end = n,k;
		int cnt = 1;
		while(i < row_end && j < col_end){
			//Fill first row
			for(k=j; k < col_end; k++){
				result[i][k] = cnt++;
			}
			i++;
			//Fill last col
			for(k = i; k < row_end; k++){
				result[k][col_end-1] = cnt++;
			}
			col_end--;
			//Fill last row
			if(i < row_end){
				for(k = col_end-1; k >=j;k--){
					result[row_end-1][k] = cnt++;
				}
				row_end--;
			}
			//Fill first col
			if(j < col_end){
				for(k = row_end-1; k >= i; k--){
					result[k][j] = cnt++;
				}
				j++;
			}
		}
		return result;
	}

}
