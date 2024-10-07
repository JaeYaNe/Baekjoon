import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringJoiner;

public class BJ9506_약수들의합 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        while (n != -1) {
            n = Integer.parseInt(br.readLine());
            if (n == -1) break; 
            ArrayList<Integer> facs = new ArrayList<>();
            int result = 0;
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    facs.add(i);
                    result += i;
                }
            }
            if (result == n) {
                System.out.printf("%d = ", n);
                StringJoiner sj = new StringJoiner(" + ");
                for (int fac : facs) {
                    sj.add(String.valueOf(fac));
                }
                System.out.println(sj.toString());
            } else {
                System.out.printf("%d is NOT perfect.\n", n);
            }
        }
    }
}
