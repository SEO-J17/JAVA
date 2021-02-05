package 백트래킹;
import java.util.*;
import java.io.*;
public class N과M {
	static int arr[];
	static boolean chk[];
	public static void main(String[] args) throws IOException {
	BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st =new StringTokenizer(br.readLine());
	int cnt = Integer.parseInt(st.nextToken());
	int leng = Integer.parseInt(st.nextToken());
	arr = new int [leng];
	chk = new boolean [cnt];
	dfs(cnt, leng, 0);
	}

	public static void dfs(int cnt, int leng, int deep) {
		if(deep == leng) {
			for(int d : arr)
				System.out.print(d+" ");
			
			System.out.println();
			return;	//재귀 종료
		}
		
		for(int i = 0; i<cnt; i++) {
			if(chk[i] != true ) {
				chk[i] = true;
				arr[deep] = i+1;
				dfs(cnt, leng, deep+1);
				chk[i] = false;
			} 
		}
		
	}
}
