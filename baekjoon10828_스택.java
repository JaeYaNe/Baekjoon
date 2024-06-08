

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon10828_스택{

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n, i;
		String str;
		n = Integer.parseInt(bf.readLine());
		int[] stk = new int[n];
		int cnt = 0;
		for(i=0; i<n; i++) {
			String input = bf.readLine();
			StringTokenizer st = new StringTokenizer(input);
			str = st.nextToken();
			if (str.equals("push")) {
				stk[cnt] = Integer.parseInt(st.nextToken());
				cnt++;
			}
			else if(str.equals("pop")) {
				if(cnt > 0 && stk[cnt-1] != 0) {
					System.out.println(stk[cnt-1]);
					stk[cnt] = 0;
					cnt--;
				}
				else // �ƹ��͵� ���� ��
					System.out.println(-1);
			}
			else if(str.equals("size")) {
				System.out.println(cnt);
			}
			else if(str.equals("empty")) {
				int result = cnt == 0 ? 1 : 0;
				System.out.println(result);
			}
			else if(str.equals("top")) {
				if(cnt != 0) {
					System.out.println(stk[cnt-1]);
				}
				else {
					System.out.println(-1);
				}
			}
		}
		

	}

}
