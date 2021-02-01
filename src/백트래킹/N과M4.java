package 백트래킹;
import java.util.*;
import java.io.*;
public class N과M4 {
	static int n,m;
	static int arr[];
	static StringBuilder sb;
	public static void main(String[] args) throws IOException,NumberFormatException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		sb = new StringBuilder();
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr = new int [m];
		dfs(0,0);
		System.out.print(sb);
	}

	private static void dfs(int cnt, int depth) {
		if(depth == m) {
			for(int d : arr)
				sb.append(d).append(" ");
			sb.append("\n");
			return;
		}
		
		for(int i = cnt; i < n; i++) {
			arr[depth] = i+1;
			dfs(i, depth+1);
		}
	}
}
