
import java.util.Scanner;
public class baekjoon2444 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = 0; i<2*n-i; i++) {
			
			for (int j = 0; j<n-i-1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j<2*i+1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for (int i = 1; i<n; i++) {
			for (int j = 0; j<i; j++) {
				System.out.print(" ");
			}
			for (int y = 0; y<2*n-(2*i+1); y++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
