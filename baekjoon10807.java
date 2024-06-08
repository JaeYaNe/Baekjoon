
import java.util.Scanner;
public class baekjoon10807 {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		int n,v,m;
		m = 0;
		n = sc.nextInt();
		int [] numbers = new int[n];
		for (int i=0; i<n; i++){
			numbers[i] = sc.nextInt();
		}
		v = sc.nextInt();
		for (int i=0; i<n; i++){
			if (numbers[i] == v) {
				m++;
			}
		}
		System.out.print(m);
	    }
	}