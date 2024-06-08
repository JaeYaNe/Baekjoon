import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class baekjoon10799_쇠막대기 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		List<String> Stack = new LinkedList<>();
		String input = bf.readLine();
		int answer=0;
		int k = -1;
		for(int i = 0; i<input.length(); i++) {
			if(input.charAt(i) == '(') {
				Stack.add("(");
				k++;
			}
			else if(input.charAt(i) == ')'&& input.charAt(i-1) == '(') {
				answer+=k;
				k--;
			}
			else if(input.charAt(i) == ')') { 
				answer++;
				k--;
			}
		}
		System.out.println(answer);
	}
}
