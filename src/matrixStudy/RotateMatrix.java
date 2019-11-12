package matrixStudy;

public class RotateMatrix {

	
	public static void main(String[] args) {
		int[][] mat = {{1,9,33,73},{2,8,21,42},{3,6,16,59},{5,91,26,83}};
		int[][] res = rotateMatrix(mat);
		for(int i=0; i<res.length;++i){
			for(int j=0; j<res[0].length;++j){
				System.out.println(res[i][j]);
			}
		}
	}
	
	public static int[][] rotateMatrix(int[][] mat) {
		if(mat.length == 0 || mat.length != mat[0].length){
			return null;
		}
		
		int n = mat.length;
		for(int layer = 0; layer < n/2; ++layer ){
			int first = layer;
			int last = n -1 - layer;
			for(int i = first; i < last; ++i){
				int offset = i - first;
				
				int top = mat[first][i]; //top
				mat[first][i] = mat[last-offset][first]; //left
				mat[last-offset][first] = mat[last][last-offset]; //bottom
				mat[last][last-offset] = mat[i][last]; // right
				mat[i][last] = top;
			}
		}
		
		return mat;
		
	}
}
