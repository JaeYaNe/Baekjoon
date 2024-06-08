import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class baekjoon20186_수고르기 {

	public static void main(String[] args) throws IOException{
		List <Integer> list = new LinkedList<>();
		int n,i,k;
		String str;
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		str = bf.readLine();
		StringTokenizer st = new StringTokenizer(str);
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		
		str = bf.readLine();
		st = new StringTokenizer(str);
		for(i=0;i<n;i++) list.add(Integer.parseInt(st.nextToken()));
		list.sort(Comparator.reverseOrder());

		int answer = 0;
		for(i=0;i<k;i++) {
			answer += list.get(i)-i;
		}

		System.out.println(answer);
		
	}

}
