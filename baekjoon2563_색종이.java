import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon2563_색종이 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] map = new int[101][101];
		for(int i=0; i<n;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			for(int a=x; a<x+10; a++) {
				for(int b=y; b<y+10;b++) {
					map[a][b] = 1;
				}
			}
			
		}
		int cnt = 0;
		for(int i=0; i<101;i++) {
			for(int j=0; j<101;j++) {
				if(map[i][j]==1) cnt++;
			}
		}
		System.out.println(cnt);
	}

}
