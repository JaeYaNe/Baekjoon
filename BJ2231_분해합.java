import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ2231_분해합 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str_n = br.readLine();
		int int_n = Integer.parseInt(str_n);
		br.close();

		int min = 1000000;
		int start = Math.max(1, int_n - (str_n.length() * 9));
		for(int i=start; i<int_n; i++) {
			int j = i;
			int sum = 0;
			while(j > 0){
				sum += j%10;
				j /= 10;
			}
			if(i+sum == int_n) {
				if(min > i) {
					min = i;
				}
			}
		}
		if(min == 1000000) {
			System.out.println(0);
		} else {
			System.out.println(min);
		}
		

	}
}
