import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class BJ2531_회전초밥 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()); // 초밥 개수		8
		int d = Integer.parseInt(st.nextToken()); // 초밥 가지수	30
		int k = Integer.parseInt(st.nextToken()); // 연속 접시수	4
		int c = Integer.parseInt(st.nextToken()); // 쿠폰 번호		30
		
		int[] line = new int[n];

		for(int i=0;i<n;i++) line[i] = Integer.parseInt(br.readLine());

		br.close();
		int max = 0;
		for(int i=0;i<n;i++) {
			//Set 초기화
			HashSet<Integer> list = new HashSet<>();
			for(int j=0;j<k;j++) {
				if(i+j>=n) list.add(line[i+j-n]);
				else list.add(line[i+j]);
			}
			// 쿠폰을 적용한 Set의 크기가 max보다 크다면 max값 변경
			list.add(c);
			if(max < list.size()) max = list.size();
		}
		System.out.println(max);
	}

}
