
import java.util.Scanner;
public class problem3052{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		int a,b=0;
		int [] arr1 = new int[10];
		int [] arr2 = new int[42];
        // arr1�� 10���� �� �Է¹ޱ�
		for (int i=0;i<arr1.length;i++) {
			arr1[i] = sc.nextInt();
        }
        sc.close();
        // ���������� ���� arr2�� �ε����� �����ϰ� �ش� �迭�� �� 1�� ���� 
        for (int i=0;i<arr1.length;i++) {
			a = arr1[i]%42;
			arr2[a] = 1;
        } // arr2�迭�� ���� ���� 0�� �ƴҰ�� ī��Ʈ 1����
		for (int i=0;i<arr2.length;i++) {
			if (arr2[i] != 0) {
					b++;
				}
		}
		System.out.printf("%d",b);
	}	
}