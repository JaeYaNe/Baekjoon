

import java.util.Scanner;
import java.util.StringTokenizer;

public class baekjoon14696_딱지놀이{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,i,j;
		String str1 = null;
		String str2 = null;
		String trash;
		int[] arr1 = new int[100];
		int[] arr2 = new int[100];
		
		n = sc.nextInt();
		sc.nextLine();
		for(i=0;i<n;i++) {
			char answer = 'D';
			for(j=0;j<4;j++) {
				arr1[j] = 0; 
				arr2[j] = 0; // �ʱ�ȭ
			}
			str1 = sc.nextLine();
			str2 = sc.nextLine();
			StringTokenizer st1 = new StringTokenizer(str1);
			StringTokenizer st2 = new StringTokenizer(str2);
			trash = st1.nextToken();
			trash = st2.nextToken();
			while(st1.hasMoreTokens()) arr1[Integer.parseInt(st1.nextToken())-1]++;
			while(st2.hasMoreTokens()) arr2[Integer.parseInt(st2.nextToken())-1]++;
			for(j=3;j>=0;j--) {
				if (arr1[j] > arr2[j]) answer = 'A';
				else if (arr1[j] < arr2[j]) answer = 'B';
				
				if(answer != 'D')break;
			}
			System.out.println(answer);
		}
		
	}

}
