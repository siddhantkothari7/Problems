//Leetcode 937

import java.util.*;
public class KClosestPointstoOrigin {	
	public static int[][] kClosest(int[][] points, int k) {
		class Point{
			int x;
			int y;
			double distance;
			
			Point(int x, int y){
				this.x = x;
				this.y = y;
				this.distance = Math.sqrt((x*x) + (y*y));
			}
		}

		Queue<Point> point_q = new PriorityQueue<Point>((a,b) -> Double.compare(a.distance, b.distance));
		int[][] ret = new int[k][2];
		for(int[] point : points) {
			point_q.offer(new Point(point[0], point[1]));
		}
		
		for(int i = 0; i < k; i++){
			Point p = point_q.poll();
			System.out.println(p.distance);
			ret[i] = new int[]{p.x, p.y};
			//System.out.println(Arrays.toString(ret[i]));
		}
		return ret;
    }

	public static void main(String[] args) {
		//int[][] points = {{1,3}, {-2,2}};
		//int[][] points1 = {{3,3},{5,-1},{-2,4}};
		int[][] points2  = {{2,10},{-9,-9}, {0,8},{-2,-2},{8,9},{-10,-7},{-5,2},{-4,-9}};
		//output -> [[-2,-2],[-5,2],[0,8],[-4,-9],[2,10],[8,9],[-10,-7]]
		System.out.println(Arrays.deepToString(kClosest(points2, 7)));

	}

}
