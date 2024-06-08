
import java.util.Scanner;
import java.util.StringTokenizer;
public class Baekjoon10810 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n,m,i,j,k;
		StringTokenizer st;		
		st = new StringTokenizer(sc.nextLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		int [] baguni = new int [n];
		for (int x=0;x<n;x++) {
			baguni[x] = 0;
		}
		for (int x=0;x<m;x++) {
			st = new StringTokenizer(sc.nextLine());
			i = Integer.parseInt(st.nextToken());
			j = Integer.parseInt(st.nextToken());
			k = Integer.parseInt(st.nextToken());

			for (int y=i-1; y<j; y++) {
				baguni[y] = k;
			}
		}
		for (int x=0;x<n;x++) {
			System.out.printf("%d ",baguni[x]);	
		}
	}
}