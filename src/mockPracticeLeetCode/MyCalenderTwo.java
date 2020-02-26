package mockPracticeLeetCode;


import java.util.*;
public class MyCalenderTwo {
	
	class Interval{
        public int start;
        public int end;
        public int cnt;
        
        public Interval(int st,int en, int _cnt ){
            start = st;
            end = end;
            cnt = _cnt;
        }
    }
    
    PriorityQueue<Interval> pq;
    HashMap<Interval, Integer> map;
    public MyCalenderTwo() {
        pq = new PriorityQueue<>((a,b) -> a.start - b.start);
        map = new HashMap<Interval, Integer>();
    }
    
    public boolean book(int start, int end) {
        //while()
    	return false;
    }
}
