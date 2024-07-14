import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ15654_N과M5 {
	public static int n,m;
	public static int[] num;
	public static int[] visited;
	public static int[] inputArray;
	public static StringBuilder sb = new StringBuilder();
	
	public static void back(int a) {
	    if (a == m) { // 종료지점
	        for (int j = 0; j < m; j++) {
	            sb.append(inputArray[num[j]] + " ");
	        }
	        sb.append("\n");
	        return;
	    }
	    for (int i = 0; i < n; i++) {
	        if (visited[i] == 0) {
	            visited[i] = 1;
	            num[a] = i;
	            back(a + 1);
	            visited[i] = 0;
	        }
	    }
	}

	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		num = new int[n];
		visited = new int[n];
		inputArray = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<n;i++) inputArray[i] = Integer.parseInt(st.nextToken());
		Arrays.sort(inputArray);
		
		back(0);
		System.out.println(sb);
	}

}
