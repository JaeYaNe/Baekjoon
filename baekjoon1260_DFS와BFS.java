

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon1260_DFS와BFS {

	private static int n;
	private static int[][] map;
	public static void DFS1260(int k, int[] chk) {
		chk[k] = 1;
		System.out.printf("%d ", k);
		for(int i = 1; i <= n; i++) {
			if(map[k][i]==1&&chk[i]==0) DFS1260(i, chk);
		}
	}
	public static void BFS1260(int k, int[] chk) {
		
	}
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int m,v,i,j;
		String input = bf.readLine();
		StringTokenizer st = new StringTokenizer(input);
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		v = Integer.parseInt(st.nextToken());
		
		int[][] map = new int[m+1][n+1];
		int[] chk = new int[m+1];
		for(i=0;i<m;i++) {
			input = bf.readLine();
			st = new StringTokenizer(input);
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			map[a][b] = map[b][a] = 1;
		}
		DFS1260(v,chk);
		//BFS1260(v,chk);

	}

}
