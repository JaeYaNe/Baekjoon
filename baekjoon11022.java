
import java.util.Scanner;
public class baekjoon11022 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t,a,b;
        t= sc.nextInt();
            
        for(int i=1;i<=t;i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.printf("Case #%d: %d + %d = %d\n",i,a,b,a+b);
        }
    } 
}

