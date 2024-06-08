

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon10798_세로읽기 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int i,j,maxlen=0;
		String[] arr = new String[5];
		for(i=0;i<5;i++) {
			arr[i] = bf.readLine();
			if(maxlen<arr[i].length()) maxlen = arr[i].length();
		}
		
		for(i=0;i<maxlen; i++) {
			for(j=0;j<5;j++) {
				if(arr[j].length() < i+1) continue;
				System.out.print(arr[j].charAt(i));
			}
		}
	}

}
