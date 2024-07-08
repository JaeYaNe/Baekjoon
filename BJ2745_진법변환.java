import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ2745_진법변환 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		br.close();

		String[] inputList = input.split(" ");
		String N = inputList[0];
		int B = Integer.parseInt(inputList[1]);

		int answer = 0;
		for (int i = 0; i < N.length(); i++) {
			char c = N.charAt(i);
			int value;

			if (c >= '0' && c <= '9') {
				value = c - '0';
			} else {
				value = c - 'A' + 10;
			}
			answer = answer * B + value;
		}
		System.out.println(answer);
	}
	
}
