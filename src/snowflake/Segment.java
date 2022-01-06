package snowflake;

import java.util.ArrayList;
import java.util.List;

public class Segment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int segment(int x, List<Integer> space) {

	       List<Integer> minSizes = new ArrayList<>();
	       //Find the minimum in each segment and store it in a list
	       for (int i = 0; i < space.size() - x + 1; i++) {
	           int min = Integer.MAX_VALUE;
	           for (int j = i; j < i + x; j++) {
	               min = Math.min(space.get(j), min);
	           }
	           minSizes.add(min);
	       }
	       // Find the maximum of all minimum segments
	       int maxVal = Integer.MIN_VALUE;
	       for (Integer num : minSizes) {
	           maxVal = Math.max(maxVal, num);
	       }
	       
	       return maxVal;      

	}


}
