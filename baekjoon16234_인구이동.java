import java.util.*;

public class baekjoon16234_인구이동 {
    static int N, L, R;
    static int[][] map;
    static boolean[][] visited;

    static int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public static void BFS(int x, int y) {
    	if(visited[x][y] == false) {
    		
    	}
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        L = scanner.nextInt();
        R = scanner.nextInt();

        map = new int[N][N];
        visited = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                map[i][j] = scanner.nextInt();
            }
        }
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                BFS(i,j);
            }
        }
    }
}
