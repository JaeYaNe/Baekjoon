
import java.util.Scanner;
public class baekjoon5622 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int n;
		int time = 0;
		for (int i =0; i<str.length(); i++) {
			char ch = str.charAt(i);
			int n1 = (int)ch+32;
			if (97<=n1&&n1<=99) {
				time += 3;
			}
			else if (100<=n1&&n1<=102) {
				time += 4;
			}
			else if (103<=n1&&n1<=105) {
				time += 5;
			}
			else if (106<=n1&&n1<=108) {
				time += 6;
			}
			else if (109<=n1&&n1<=111) {
				time += 7;
			}
			else if (112<=n1&&n1<=115) {
				time += 8;
			}
			else if (116<=n1&&n1<=118) {
				time += 9;
			}
			else {
				time += 10;
			}
		}
		System.out.print(time);
		
	}
}
