
import java.util.Scanner;
public class baekjoon10818 {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		int n,mini,max;

		n = sc.nextInt();
		int [] numbers = new int[n];
	    // �迭 �Է�
		for (int i=0; i<n; i++){
			numbers[i] = sc.nextInt();
		} 
	     mini = numbers[0];
	     max = numbers[0];
		for (int i=0; i<n; i++){
	         if (mini > numbers[i]) {
	             mini = numbers[i];
	         }
		}
	     for (int i=0; i<n; i++){
	    	 if (max < numbers[i]) {
	    		 max = numbers[i];
	    	 }
	     }
	     System.out.printf("%d %d",mini,max);
		}
	}