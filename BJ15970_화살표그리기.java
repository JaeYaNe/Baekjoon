import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ15970_화살표그리기 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int x,y;
		
		int n = Integer.parseInt(br.readLine());
		int[][] map = new int[n][2];
		int[] result = new int[n];
		
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			x = Integer.parseInt(st.nextToken()); // 좌표
			y = Integer.parseInt(st.nextToken()); // 색상
			map[i][0] = x;
			map[i][1] = y;
		}
		Arrays.sort(map, (i, j) -> { //2차원 배열 정렬 
            if (i[1] == j[1]) {	// 같은 색상일 때 좌표를 정렬 // 이렇게 생각하면 됨 >> map[i][1] == map[j][1]
                return i[0] - j[0];	//i가 j보다 작다면 i는 앞 j는 뒤, i가 j보다 크다면 i는 뒤,j는 앞
            } else {			// 다른 색상일 때 색상을 정렬
                return i[1] - j[1];	//i가 j보다 작다면 i는 앞 j는 뒤, i가 j보다 크다면 i는 뒤,j는 앞
            }
        });
		
		int sum = 0;
		for(int i=0;i<n;i++) {
			// 첫번째 점인 경우
			if(i == 0) result[i] = map[i+1][0] - map[i][0];
			// 마지막 점인 경우
			else if(i == n-1) result[i] = map[i][0] - map[i-1][0];
			else {
				int tmp1 = Math.abs(map[i][0] - map[i - 1][0]); // 왼쪽 점과의 거리
                int tmp2 = Math.abs(map[i + 1][0] - map[i][0]); // 오른쪽 점과의 거리
                // i번째 점 왼쪽 오른쪽 모두 같은 색 
                if(map[i][1] == map[i + 1][1] && map[i - 1][1] == map[i][1])
                	result[i] = tmp1 < tmp2 ? tmp1 : tmp2;
                // i번째 점 오른쪽만 같은 색 
                else if(map[i][1] == map[i + 1][1] && map[i - 1][1] != map[i][1])
                	result[i] = tmp2;
                // i번째 점 왼쪽만 같은 
                else
                	result[i] = tmp1;
			}
		}
		for (int i : result) sum += i;
        System.out.println(sum);
	}

}
