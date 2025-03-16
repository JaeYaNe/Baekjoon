import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stz = new StringTokenizer(br.readLine());
        int y = Integer.parseInt(stz.nextToken());
        int x = Integer.parseInt(stz.nextToken());

        String input = "";
        for(int i=0; i<y; i++) {
            input += br.readLine();
        }

        String row1 = "";
        String row2 = "";

        for(int i=0; i<y; i++){
            if(i%2==1) {
                row1 += "W";
                row2 += "B";
            } else {
                row1 += "B";
                row2 += "W";
            }
        }

        String caseA = "";
        String caseB = "";
        for(int i = 0; i<x; i++) {
            if(i % 2 == 1) {
                caseA += row1;
                caseB += row2;
            } else {
                caseA += row2;
                caseB += row1;
            }
        }

        System.out.println("입력받은 값 : "+ input);
        System.out.println("입력받은 값 길이 : "+ input.length());
        System.out.println("caseA 값 : "+ caseA);
        System.out.println("caseA 값 길이 : "+ caseA.length());
        System.out.println("caseB 값 : "+ caseB);
        System.out.println("caseB 값 길이 : "+ caseB.length());

        int cntA = 0;
        int cntB = 0;
        for(int i=0; i<input.length(); i++) {
            if(input.charAt(i) != caseA.charAt(i)) cntA++;
            if(input.charAt(i) != caseB.charAt(i)) cntB++;
        }

        System.out.println(cntA);
        System.out.println(cntB);

        System.out.println(Math.min(cntA, cntB));
    }
}
