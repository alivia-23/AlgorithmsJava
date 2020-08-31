package heap;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class KClosestPointToOrigin {

	public static void main(String[] args) {
	    Point[] points = new Point[] { new Point(1, 3), new Point(3, 4), new Point(2, -1) };
	    List<Point> result = findKClosestPoint(points, 2);
	    System.out.print("Here are the k points closest the origin: ");
	    for (Point p : result)
	      System.out.print("[" + p.x + "," + p.y + "]");

	}
	
	
	public static int sqrOfDistance(Point point) {
		int d = point.x * point.x + point.y * point.y;
		return d;
	}
	
	public static List<Point> findKClosestPoint(Point[] points, int k) {
		PriorityQueue<Point> maxHeap = new PriorityQueue<>((p1, p2) -> sqrOfDistance(p2) - sqrOfDistance(p1));
		
		for (int i = 0; i < k; i++) {
			maxHeap.add(points[i]);
		}
		
		for (int i = k; i < points.length; i++) {
			if(sqrOfDistance(points[i]) < sqrOfDistance(maxHeap.peek())) {
				maxHeap.poll();
				maxHeap.add(points[i]);
			}
		}
		
		List<Point> closestPoints = new ArrayList<>(maxHeap);
		
		return closestPoints;
	}	

}

class Point {
	int x;
	int y;
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
