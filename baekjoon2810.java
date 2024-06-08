

import java.util.Scanner;

public class baekjoon2810 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		int cnt = 1;
		String str = sc.nextLine();
		for(int i=0; i<n;i++) {
			if(str.charAt(i)=='L') {
				i++;
				cnt++;
			} else {
				cnt++;
			}
			if(cnt > n) cnt =n;
		}
		System.out.println(cnt);
	}
}
