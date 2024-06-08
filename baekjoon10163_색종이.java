import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon10163_색종이 {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n,i,j,t,x1,y1,x2,y2,mx=0,my=0;
		int[][] map = new int[1001][1001];
		int[] cnt = new int[101];
		n = Integer.parseInt(bf.readLine());
		for(i=0;i<n;i++) {
			String input = bf.readLine();
			StringTokenizer st = new StringTokenizer(input);
			x1 = Integer.parseInt(st.nextToken());
			y1 = Integer.parseInt(st.nextToken());
			x2 = Integer.parseInt(st.nextToken());
			y2 = Integer.parseInt(st.nextToken());
			for(j=x1; j<x1+x2; j++) {
				for(t=y1; t<y1+y2; t++) {
					map[j][t]++;
				}
			}		
			if(mx<x1+x2) mx = x1+x2;
			if(my<y1+y2) my = y1+y2;
		}
		for(j=0; j<mx; j++) {
			for(t=0; t<my; t++) {
				cnt[map[j][t]]++;
			}
		}
		for(i=1;i<=n;i++) {
			System.out.println(cnt[i]);
		}
	}

}
