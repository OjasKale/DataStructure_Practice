package arrayStudy;

public class CorporateFlightBookings {

	
	public static void main(String[] args) {
		
		int [][] map = {{1,2,10},{2,3,20},{2,5,25}};
		int[] res = corpFlightBookings(map,5);
		for(int c: res){
			System.out.println(c);
		}
	}
	
	public static int[] corpFlightBookings(int[][] bookings, int n) {
		
		int[] res = new int[n];
		
		for(int i=0; i < bookings.length; i++){
			for(int j=bookings[i][0]; j <= bookings[i][1];j++){
				res[j-1] += bookings[i][2];
			}
		}
		
        return res;
    }
}
