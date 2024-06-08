import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon17618_신기한수 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int i,j;
		int cnt = 0;

		int num = Integer.parseInt(bf.readLine());
		
		for(i=1; i<=num; i++) {
			int sum = 0;
			j = i;
			while(j!=0) {
				sum +=j%10;
				j/=10;
			}
			if(i%sum == 0) cnt++;
		}
		System.out.println(cnt);


	}

}
