//15666
package 백트래킹;
import java.util.*;
import java.io.*;
public class N과M12 {
	static int n,m;
	static int arr[],result[];
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
		calc(0,0);
		
		System.out.println(sb);
		
	}
	private static void calc(int index, int depth) {
		if(depth == m) {
			for(int i=0; i<m; i++) {
				sb.append(result[i]).append(" ");
			}
			sb.append("\n");
			return;
		}
		
		int num=-1;
		for(int i=index; i<n; i++) {
			if(num != arr[i]) {
				num = arr[i];
				result[depth] = arr[i];
				calc(i, depth+1);
			}
		}
		
	}
}
