import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BJ25206_너의평점은 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		double cnt =0;
		double score=0;
		
		for(int i=0; i<20; i++) {
			String input = br.readLine();
			String[] inputs = input.split(" ");
			if(!inputs[2].equals("P")) {
				cnt += Double.parseDouble(inputs[1]);
				score += Double.parseDouble(inputs[1]) *getPoint(inputs[2]);
			}
		}
		System.out.printf("%6f",(score/cnt));
	}
	
	private static double getPoint(String grade) {
		switch (grade) {
		 case "A+": return 4.5;
         case "A0": return 4.0;
         case "B+": return 3.5;
         case "B0": return 3.0;
         case "C+": return 2.5;
         case "C0": return 2.0;
         case "D+": return 1.5;
         case "D0": return 1.0;
         case "F": return 0.0;
		}
		return 0.0;
	}
}
