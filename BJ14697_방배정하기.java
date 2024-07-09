import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ14697_방배정하기 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int i,j,k,A,B,C,N;
		int answer = 0;

		String num = bf.readLine();
		StringTokenizer st = new StringTokenizer(num);
		A = Integer.parseInt(st.nextToken());
		B = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		
		
        Loop:
        for (i = 0; i <= N / A; i++) {
            for (j = 0; j <= N / B; j++) {
                for (k = 0; k <= N / C; k++) {
                    if (N == (i * A) + (j * B) + (k * C)) {
                        answer = 1;
                        break Loop;
                    }
                }
            }
        }
        
        System.out.println(answer);
    }
}