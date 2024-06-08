

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon9086 {

	public static void main (String[]args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		for (int i=0;i<x;i++) {
			String str = br.readLine();	//���ڿ� �Է¹ޱ�
			int n = str.length(); // length()�Լ��� ���ڿ��� ���� ������ ����
			//%s���ڿ� ���
			System.out.printf("%s%s\n",str.charAt(0),str.charAt(n-1));

		} 
	}
}