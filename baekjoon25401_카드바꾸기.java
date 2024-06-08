

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon25401_카드바꾸기 {

	public static void main(String[] args) throws IOException{
		//���������� �����ϴ��� Ȯ���ϱ� (���Ʈ���� �˰���)
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int[] num = new int[n];
		for(int i=0; i<n;i++)
			num[i] = Integer.parseInt(st.nextToken());
		
		int max = 500;
		
		for(int i=0; i<n;i++) {
			for(int j=i+1;j<n; j++)  {
				if((num[j]-num[i])%(j-i)==0) {
					int cnt = 0;
					int p = (num[j]-num[i])/(j-i);
					int t = num[i]-(p*i);
					for(int k=0; k<n; k++) {
						if(num[k] != t) cnt++;
						t += p;
					}
					if(max>cnt) max = cnt;
				}
			}
		}
		System.out.println(max);
	}

}
