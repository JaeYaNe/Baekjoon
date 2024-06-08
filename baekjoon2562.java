
import java.util.Scanner;
public class baekjoon2562 {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		int max,a;
        a=0;
		int [] numbers = new int[9];
	    // �迭 �Է�
		for (int i=0; i<9; i++){
			numbers[i] = sc.nextInt();
		} 
	     max = numbers[0];
	     for (int i=0; i<9; i++){
	    	 if (max < numbers[i]) {
	    		 max = numbers[i];
                 a = i;
	    	 }
	     }
	     System.out.printf("%d\n%d",max,a+1);
		}
	}