import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ1003_피보나치함수_DP {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int[][] dp = new int[41][2];
		dp[0][0] = 1;
		dp[1][1] = 1;
		for(int j=2; j<=40; j++) {
			dp[j][0] = dp[j-1][0] + dp[j-2][0];
			dp[j][1] = dp[j-1][1] + dp[j-2][1];
		}
		int t = Integer.parseInt(br.readLine());
		
		for(int i=0; i<t;i++) {
			int n = Integer.parseInt(br.readLine());
			sb.append(dp[n][0]+" "+dp[n][1]).append("\n");
		}
		System.out.println(sb);

	}

}
