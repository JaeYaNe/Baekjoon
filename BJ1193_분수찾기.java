import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ1193_분수찾기 {
	 public static void main(String[] args) throws IOException{
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        int input = Integer.parseInt(br.readLine());
			br.close();
			
	        int dir = 1; // 방향
	        int cnt = 0; 

	        // 방향찾기
	        while (cnt < input) {
	        	cnt += dir;
	            dir++;
	        }

	        dir--; 
	        cnt -= dir; 

	        int loc = input - cnt;
	        int num;
	        int den;

	        if (dir % 2 == 0) { // 짝수 (분자+, 분모-)
	        	num = loc;
	            den = dir - loc + 1;
	        } else { 			// 홀수 (분모-, 분모+)
	        	num = dir - loc + 1;
	            den = loc;
	        }
	        System.out.println(num + "/" + den);
	    }
}
