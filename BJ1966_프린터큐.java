

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BJ1966_프린터큐 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Queue<Integer> que = new LinkedList<>();
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine());
			
			while(st.hasMoreTokens()) que.add(Integer.parseInt(st.nextToken()));
			
			Queue<Integer> que2 = new LinkedList<>(que);
			int max = 0;
			while(!que.isEmpty()) {
				if(max < que.peek()) {
					max = que.poll();
				}
				else que.poll();
			}
		}
	}
}	
