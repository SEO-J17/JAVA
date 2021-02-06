//15665
package 백트래킹;
import java.util.*;
import java.io.*;
public class N과M11 {
	static int n,m;
	static int arr[],result[];	//같은수를 출력하려면 visit이 필요없다.
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr = new int [n];
		result = new int [n];
		st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		
		calc(0);
		System.out.println(sb);
		
	}
	
	
	private static void calc(int depth) {
		if(depth == m) {
			for(int i=0; i<m; i++) {
				sb.append(result[i]).append(" ");
			}
			sb.append("\n");
			return;
		}
		
		int num =-1;
		for(int i = 0; i<n; i++) {
			if(num != arr[i]) {
				num = arr[i];
				result[depth] = arr[i];
				calc(depth+1);
			}
		}
	}
}
