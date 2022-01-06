package snowflake;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SquaredDistancePoints {
	
	
	public static void main(String[] args) {
		List<Integer> x = Arrays.asList(543243,5000);
		List<Integer> y = Arrays.asList(0,322);
		System.out.println(closestSquaredDistance(x, y));
	}
	 public static long closestSquaredDistance(List<Integer> x, List<Integer> y) {
	       int n = x.size();
	       List<Point> points = new ArrayList<>();
	       
	       for (int i = 0; i < n; i++) {
	           Point point = new Point(x.get(i), y.get(i));
	           points.add(point);
	       }
	       
	       long minDistance = Long.MAX_VALUE;
	       for (int i = 0; i < n; i++) {
	           for (int j = i+1; j < n; j++) {
	               long distance = getSquaredDistance(points.get(i), points.get(j));
	               minDistance = Math.min(distance, minDistance);
	           }
	       }
	       
	       return minDistance;

	    }
	    
	    /**
	     *
	     * Calculate minimun distance between two points
	     */
	    private static long getSquaredDistance(Point point1, Point point2) {
	        long distance = (point1.x - point2.x)*(point1.x - point2.x) +
	                            (point1.y - point2.y)*(point1.y - point2.y);
	        return distance;
	    }

}

/**
 *  Class represntation of a point
 */
class Point {
   int x;
   int y;
   
   Point(int x, int y) {
       this.x = x;
       this.y = y;
   }
}


