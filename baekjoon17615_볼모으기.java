import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon17615_볼모으기 {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n,i,j,cnt;
		int R = 0;
		int B = 0;

		n = Integer.parseInt(bf.readLine());
		int[] stk = new int[n];
		String input = bf.readLine();
		
		int min = n;
		for(i=0;i<n;i++) {
			stk[i] = input.charAt(i);
			if (input.charAt(i) == 'R') R++;
			else B++;
		}
		cnt = 0;
		for(i=0;i<n;i++) {	// �������� �������� �̵���Ų ���
			if(stk[i] == 'R') cnt++;
			else break;
		}
		if(min > R-cnt) min = R-cnt;
		cnt = 0;
		for(i=n-1;i>=0;i--) {	// �������� �������� �̵���Ų ���
			if(stk[i] == 'R') cnt++;
			else break;
		}
		if(min > R-cnt) min = R-cnt;
		cnt = 0;
		for(i=0;i<n;i++) {	// �Ķ����� �������� �̵���Ų ���
			if(stk[i] == 'B') cnt++;
			else break;
		}
		if(min > B-cnt) min = B-cnt;
		cnt = 0;
		for(i=n-1;i>=0;i--) {	// �Ķ����� �������� �̵���Ų ���
			if(stk[i] == 'B') cnt++;
			else break;
		}
		if(min > B-cnt) min = B-cnt;
		System.out.println(min);
	}

}
