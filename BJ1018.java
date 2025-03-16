// 3X3 OR 4X4 기준으로 설명

/*              WBWB
    WBW         BWBW
    BWB         WBWB
    WBW         BWBW

    1. 제한시간 2초로 매우 여유로움. 따라서 그냥 for문 돌리면 됨.
    2. W로 시작, B로 시작 두 case에 맞게 배열 만들기
    3. 만든 배열과 입력받은 배열 비교(다른값 cnt)
    4. 가장 작은 cnt 출력
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ1018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stz = new StringTokenizer(br.readLine());
        
        int y = Integer.parseInt(stz.nextToken()); // 행 (세로)
        int x = Integer.parseInt(stz.nextToken()); // 열 (가로)
        
        // 보드 입력받기
        char[][] board = new char[y][x];
        
        for (int i = 0; i < y; i++) {
            board[i] = br.readLine().toCharArray();
        }

        int minPaint = Integer.MAX_VALUE;

        // 가능한 8x8 크기의 체스판을 모두 검사
        for (int i = 0; i <= y - 8; i++) {
            for (int j = 0; j <= x - 8; j++) {
                minPaint = Math.min(minPaint, countRepaint(board, i, j));
            }
        }

        System.out.println(minPaint);
    }

    // (x, y)에서 8x8 체스판생성 case 2개 검사
    private static int countRepaint(char[][] board, int x, int y) {
    	
    	 char[][] caseA = {
	        {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
	        {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
	        {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
	        {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
	        {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
	        {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
	        {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
	        {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'}
	    };

	    // B로 시작하는 8x8 패턴
	    char[][] caseB = {
	        {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
	        {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
	        {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
	        {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
	        {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
	        {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
	        {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
	        {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'}
	    };
    	
        int repaintW = 0; // W로 시작하는 경우
        int repaintB = 0; // B로 시작하는 경우

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[x + i][y + j] != caseA[i][j]) repaintW++;
                if (board[x + i][y + j] != caseB[i][j]) repaintB++;
            }
        }

        return Math.min(repaintW, repaintB);
    }
}
