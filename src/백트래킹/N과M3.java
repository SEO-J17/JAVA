package 백트래킹;
import java.util.*;
import java.io.*;
public class N과M3 {
	static int n,m;
	static int arr[];
	static StringBuilder sb = new StringBuilder(); 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr = new int [m];
		dfs(0);
		System.out.print(sb);
	}
	
	public static void dfs(int depth) {
		if(depth == m) {
			for(int d : arr)
				sb.append(d).append(" ");
				sb.append("\n");
			return;
		}
		
		for(int i = 0; i <n; i++) {
				arr[depth] = i+1;
				dfs(depth+1);
			}
	}
}
