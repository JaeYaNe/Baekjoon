import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon17608_막대기 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int n,i;
		n = Integer.parseInt(bf.readLine());
		int[] stk = new int[n];
		for(i=0; i<n; i++) {
			stk[i] = Integer.parseInt(bf.readLine());
		}
		int cnt = 1;
		int height = stk[n-1];
		for(i=n-1; i>=0; i--) {
			if(stk[i] > height) {
				height = stk[i];
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}

