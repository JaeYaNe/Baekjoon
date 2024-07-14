/*
문제해석)
1. 한 팀당 결과 총합이 5이하
2. 6개 팀의 총 승값과 총 패값이 동일
3. 6개 팀의 총 무승부 개수가 짝수
4. 무승부 개수의 과반수 이상을 한 팀이 가지고 있으면 안됨

4회의 테스트 케이스, 6개의 팀, 18번의 경기
풀이

*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ6987_월드컵 {
	static int[][] map = new int[6][3];
	static int[] dab = new int[4];
	static int i;
	private static void back(int x, int y) {
		if(dab[i]==1) return;
		if(y==6) { x++; y=x+1;}        // 비교를 다했어면 다음 팀 선택
		if(x==5) {dab[i]=1; return;}   // x가 5이면 분석가능
		
		if(map[x][0]>=1 && map[y][2]>=1)  // 승
		{
			map[x][0]--;map[y][2]--;
			back(x,y+1);
			map[x][0]++;map[y][2]++;
		}
		if(map[x][1]>=1 && map[y][1]>=1)  // 무
		{
			map[x][1]--;map[y][1]--;
			back(x,y+1);
			map[x][1]++;map[y][1]++;
		}
		if(map[x][2]>=1 && map[y][0]>=1) // 패
		{
			map[x][2]--;map[y][0]--;
			back(x,y+1);
			map[x][2]++;map[y][0]++;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		

		for (i = 0; i < 4; i++) {
			// 1. 입력받은 값 배열에 저장
			st = new StringTokenizer(br.readLine());
			int sw = 0;
			for (int j = 0; j < 6; j++) {
				
				map[j][0] = Integer.parseInt(st.nextToken());
				map[j][1] = Integer.parseInt(st.nextToken());
				map[j][2] = Integer.parseInt(st.nextToken());
				int sum = map[j][0]+map[j][1]+map[j][2];
				if(sum>5) sw = 1;
			}
			if(sw == 0) back(0,1);
		}

		System.out.printf("%d %d %d %d", dab[0], dab[1], dab[2], dab[3]);
	}

}