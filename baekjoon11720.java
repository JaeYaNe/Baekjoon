
import java.util.Scanner;
public class baekjoon11720 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		int x=0;
		String str = sc.nextLine();
		for (int i=0; i<n; i++) {
			if(str.indexOf(str.charAt(i))>=0) {
				// 1�� �ƽ�Ű�ڵ�� 49, 0�� �ƽ�Ű�ڵ�� 48 ���� ���� 1�� ���´�.
				x+=(int)str.charAt(i)-'0';
			}
		}
		System.out.print(x);
	}
}
