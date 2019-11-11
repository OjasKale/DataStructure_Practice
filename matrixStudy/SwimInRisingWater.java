package matrixStudy;

public class SwimInRisingWater {
	
	public static void main(String[] args) {
		int[][] mat = {{}};
		
		int res = swimInWater(mat);
		System.out.println(res);
	}

	private static int swimInWater(int[][] mat) {
		int[][] visited = new int[mat.length][mat[0].length];
		int currMax = mat[0][0];
//		int i
//		while(true){
//			getNextStep(mat)
//			break;
//		}
		
		return currMax;
	}

}
