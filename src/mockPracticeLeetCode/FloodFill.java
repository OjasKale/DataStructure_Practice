package mockPracticeLeetCode;

public class FloodFill {
	
	public static void main(String[] args) {
		int[][] mat = {{1,1,1},{1,1,0},{1,0,1}};
		int[][] res = floodFill(mat,1 , 1, 3);
		for(int[] ans : res){
			for(int i : ans){
				System.out.print("" + i);
			}
			System.out.println();
		}
	}
	
	public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int[][] res = new int[image.length][image[0].length];
        res = image;
        int currColor = image[sr][sc];
        fillMatrix(image, sr, sc, currColor, newColor,res);
		
		return res;
    }

	private static void fillMatrix(int[][] image, int sr, int sc, int currColor, int newColor,int[][] res) {
		if(0 <= sr && sr < image.length && 0 <= sc && sc < image[0].length && image[sr][sc] == currColor && res[sr][sc] != newColor){
			res[sr][sc] = newColor;
			fillMatrix(image,sr-1,sc,currColor,newColor,res);
			fillMatrix(image,sr,sc-1,currColor,newColor,res);
			fillMatrix(image,sr+1,sc,currColor,newColor,res);
			fillMatrix(image,sr,sc+1,currColor,newColor,res);
		}
	}

}
