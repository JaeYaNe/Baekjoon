

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ28278_스택2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] stk = new int[n];
		
		int cnt = 0;
		for(int i=0; i<n; i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			switch(Integer.parseInt(st.nextToken())) {
			case 1:
				stk[cnt++] = Integer.parseInt(st.nextToken());
				break;
			case 2:
				if(cnt>0) System.out.println(stk[--cnt]);
				else System.out.println(-1);
				break;
			case 3: 
				System.out.println(cnt);
				break;
			case 4: 
				if(cnt==0) System.out.println(1);
				else System.out.println(0);
				break;
			case 5:
				if(cnt != 0) System.out.println(stk[cnt-1]);
				else System.out.println(-1);
				break;
			}
			
		}
		
	}

}