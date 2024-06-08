
import java.util.Scanner;
public class SmokedDuck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int StartTimeH,StartTimeM,CookTime,EndTimeH,EndTimeM;
	    StartTimeH = sc.nextInt();
        StartTimeM = sc.nextInt();
        CookTime = sc.nextInt();
        EndTimeH = StartTimeH;
        
        if(StartTimeM+CookTime>=60) {         // 60�� �ʰ� �Ǻ�
            EndTimeM = (StartTimeM+CookTime)%60;
            EndTimeH = EndTimeH+(StartTimeM+CookTime)/60;
            if(EndTimeH>=24) // 24�� �ʰ� �ݺ�
                EndTimeH = EndTimeH%24;
        }else 
            EndTimeM = StartTimeM+CookTime;

        System.out.printf("%d %d",EndTimeH,EndTimeM);
        System.out.println("");
        System.out.println(120%60);
	}
}