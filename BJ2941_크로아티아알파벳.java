import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BJ2941_크로아티아알파벳 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> croatia = new ArrayList<>();
        croatia.add("c=");
        croatia.add("c-");
        croatia.add("dz=");
        croatia.add("d-");
        croatia.add("lj");
        croatia.add("nj");
        croatia.add("s=");
        croatia.add("z=");

        String input = br.readLine();
        br.close();

        int count = 0;
        for (String alphabet : croatia) {
            while (input.contains(alphabet)) {
                input = input.replaceFirst(alphabet, " ");
                count++;
            }
        }

        input = input.replace(" ", "");
        count += input.length();
        System.out.println(count);
    }
}
