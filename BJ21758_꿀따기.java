

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ21758_꿀따기 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        String input = bf.readLine();
        
        String[] numStrings = input.split(" ");
        long numSum = 0;
        long[] num = new long[n];
        for(int i = 0; i<n; i++) {
        	num[i] = Integer.parseInt(numStrings[i]);
        	numSum += num[i]; // ���� ����
        }
        long max = 0;
        // �߰��� ������ ���� ���
        for (int i = 1; i < n-1; i++) {
            if(max < numSum - num[0]-num[n-1]+num[i]) 
            	max = numSum - num[0]-num[n-1]+num[i];
        }

        // 0���� ������ ���� ���
        long secondBee= 0;
        for (int i = n-2; i >= 0; i--) {
        	secondBee += num[i];
        	if(max < numSum *2 -num[n-1]*2-secondBee-num[i])
        	   max = numSum *2 -num[n-1]*2-secondBee-num[i];
        }

        // n���� ������ ���� ���
        secondBee= 0;
        for (int i = 1; i < n - 1; i++) {
        	secondBee += num[i];
        	if(max < numSum * 2-num[0]*2-secondBee-num[i])
        		max = numSum * 2-num[0]*2-secondBee-num[i];
        }
        System.out.println(max);
    }
}
