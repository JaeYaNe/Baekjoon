
import java.util.Scanner;
public class baekjoon10952 {
    public static void main(String arg[]) {
        Scanner sc=new Scanner(System.in);
        int a,b;
        a = sc.nextInt();
        b = sc.nextInt();
        while (a != 0 && b != 0) {
            System.out.println(a+b);
            a = sc.nextInt();
            b = sc.nextInt();
        }
    }
}