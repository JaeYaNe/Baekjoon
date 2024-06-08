
import java.util.Scanner;
public class baekjoon10871 {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		int n,x,m;
        m=0;
		n = sc.nextInt();
        x = sc.nextInt();
		int [] numbers = new int[n];
		for (int i=0; i<n; i++){
			numbers[i] = sc.nextInt();
		} // x������ ���� �� ���� üũ
		for (int i=0; i<n; i++){
			if (numbers[i] < x) {
                    m++;
			}
		}
		int [] smallNumbers = new int[m];
		m = 0;
		for (int i=0; i<n; i++){
			if (numbers[i] < x) {
				smallNumbers[m] = numbers[i];
				m++;
			}
		}
		for (int i=0; i<m; i++) {
			System.out.printf("%d ",smallNumbers[i]);
		}
	}
}