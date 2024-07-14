import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon2798_블랙잭 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] num = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) num[i] = Integer.parseInt(st.nextToken());
		
		int min = m;
		for(int a=0; a<n; a++) {
			for(int b=0; b<n; b++) {
				if(a==b) continue;
				for(int c=0; c<n; c++) {
					if(b==c||a==c) continue;
					int x = m-(num[a]+num[b]+num[c]);
					if (x<0) continue;
					if(x <= min) {
						min = x;
					}
				}
			}
		}
		System.out.println(m-min);
		

	}

}
