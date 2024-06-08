import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ2579_계단오르기 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] dp1 = new int[n+1];
		int[] dp2 = new int[n+1];
		int[] lst = new int[n+1];
		for(int i = 0;i<n;i++) lst[i] = Integer.parseInt(br.readLine());
		br.close();

		dp1[0] = dp2[0] = lst[0];
		dp1[1] = lst[1];
		dp2[1] = lst[0] + lst[1];
		
		for(int i=2; i<n; i++) {
			dp1[i] = Math.max(dp1[i-2], dp2[i-2])+lst[i];
			dp2[i] = dp1[i-1]+lst[i];
		}
		System.out.println(Math.max(dp1[n-1], dp2[n-1]));
	}

}
