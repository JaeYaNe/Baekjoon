import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ1149_RGB거리 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int r,g,b;
		
		int n = Integer.parseInt(br.readLine());
		int[][] dp = new int[n][3];
		
		st = new StringTokenizer(br.readLine());
		dp[0][0] = Integer.parseInt(st.nextToken());
		dp[0][1] = Integer.parseInt(st.nextToken());
		dp[0][2] = Integer.parseInt(st.nextToken());
		
		for(int i=1; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			r = Integer.parseInt(st.nextToken());
			g = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			
			dp[i][0] = Math.min(r+dp[i-1][1], r+dp[i-1][2]);
			dp[i][1] = Math.min(g+dp[i-1][0], g+dp[i-1][2]);
			dp[i][2] = Math.min(b+dp[i-1][0], b+dp[i-1][1]);
		}
		System.out.println(Math.min(dp[n-1][0], Math.min(dp[n-1][1],dp[n-1][2])));
	}

}
