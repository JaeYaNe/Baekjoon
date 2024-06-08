
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class baekjoon27866 {
	public static void main (String[]args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		String str = br.readLine();	//���ڿ� �Է¹ޱ�
		int n = Integer.parseInt(br.readLine()); //�������ڿ��� �Է¹ް� ����ȯ �� ����
		
		System.out.print( str.charAt(n)); // charAt�Լ��� ���ڿ��� n��¥ ���� ���
	}
}
/* Scanner ���
 package org.selfstudy.Baekjoon;

import java.util.Scanner;
public class baekjoon27866 {
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		int n = sc.nextInt();
		
		System.out.print( str.charAt(n-1)); // charAt�Լ��� ���ڿ��� n-1��¥ ���� ���
	}
} 
 */
