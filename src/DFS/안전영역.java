//2468
package DFS;
import java.util.*;
import java.io.*;
public class 안전영역 {
	static int n;
	static int arr[][];
	static int arr2[][];
	static boolean visit[][];
	static int dx[] = {0,0,-1,1};
	static int dy[] = {1,-1,0,0};
	static int cnt;
	static int max;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		arr = new int [n][n];
		arr2 = new int [n][n];
		
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		max = 1;
		
		for(int i = 1; i < 101; i++) {
			cnt = 0;
			visit = new boolean [n][n];
			
			for(int j = 0; j < n; j++) {
				for(int k = 0; k <n; k++) {
					if(arr[j][k] <= i) {
						arr2[j][k] = 0;		//0이 물에 잠긴것.
					}else
						arr2[j][k] = 1;
				}
			}
				
			
			for(int j = 0; j < n; j++) {
				for(int k = 0; k <n; k++) {
					if(arr2[j][k] == 1 && visit[j][k] != true) {
						dfs(j,k);
						cnt++;
					}
				}
			}
			
			max = Math.max(cnt,max);
			
		}
	
		System.out.println(max);
		
	}

	
	
	private static void dfs(int x, int y) {
		visit[x][y] = true;
		
		for(int i=0; i<4; i++) {
			int xx = x + dx[i];
			int yy = y + dy[i];
			
			if( (xx >=0 && yy >=0) && (xx < n && yy < n) ){
				if(arr2[xx][yy] == 1 && visit[xx][yy] != true) {
					dfs(xx, yy);
				}
			}
		}
	}
	
	
	
	
}
