package recursion;

public class TowersOfHanoi {

	public static void main(String[] args) {
		

	}
	
	public void towersOfHanoi(int n, char src, char dest, char aux) {
		
		if(n == 1) {
			System.out.println("move plate from src " +src + "to destination " +dest);
			return;
		}
		
		towersOfHanoi(n-1, src, aux, dest);
		towersOfHanoi(n-1, dest, src, aux);
		
	}

}
