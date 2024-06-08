

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ2720_세탁소 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] tr = {25,10,5,1};
		for(int i=0; i<n; i++) {
			int m = Integer.parseInt(br.readLine());
			for(int j=0; j<4; j++) {
				int t = m % tr[j];
				System.out.print((m-t)/tr[j]+" " );
				m = t;
			}
			System.out.println("");
		}

	}

}
