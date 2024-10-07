import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ1978_소수찾기 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] inputs = br.readLine().split(" ");
        br.close();
        int[] nums = new int[inputs.length];

        for (int i = 0; i < inputs.length; i++) {
            nums[i] = Integer.parseInt(inputs[i]);
        }

        int answer = 0;

        for (int num : nums) {
            if (isPrime(num)) {
                answer++;
            }
        }
        System.out.println(answer);
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
