

import java.util.Arrays;
import java.util.Scanner;

public class baekjoon10809 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int[] ABC = new int[26];
		Arrays.fill(ABC, -1); // Arrays(a,b) �迭 a�� ��� ���� b�� �����.
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			int asc = 97; // �ƽ�Ű �ڵ� a
			for (int j = 0; j < ABC.length; j++) {
				if (asc == ch) {
					if (ABC[asc - 97] == -1) {
						ABC[asc - 97] = i;
					}
				}
				asc++;
			}
		}
		for (int i = 0; i < ABC.length; i++) {
			System.out.printf("%d ", ABC[i]);
		}
	}
}

/*
		Scanner sc = new Scanner(System.in);
		char[] ABC = new char[26];
		char ch = 'a';
		for (int i = 0; i < ABC.length; i++) {
			ABC[i] = ch;
			ch++;
		}
		String str = sc.nextLine();
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);

			for (int j = 0; j < ABC.length; j++) {
				if (ABC[j] == ch)
					ABC[j] = (char) (i + '0');

			}
		}

		for (int i = 0; i < ABC.length; i++) {
			if (ABC[i] >= 48 && ABC[i] <= 57) {
				System.out.print(ABC[i] + " ");
			} else {
				System.out.print("-1 ");
			}

		}
*/