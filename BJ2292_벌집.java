import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ2292_벌집 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());
		br.close();
		
		int range = 1;
        int answer = 1; 
        int cnt = 6;  
        
        while (range < input) {
            range += cnt;
            cnt += 6;
            answer++;
        }
        
        System.out.println(answer);
	}

}
