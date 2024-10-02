import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BJ2751_수정렬하기2 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int[] counting = new int[2000001]; 


		for(int i = 0; i < n; i++) {
			int num = Integer.parseInt(br.readLine());
			counting[num + 1000000]++;
		}

		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < counting.length; i++) {
			while(counting[i] > 0) {
				sb.append(i - 1000000).append('\n');
				counting[i]--;
			}
		}

		System.out.print(sb.toString());
	}
}
