import java.util.Scanner;

public class BJ19532 {

    static int countRepaint(char[][] board, int startRow, int startCol, char[][] pattern1, char[][] pattern2) {
        int count1 = 0, count2 = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[startRow + i][startCol + j] != pattern1[i][j]) {
                    count1++;
                }
                if (board[startRow + i][startCol + j] != pattern2[i][j]) {
                    count2++;
                }
            }
        }
        return Math.min(count1, count2);
    }

    static int minRepaintChessboard(char[][] board, int n, int m) {
        char[][] pattern1 = {
            {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
            {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
            {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
            {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
            {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
            {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
            {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
            {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'}
        };

        char[][] pattern2 = {
            {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
            {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
            {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
            {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
            {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
            {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
            {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
            {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'}
        };

        int minRepaint = Integer.MAX_VALUE;
        for (int i = 0; i <= n - 8; i++) {
            for (int j = 0; j <= m - 8; j++) {
                int repaintCount = countRepaint(board, i, j, pattern1, pattern2);
                minRepaint = Math.min(minRepaint, repaintCount);
            }
        }

        return minRepaint;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();

        char[][] board = new char[n][m];
        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            board[i] = line.toCharArray();
        }

        int result = minRepaintChessboard(board, n, m);
        System.out.println(result);
    }
}