import java.io.IOException;
import java.util.Scanner;

public class BJ2806_달팽이 {

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        int V = sc.nextInt();
        
        int days = (V - B - 1) / (A - B) + 1;
        
        System.out.println(days);
	}

}
