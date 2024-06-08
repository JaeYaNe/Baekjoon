
import java.util.Scanner;
import java.util.StringTokenizer;
public class Baekjoon10813 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,m,i,j,a;
		
		StringTokenizer st;
		st = new StringTokenizer(sc.nextLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		int [] baguni = new int [n];
		for (int x=0; x<n; x++) {
			baguni [x] = x+1;
		}
		for(int x=0; x<m; x++) {
			st = new StringTokenizer(sc.nextLine());
			i = Integer.parseInt(st.nextToken());
			j = Integer.parseInt(st.nextToken());
			a = baguni [i-1];
			baguni [i-1] = baguni [j-1];
			baguni [j-1] = a;
		}
		for (int y=0;y<baguni.length;y++) {
			System.out.printf("%d ",baguni[y]);	
		}
	}
}