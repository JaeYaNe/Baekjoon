import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ1009_분산처리 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		
		for(int i=0; i<t; i++) {
			int c = 1;
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken())%10;
			int b = Integer.parseInt(st.nextToken());
			
			for(int j=1; j<=b; j++) {
				c*=a;
				c%=10;
			}
			if(c == 0) c = 10;
			System.out.println(c);
		}
	}

}
