/*
 n = 1 일때 1
 n = 2 일때 1+1, 2
 n = 3 일때 1+1+1, 1+2, 2+1, 3
 n = 4 일때 (n=3인 경우 +1) 1+1+1+1, 1+1+2, 1+3, 1+2+1, 2+2, 2+1+1, 3+1
 ...
 n = 11까지 있음.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ9095_123더하기 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] dp = new int[12];
		int m = Integer.parseInt(br.readLine());
		for(int i=0; i<m; i++) {
			dp[1] = 1;
			dp[2] = 2;
			dp[3] = 4;
			int n = Integer.parseInt(br.readLine());
			for(int j=4;j<=n;j++) {
				dp[j] = dp[j-1]+dp[j-2]+dp[j-3];
			}
			System.out.println(dp[n]);
		}

	}

}
