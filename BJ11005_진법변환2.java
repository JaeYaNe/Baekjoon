import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ11005_진법변환2 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        br.close();

        String[] inputList = input.split(" ");
        int N = Integer.parseInt(inputList[0]);
        int B = Integer.parseInt(inputList[1]);
        
        StringBuilder answer = new StringBuilder();

        while (N > 0) {
            int a = N % B;
            char c;
            if (a >= 10) {
                c = (char) (a - 10 + 'A');
            } else {
                c = (char) (a + '0');
            }
            answer.append(c);
            N /= B;
        }

        System.out.println(answer.reverse().toString());
    }
}
