
import java.util.*;
public class baekjoon10811 {
	private static void reverse(int[]poket, int i, int j) {
		int[]copy = Arrays.copyOfRange(poket, i, j);
		
		int len = copy.length;
		for (int y=0; y<len;y++) {
			poket[i+y]= copy[len - (y+1)];
		}
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n,m,i,j;
		StringTokenizer st;						// StringTokenizerŸ�� ���� ����
		st = new StringTokenizer(sc.nextLine());
		n = Integer.parseInt(st.nextToken());	// �Է°� ��ūȭ �� ����ȯ �ϰ� �� n,m������ �� �Է�
		m = Integer.parseInt(st.nextToken());
		
		//�ٱ��� �迭 ����, �� �Ҵ�
		int [] poket = new int[n];
		for (int y=0; y<n; y++) {
			poket[y] = y+1;
		}
		// i, j �� �Է�
		StringTokenizer nb;	
		for (int y=0; y<m; y++) {
			nb = new StringTokenizer(sc.nextLine());
			i = Integer.parseInt(nb.nextToken());	// �Է°� ��ū���� �л��ϱ�
			j = Integer.parseInt(nb.nextToken());
			reverse(poket, i-1 ,j);
		}
		for (int y=0; y<n; y++) {
			System.out.printf("%d ",poket[y]);
		}
	}

}

