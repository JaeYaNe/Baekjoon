

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon25400 {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		
		int[] arr = new int[N];
		String num = bf.readLine();
		StringTokenizer st = new StringTokenizer(num);
		int i = 0;
		while(st.hasMoreTokens()) {
			arr[i]=Integer.parseInt(st.nextToken());
			i++;
		}
		
		int cnt = 0;
		int key = 1;
		for(i=0;i<N;i++) {
			if (arr[i] == key) {
				cnt++;
				key++;
			}
		}
		System.out.println(N-cnt);

	}

}
