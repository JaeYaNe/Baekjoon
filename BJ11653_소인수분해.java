import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BJ11653_소인수분해 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		br.close();
		
		ArrayList<Integer> primeList = new ArrayList<>();
		ArrayList<Integer> resultList = new ArrayList<>();
		
		for(int i=1; i<=N; i++) {
			if(checkPrime(i)) {
				primeList.add(i);
			}
		}
		
		int M = N;
		for (Integer prime : primeList) {
			if (prime * prime > N) break;
			while (M % prime == 0) {
				resultList.add(prime);
                M /= prime;
            }
		}
		
		if(M > 1) resultList.add(M);
		
		  for (Integer prime : resultList) {
	            System.out.println(prime);
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
