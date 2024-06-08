

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class baekjoon10845_큐{

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		Queue<Integer> que = new LinkedList<>();
		int n = Integer.parseInt(bf.readLine());
		String str = "";
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			str = st.nextToken();

			if (str.equals("pop")) {
				if (!que.isEmpty())
					System.out.println(que.poll());
				else
					System.out.println(-1);

			} else if (str.equals("size")) {
				System.out.println(que.size());

			} else if (str.equals("empty")) {
				if (que.isEmpty())
					System.out.println(1);
				else
					System.out.println(0);

			} else if (str.equals("front")) {
				if (!que.isEmpty()) {
					System.out.println(que.peek());
				} else
					System.out.println(-1);
			} else if (str.equals("back")) {
				if (!que.isEmpty()) {
					int last = 0;
					for (Integer num : que)
						last = num;
					System.out.println(last);
				} else
					System.out.println(-1);

			} else {
				que.add(Integer.parseInt(st.nextToken()));
			}
		}

	}

}
