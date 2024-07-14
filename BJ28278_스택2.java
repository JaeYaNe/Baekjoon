import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BJ28278_스택2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Stack <Integer> stk = new Stack<>();
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<n; i++){
			st = new StringTokenizer(br.readLine());
			
			switch(Integer.parseInt(st.nextToken())) {
			case 1:
				stk.push(Integer.parseInt(st.nextToken()));
				break;
			case 2:
				if(stk.isEmpty()) sb.append("-1").append("\n");
				else {
					sb.append(stk.pop()).append("\n");
				}
				break;
			case 3: 
				sb.append(stk.size()).append("\n");
			    break;
			case 4: 
				if(stk.isEmpty()) sb.append("1").append("\n");
				else sb.append("0").append("\n");
				break;
			case 5:
				if(stk.isEmpty()) sb.append("-1").append("\n");
				else sb.append(stk.peek()).append("\n");
				break;
			}
		}
		br.close();
		System.out.println(sb);
	}
}