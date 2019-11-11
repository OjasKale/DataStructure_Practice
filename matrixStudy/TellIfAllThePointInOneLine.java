package matrixStudy;

public class TellIfAllThePointInOneLine {

	public static void main(String[] args) {
		int[][] mat = {{-4,-3},{1,0},{3,-1},{0,-1},{-5,2}};
		boolean res = checkStraightLine(mat);
		System.out.println(res);
	}
	
	 public static boolean checkStraightLine(int[][] coordinates) {
	        Double slope = 0.0;
	        for(int i=1; i < coordinates.length; ++i){
	            int[] temp1 = coordinates[i];
	            int[] temp2 = coordinates[i-1];
	            System.out.println("Calculating slope for : " + temp2[1] + temp1[1] + temp2[0] + temp1[0]);
	            Double tempSlope = (double) ((temp2[1] - temp1[1]) / (temp2[0] - temp1[0]));
	            System.out.println("TempSlope : " + tempSlope + " && " + slope);
	            
	            if(slope == 0.0){
	                slope = tempSlope;
	            }else if(slope != tempSlope){
	                return false;
	            }
	                
	        }
	        
	        return true;
	    }
}
