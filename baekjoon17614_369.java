

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon17614_369 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		int cnt = 0;
		for(int i=1; i<=N; i++) {
			int j = i;
			while(j!=0) {
				if(j%10 == 3 || j%10 == 6 || j%10 == 9) cnt++;
				j /= 10;
			}
		}
		System.out.println(cnt);
	}

}
