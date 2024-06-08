

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon2564_경비원 {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String input = bf.readLine();
		StringTokenizer st = new StringTokenizer(input);
		
		int n,i,j,x,y,chk=0,direction,location,answer=0; //����, ��ġ
		x = Integer.parseInt(st.nextToken());
		y = Integer.parseInt(st.nextToken());
		int[] map = new int[2*x+2*y];
		
		n = Integer.parseInt(bf.readLine());
		for(i=1;i<=n+1;i++) { //n+1�� ������
			input = bf.readLine();
			st = new StringTokenizer(input);
			direction = Integer.parseInt(st.nextToken());
			location = Integer.parseInt(st.nextToken());
			
			if(direction == 1) chk = location;
			else if(direction == 2) chk = 2*x+y-location;
			else if(direction == 3) chk = 2*x+2*y-location;
			else chk = x+location;
			
			map[chk] = i;

		}
		for(i=1;i<=n;i++) { 
			int min = 2*x+2*y; //�ּҰ��� �ʱⰪ �ִ�� ����
			
			int find = chk;
			for(j=1;;j++) { // ���� ���� Ž��
				find++;
				if(find==2*x+2*y) find=0;
				if(map[find]==i) break;
			}
			if(min>j) min = j;
			
			find = chk;
			for(j=1;;j++) { // ���� ���� Ž��
				find--;
				if(find<0) find=2*x+2*y-1;
				if(map[find]==i) break;
			}
			if(min>j) min = j;
			
			answer += min;
		}
		System.out.println(answer);
	}

}
