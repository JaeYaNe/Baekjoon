

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon2743 {

	public static void main (String[]args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		String str = br.readLine();	//���ڿ� �Է¹ޱ�
		
		System.out.print(str.length()); // length()�Լ��� ���ڿ��� ���� ���
	}
}