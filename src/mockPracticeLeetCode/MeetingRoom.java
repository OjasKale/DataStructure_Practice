package mockPracticeLeetCode;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MeetingRoom {

	
	static class Interval {
		int start;
		int end;

		public Interval(int start, int end) {
			this.start = start;
			this.end = end;
		}
	}
	
	public static void main(String[] args) {
		Interval[] intervals = new Interval[4];
		intervals[0] = new Interval(1, 30);
		intervals[1] = new Interval(5, 10);
		intervals[2] = new Interval(15, 20);
		intervals[3] = new Interval(1, 4);
		System.out.println("Number of meeting rooms: " + findMinNoOfMeetingRooms(intervals));
	}
	
	public static int findMinNoOfMeetingRooms(Interval[] intervals) {
		if (intervals == null || intervals.length == 0)
			return 0;
		Arrays.sort(intervals, (a,b) -> a.start - b.start);
		
//		for (Interval interval : intervals) {
//			System.out.println(interval.start + "<==>" + interval.end);
//		}
		
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		minHeap.offer(intervals[0].end);
		int cnt = 1;
		for(int i = 1; i < intervals.length; i++){
			if(intervals[i].start < minHeap.peek()){
				cnt++;
			}else{
				minHeap.poll();
			}
			minHeap.offer(intervals[i].end);
		}
		
		return cnt;
		
	}
	
	
	
	
}
