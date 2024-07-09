import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ1003_피보나치함수 {
	public static int zr=0;
	public static int on=0;
	public static int fibonacci(int n) {
		if(n == 0) {
			zr++;
			return 0;
		}
		else if(n == 1) {
			on++;
			return 1;
		}
		else return fibonacci(n-1) + fibonacci(n-2);
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++) {
			zr=0;
			on=0;
			fibonacci(Integer.parseInt(br.readLine()));
			sb.append(zr+" "+on).append("\n");
		}
		System.out.println(sb);
	}

}
