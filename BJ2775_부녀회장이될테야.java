

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ2775_부녀회장이될테야 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		
		int[][] dp = new int[15][15];
		for(int i=1;i<15;i++) dp[0][i]=i;  // 0�� �ʱⰪ ����
			
		for(int i=0; i<t;i++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			
			for(int a=1; a<=k; a++) { // ����
				for(int b=1; b<=n; b++) { // ȣ��
					dp[a][b] = dp[a][b-1]+dp[a-1][b];
				}
			}
			System.out.println(dp[k][n]);
		}
		
	}

}
