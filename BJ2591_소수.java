import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ2591_소수 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int minNum = 10000;
		int sumNum = 0;
		boolean foundPrime = false;
		
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		br.close();	
		
		for(int i=n; i<=m; i++) {
			if(checkPrime(i)) {
				foundPrime = true;
				if(minNum>i) {
					minNum = i;
				}
				sumNum += i;
			}
		}
		if(foundPrime) {
			System.out.println(sumNum);
			System.out.println(minNum);
		} else {
			System.out.println(-1);
		}
		
	}
	public static boolean checkPrime(int input) {
		if (input <= 1) return false; 
		if (input == 2) return true;
		if (input % 2 == 0) return false; // 짝수처리

		int sqrt = (int) Math.sqrt(input);
		for (int i = 3; i <= sqrt; i += 2) { 
			if (input % i == 0) return false; // 나누어 떨어지면 소수가 아님
		}

	    return true;
	}
}

