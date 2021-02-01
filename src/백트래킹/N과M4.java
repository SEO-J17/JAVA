package 백트래킹;
import java.util.*;
import java.io.*;
public class N과M4 {
	static int n,m;
	static int arr[];
	
	public static void main(String[] args) throws IOException,NumberFormatException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr = new int [m];
		dfs(1,0);
	}

	private static void dfs(int cnt, int depth) {
		
	}
}
