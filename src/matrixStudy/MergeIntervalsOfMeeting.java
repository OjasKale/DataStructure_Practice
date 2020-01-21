package matrixStudy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MergeIntervalsOfMeeting {

	public static void main(String[] args) {
		int[][] meetings = {{1,3},{2,6},{8,10},{15,18}};
		int[][] res = mergeIntervals(meetings);
		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res[0].length; j++) {
				System.out.print(" " + res[i][j]);
			}
			System.out.println("");
		}
	}

	private static int[][] mergeIntervals(int[][] meetings) {
		List<Interval> meetingIntervals = new ArrayList<Interval>();
		for(int[] meeting : meetings){
			meetingIntervals.add(new Interval(meeting[0], meeting[1]));
		}
		LinkedList<Interval> res = new LinkedList<Interval>();
		Collections.sort(meetingIntervals,(a,b) -> Integer.compare(a.start, b.start));
		for(Interval currInt : meetingIntervals){
			if(res.isEmpty() || res.getLast().end < currInt.start){
				res.add(currInt);
			}else{
				res.getLast().end = Math.max(currInt.end, res.getLast().end);
			}
		}
		
		int[][] result = new int[res.size()][2];
		int cnt = 0;
		for(int i=0; i< result.length;++i){
				result[i][0] = res.get(cnt).start;
				result[i][1] = res.get(cnt).end;
				cnt++;
		}
		
		return result;
	}
	
	
	
}

