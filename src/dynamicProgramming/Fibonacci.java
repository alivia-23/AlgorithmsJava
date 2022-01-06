package dynamicProgramming;

public class Fibonacci {
	
	public static void main(String[] arg) {
		System.out.println(calcFibNoExtraSpace(5));
		System.out.println(calcFibNoExtraSpace(6));
		System.out.println(calcFibNoExtraSpace(7));
		
	}
	// normal fibonacci calculation solution
	public int calculateFib(int n) {
		if (n < 2) {
			return n;
		}
		
		return calculateFib(n - 1) + calculateFib(n - 2);
	}
	
	// memoization solution (i.e. break into overlapping recursive subproblems and keep in memoized array
	public int calcFib(int n) {
		int[] memoized = new int[n+1];
		return calcFibRecurse(memoized, n);
	}
	
	int calcFibRecurse(int[] memoized, int n) {
		if (n < 2) {
			return n;
		}
		// if already exists in memo then return memo value
		if (memoized[n] != 0) {
			return memoized[n];
		}
		
		memoized[n] = calcFibRecurse(memoized, n-1) + calcFibRecurse(memoized, n-2);
		return memoized[n];
	}
	
	// Bottom-up approach
	public static int calcFibo(int n) {
		if (n == 0) {
			return 0;
		}
		int[] dp = new int[n+1];
		dp[0] = 0;
		dp[1] = 1;
		
		for (int i = 2; i <= n; i++) {
			dp[i] = dp[i-1] + dp[i-2];
		}
		return dp[n];
	}
	
	// Without using extra space
	public static int calcFibNoExtraSpace(int n) {
		if (n == 0) {
			return 0;
		}
		int first = 0;
		int second = 1;
		int result = 0;
		
		for (int i = 2; i <= n; i++) {
			result = first + second;
			first = second;
			second = result;
		}
		return second;
	}

}
