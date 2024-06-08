
import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.io.InputStreamReader;
import java.io.IOException;
public class baekjoon3003 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] chess = {1,1,2,2,2,8};
		int[] white = new int[6];

		StringTokenizer st = new StringTokenizer(br.readLine());
		int i = 0;
		while (st.hasMoreTokens()) {
			white[i] = Integer.parseInt(st.nextToken());
			i++;
		}
		for (i = 0; i<white.length; i++) {
			int piece = chess[i] - white[i];
			white[i] = piece;
			System.out.printf("%d ",white[i]);
		}
	}	

}