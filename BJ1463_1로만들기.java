public class BJ1463_1로만들기 {
    public static int minOperations(int n) {
        int[] dp = new int[n + 1];

        for (int i = 2; i <= n; i++) {
            // ���� ���� 1�� ����� �ּ� ���� ���� ���մϴ�.
            dp[i] = dp[i - 1] + 1;

            // 2�� ������ �������� 1�� �� ���� 2�� ���� ��� �� �� ���� ���� ���� �����մϴ�.
            if (i % 2 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            }

            // 3���� ������ �������� 1�� �� ���, 2�� ���� ���� 3���� ���� ��� �� �� ���� ���� ���� �����մϴ�.
            if (i % 3 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 3] + 1);
            }
        }

        return dp[n];
    }

    public static void main(String[] args) {
        int n = 10;
        int result = minOperations(n);
        System.out.println("���� " + n + "�� 1�� ����� ���� �ּ� ���� ��: " + result);
    }
}
