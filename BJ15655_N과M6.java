import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ15655_N과M6 {
	public static int n,m;
	public static int[] num = new int[9];
	public static int[] visited = new int[9];
	public static int[] inputArray = new int[9];
	public static StringBuilder sb = new StringBuilder();
	
	public static void back(int a,int b) {
		
		if(n==m) {
			for (int j = 1; j <= m; j++) {
	            sb.append(inputArray[j] + " ");
	        }
			return;
		}
		if(b > m) { //종료지점
			for(int j=1; j<=m; j++) {
				sb.append(num[j] + " ");
			}
			sb.append("\n");
			return;
		}
		for(int i=a;i<=n;i++) {	
			
	            num[b] = inputArray[i];
				back(i+1,b+1);
		}
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		for (int i=1; i<=n;i++) inputArray[i] = Integer.parseInt(st.nextToken());
		Arrays.sort(inputArray,1,n+1);
		
		back(1,1);
		System.out.println(sb);
	}

}
