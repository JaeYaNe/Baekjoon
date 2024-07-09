/*
풀이)
dp_다이나믹 프로그래밍문제의 경우 수열의 점화식으로 만들 수 있다.
n이 1일때 경우의 수 1개	n이 2일때 경우의 수 2개	n이 3일때 경우의 수 3개
n이 4일때 경우의 수 5개	n이 5일때 경우의 수 8개 	n이 6일때 경우의 수 13개

수열의 점화식으로 이를 나타내면
f(n) = f(n-1)+f(n-2)
피보나치 수열과 동일하다.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ11726_2xn타일링 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] dp = new int[n+1];
		if(n==1) dp[1] = 1;
		else {
			dp[1] = 1;
			dp[2] = 2;
		}
		
		
		for(int i=3; i<=n;i++) dp[i] = (dp[i-1]+dp[i-2])%10007;
		
		System.out.println(dp[n]);
	}
}