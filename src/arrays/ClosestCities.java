package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClosestCities {
	
	public static void main(String[] args) {
		List<String> c = Arrays.asList("fastcity", "bigbanana", "xyz");
		List<Integer> x = Arrays.asList(23, 23, 23);
		List<Integer> y = Arrays.asList(3, 1, 10);
		List<String> q = Arrays.asList("fastcity", "bigbanana", "xyz");
		closestStraightCity(c, x, y, q);
	}

    public static List<String> closestStraightCity(List<String> c, List<Integer> x, List<Integer> y, List<String> q) {
        
        List<City> cities = new ArrayList<>();
        Map<String, City> map = new HashMap<>();
        for(int i = 0; i < c.size(); i++) {
            City city = new City(c.get(i), x.get(i), y.get(i));
            cities.add(city); 
            
            map.put(city.name, city);     
        }
        
        List<String> minDistanceCities = new ArrayList<>();
        
        for(int i = 0; i < q.size(); i++) {
            String closest = "NONE";
            int min = Integer.MAX_VALUE;
            String queriedCity = q.get(i);
            for(int j = 0; j < cities.size(); j++) {
                if(!queriedCity.equals(cities.get(j).name)) { // not same city
                	int dist = Math.abs(map.get(queriedCity).x - cities.get(j).x);
                    if(map.get(queriedCity).x == cities.get(j).x
                      && Math.abs(map.get(queriedCity).y - cities.get(j).y) < min) {
                       min = Math.abs(map.get(queriedCity).y - cities.get(j).y);
                       closest = cities.get(j).name;
                    }
                    if(map.get(queriedCity).y == cities.get(j).y 
                     && Math.abs(map.get(queriedCity).x - cities.get(j).x) < min) {
                       min = Math.abs(map.get(queriedCity).x - cities.get(j).x);
                       closest = cities.get(j).name;
                    }        
                }
            }
            minDistanceCities.add(closest);
        }
        
        return minDistanceCities;
    }
}

class City {
    String name;
    int x;
    int y;
    public City(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }
}
