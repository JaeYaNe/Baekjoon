/*
풀이)
lst배열에 정수를 입력받고 (0번 인덱스의 값을 0으로 설정)
현재 위치 값과 이전의 값들을 돌아가며 비교하여 현재값이 클 때
증가가 가장 많이 이루어진 mx를 찾고
해당 
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ11053_가장긴증가하는부분수열 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] dp = new int[n+1];
		int[] lst = new int[n+1];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i=1;i<=n;i++){
			lst[i] = Integer.parseInt(st.nextToken());
		}
		int answer = 0;
		for(int i=1;i<=n;i++) {
			int mx = 0;
			for(int j=0; j<i;j++) { //0~i-1 중 max값(나보다 작은 값 중에서)
				if(lst[i] > lst[j] ) {
					mx = Math.max(mx,dp[j]);
				}
				dp[i]=mx+1;
			}
			if(answer < dp[i]) answer = dp[i];
		}
		System.out.println(answer);

	}
}
