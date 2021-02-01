package 백트래킹;
import java.util.*;
import java.io.*;
public class N과M2 {
	static int arr[];
	static int n;
	static int m;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr = new int [m];
 		dfs(1,0);
	}
	
	
	private static void dfs(int cnt, int depth) {
		if(depth == m) {
			for(int d: arr) 
				System.out.print(d+" ");
			System.out.println();
			return;
		}
		
		for(int i=cnt; i<=n; i++) {
			arr[depth] = i;
			dfs(i+1, depth+1);
		}
	}
}
