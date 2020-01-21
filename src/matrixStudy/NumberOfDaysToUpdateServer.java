package matrixStudy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class NumberOfDaysToUpdateServer {
	public static void main(String[] args) throws Exception {
		//int[][] grid = { { 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 } };
		
		List<List<Integer>> grd = new ArrayList<List<Integer>>();
		List<Integer> arr1 = new ArrayList<>();
		arr1.add(0);
		arr1.add(0);
		arr1.add(0);
		arr1.add(0);
		arr1.add(0);
		arr1.add(0);
		grd.add(arr1);
		
		arr1 = new ArrayList<>();
		arr1.add(0);
		arr1.add(0);
		arr1.add(0);
		arr1.add(0);
		arr1.add(0);
		arr1.add(0);
		grd.add(arr1);
		
		arr1 = new ArrayList<>();
		arr1.add(0);
		arr1.add(0);
		arr1.add(0);
		arr1.add(0);
		arr1.add(0);
		arr1.add(0);
		grd.add(arr1);
		
		arr1 = new ArrayList<>();
		arr1.add(0);
		arr1.add(0);
		arr1.add(0);
		arr1.add(0);
		arr1.add(0);
		arr1.add(0);
		grd.add(arr1);
		
		arr1 = new ArrayList<>();
		arr1.add(0);
		arr1.add(0);
		arr1.add(0);
		arr1.add(0);
		arr1.add(0);
		arr1.add(0);
		grd.add(arr1);
		System.out.println(minimumDays(grd.size(), grd.get(0).size(),grd));
	}

	private static int minimumDays(int rows, int columns, List<List<Integer>> grd) throws Exception {
		Queue<int[]> q = new LinkedList<>();
		int target = rows * columns;
		int cnt = 0, res = 0;
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				if(grd.get(i).get(j) == 1) {
					q.offer(new int[] {i,j});
					cnt++;
				}
			}
		}
		int[][] dirs = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
		while(!q.isEmpty()) {
			int size = q.size();
			if(cnt == target)
				return res;
			for(int i=0;i<size;i++) {
				int[] cur = q.poll();
				for(int[] dir : dirs) {
					int ni = cur[0] + dir[0];
					int nj = cur[1] + dir[1];
					if(ni >=0 && ni < rows && nj >=0 && nj < columns && grd.get(ni).get(nj) == 0) {
						cnt++;
						q.offer(new int[] {ni, nj});
						grd.get(ni).set(nj, 1);
					}
				}
			}
			res++;
		}
		//return -1;
		throw new Exception("Invalid input");
	}

}
