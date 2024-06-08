/*
문제해석)
1. 한 팀당 결과 총합이 5를 초과하면 무조건 False
2. 6개 팀의 총 승값과 총 패값이 같아야함. 다르면 False
3. 6개 팀중 총무값은 짝수이고, 예제 3과 같이 무가 한쪽에 쏠리면 False

4회의 테스트 케이스, 6개의 팀, 18번의 경기
풀이
1. 4회 반복 for문에 6번 반복 for문을 넣고 승,무,패의 값을 넣는다.
2. 5회 초과 경기가 있는지 체크
3. 총 승값과 총 패값이 같은지 체크
4. 무승부 짝이 맞는지 확인
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ6987_월드컵 {

	static int[][] map = new int[6][3];
	
	private static boolean checkFive(int a) {
		if(a > 5) return true;
		return false;
	}
	
	private static boolean checkWinLoss(int a, int b) {
		if(a != b) return true;
		return false;
	}
	
	private static boolean checkTie(int[] lst) {
		for(int i = 0; i<5; i++) {
			if(lst[i]>0) {
				for(int j = i+1; j<6; j++) {
					if(lst[j]>0) {
						lst[i] -= 1;
						lst[j] -= 1;
						i--;
						break;
					}
				}
			}
		}
		for(int i = 0; i<6; i++) {
			if(lst[i]>0) return true;
		}
		return false;
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		// 1. 4회 반복 for문에 6번 반복 for문을 넣고 승,무,패의 값을 넣는다.
		for (int i=0; i<4; i++) {
			st = new StringTokenizer(br.readLine());
			int win = 0; //승
			int[] tie = new int[6]; //무
			int loss = 0;//패
			for (int j=0; j<6; j++) {
				map[j][0] = Integer.parseInt(st.nextToken());
				map[j][1] = Integer.parseInt(st.nextToken());
				map[j][2] = Integer.parseInt(st.nextToken());
				
				// 2. 5회 초과 경기가 있는지 체크 (하나라도 true라면 0 출력후 i for문으로)
				if (checkFive(map[j][0]) || checkFive(map[j][1]) || checkFive(map[j][2])) {
					sb.append("0 ");
					break;
				}
				
				// 3. 총 승값과 패값이 같은지 확인을 위해, 총 승무패 값을 넣는다.
				
				win += map[j][0];
				tie[j] = map[j][1];
				loss+= map[j][2];
			}
			// 3. 승 패 값이 다르다면 true로 0출력후 i for문으로
			if(checkWinLoss(win,loss)) {
				sb.append("0 ");
				continue;
			}
			if(checkTie(tie)) {
				sb.append("0 ");
				continue;
			}
			sb.append("1 ");
			
			
		}
		System.out.println(sb);
	}

}