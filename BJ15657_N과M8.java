/*
백트래킹 문제
1. n, m, inputArray에 값 넣기
2. for문의 i와 깊이 a 값들을 통해 num배열의 값을 설정
+. num배열은 깊이 a값이 m+1 이 되었을 때 출력문에 사용됨
아래에 동작구현 작성해둠.
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ15657_N과M8 {
	public static int n,m;
	public static int[] num = new int[9];
	public static int[] visited = new int[9];
	public static int[] inputArray = new int[9];
	public static StringBuilder sb = new StringBuilder();
	
	public static void back(int a, int b) {
		
		if(a > m) { //종료조건
			for(int j=1; j<=m; j++) {
				sb.append(num[j] + " ");
			}
			sb.append("\n");
			return;
		}
		for(int i=b;i<=n;i++) {	
            num[a] = inputArray[i];
			back(a+1,i);
		}
	}

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		for (int i=1; i<=n;i++) inputArray[i] = Integer.parseInt(st.nextToken());
		Arrays.sort(inputArray,1,n+1);
		
		back(1,1);
		System.out.println(sb);
	}

}

/*
1 7 8 9

(1)
if false
for문
  i = 1
  num[1] = 1		num[1]
  back(+1)

(2)
if flase
for문
  i = 1
  num[2] = 1		num[2]
  back(+1)

(3)
if ture
  for문
      j = 1
    num[j]		"1 "
    j = 2
    num[j]		"1 "
  /n			"/n"
return

(2)
for문
  i = 2
  num[2] = 7		num[2]
  back(+1)

(3)
if ture
  for문
      j = 1
    num[j]		"1 "
    j = 2
    num[j]		"7 "
  /n			"/n"
return
 */
