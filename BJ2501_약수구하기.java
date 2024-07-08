import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BJ2501_약수구하기 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		br.close();
		
		String[] inputList = input.split(" ");
        int N = Integer.parseInt(inputList[0]);
        int K = Integer.parseInt(inputList[1]);

        ArrayList<Integer> minList = new ArrayList<>();
        for(int i=1; i<=N; i++) {
        	if(N % i == 0) minList.add(i);
        }
        
        if(minList.size() < K) {
        	System.out.println(0);
        } else {
        	System.out.println(minList.get(K-1));
        }
	}
}
