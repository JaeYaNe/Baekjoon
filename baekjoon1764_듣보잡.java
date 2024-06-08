

import java.util.Arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon1764_듣보잡 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n,m,i,j;

		String input = bf.readLine();
		StringTokenizer st = new StringTokenizer(input);
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		String[] arr = new String[n+m];
		String[] answer = new String[Math.max(n, m)];
		for(i=0;i<n+m;i++) arr[i] = bf.readLine();
		
		Arrays.sort(arr);
		
		int cnt=0;
		for(i=1;i<n+m;i++) {
			if(arr[i].equals(arr[i-1])) {
				answer[cnt++] = arr[i];
			}
		}
		System.out.println(cnt);
		for(j=0;j<cnt;j++) System.out.println(answer[j]);
	}
}
