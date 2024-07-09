import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ1182_부분수열의합 {
	public static int n;
	public static int m;
	public static int dab = 0;
	public static int[] map;
	public static void back(int a, int b, int c) {
		if(a==n) {

			if(c>=1 && b==m) dab++; // 한개이상 선택했어면서 합이 S이면
			return;
		}
		back(a+1,b+map[a],c+1); // 선택한 경우
		back(a+1,b,c);        // 선택하지 않은 경우
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		map = new int[n+1];
		
		st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<n; i++) 
			map[i] = Integer.parseInt(st.nextToken());
		
		back(0,0,0);
		System.out.println(dab);
	}

}
