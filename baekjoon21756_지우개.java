import java.util.Scanner;

public class baekjoon21756_지우개{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] arr = new int[n];
		for(int i=0;i<n;i++) arr[i] = i+1;
			
		while(n!=1) {
			int t = 0;
			for(int j=1; j<n;j+=2) arr[t++] = arr[j];
			
			n=t;
		
		}
		System.out.println(arr[0]);
		
	}

}
