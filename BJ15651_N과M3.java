

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ15651_N과M3 {
	public static int n,m;
	public static int[] num = new int[9];
	public static StringBuilder sb = new StringBuilder();
	
	public static void back(int a) {
		if(a > m) { //종료지점
			for(int j=1; j<=m; j++) {
				sb.append(num[j]+" ");
			}
			sb.append("\n");
			return;
		}
		for(int i=1;i<=n;i++) {	
			num[a] = i;
			back(a+1);
		}
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		back(1);
		System.out.println(sb);
	}

}
