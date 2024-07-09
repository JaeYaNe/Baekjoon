import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ15649_N과M1 {
	public static int n,m;
	public static int[] num = new int[9];
	public static int[] visited = new int[9];
	public static StringBuilder sb = new StringBuilder();
	
	public static void back(int a) {
		if(a > m) { //종료조건
			for(int i=1; i<a; i++) {
				sb.append(num[i]+" ");
			}
			sb.append("\n");
			return;
		}
		for(int i=1;i<=n;i++) {
			if(visited[i]==0) {
				visited[i] = 1;
				num[a] = i;
				back(a+1);
				visited[i] = 0;
			}
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
