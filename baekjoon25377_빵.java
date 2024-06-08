

import java.util.Scanner;
import java.util.StringTokenizer;

public class baekjoon25377_빵 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();  //������ ��
		sc.nextLine();
		
		int minTime = 1001;  //�ּ� �ð�
		for(int i=0; i<n;i++) {
			String str = sc.nextLine();
			StringTokenizer st = new StringTokenizer(str);
			
			int goTime = Integer.parseInt(st.nextToken());
			int mkTime = Integer.parseInt(st.nextToken());
			
			if(goTime <= mkTime && mkTime < minTime) minTime = mkTime;
		}
		if(minTime != 1001)	System.out.println(minTime);
		else System.out.println(-1);
	
		
	}

}
