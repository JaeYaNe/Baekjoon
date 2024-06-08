
import java.util.Scanner;
public class problem5597 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		int [] group1 = new int[28];
		int [] group2 = new int[30];
        
        // 30���� �й��⼮�� ����
		for (int i=0;i<group2.length;i++) {
			group2[i] = i+1;
        }
        // ������ �л� �й� �ޱ�
		for (int i=0;i<group1.length;i++) {
			group1[i] = sc.nextInt();
		} 
		// �⼮�ο� ������ �л��� ���� 0���� �ٲٱ�
		for (int i=0;i<30;i++) {
			for (int j=0;j<28;j++) {
				if (group2[i] == group1[j]) {
					group2[i] = 0;
				}	
			}
		} // ������ �����ʾƼ� ���� 0�� �ƴ� �й� ���
		for (int i=0;i<30;i++) {
			if (group2[i] != 0) {
				System.out.println(group2[i]);
			}
		}
	}
}
