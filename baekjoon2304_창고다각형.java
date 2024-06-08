

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon2304_창고다각형 {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n, i, j, box, max = 0, m=0 ;
		n = Integer.parseInt(bf.readLine());
		
		int[] location = new int[n];
		int[] height = new int[n];
		for(i=0;i<n;i++) {
			String input = bf.readLine();
			StringTokenizer st = new StringTokenizer(input);
			location[i] = Integer.parseInt(st.nextToken());
			height[i] = Integer.parseInt(st.nextToken());
			if(max < height[i]) max = height[i];
		}
		
		for(i=0;i<n;i++) {
			for(j=i+1;j<n;j++) {
				if(location[i] > location[j]) {
					// ��ġ, ���� ����
					box = location[i];
					location[i] = location[j];
					location[j] = box;
					
					box = height[i];
					height[i] = height[j];
					height[j] = box;
				}
			}
		}
		for(i=0;i<n;i++) { // ���� ���� ��� ã��
			if(height[i] == max) m = i;
		}
		int answer = height[m]; //���� ���� ��� ���� ���ϱ�
		for(i=0;i<m;i++) { // ���� ���� ��� ����
			for(j=i+1;j<=m;j++) {
				if(height[i] < height[j]) {
					answer += height[i] * (location[j]-location[i]);
					break;
				}
				else height[j] = 0;
			}		
		}

		
		for(i=n-1;i>=0;i--) { // ���� ���� ��� ����
			for(j=i-1;j>=0;j--) {
				if(height[i] < height[j]) {
					answer += height[i] * (location[i]-location[j]);
					break;
				}
				else height[j] = 0;
			}		
		}
		System.out.println(answer);
	}

}
