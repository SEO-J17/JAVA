//2583
package DFS;
import java.io.*;
import java.util.*;
public class 영역구하기 {
	static boolean visit[][];
	static int n,m,k;
	static int dx[] = {0,0,1,-1};
	static int dy[] = {1,-1,0,0};
	static int cnt;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());		
		m = Integer.parseInt(st.nextToken());		
		k = Integer.parseInt(st.nextToken());
		
		visit = new boolean[n][m];
		
		for(int i = 0; i < k; i++) {
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			
			for(int j = y1; j < y2; j++) {
				for(int h = x1; h < x2; h++) {
					visit[j][h] = true;
				}
			}
		}
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				cnt = 0;
				if(visit[i][j] == false) {
					dfs(i,j);
					list.add(cnt);
				}
			}
		}
		
		Collections.sort(list);
		
		System.out.println(list.size());
		for(int i : list) {
			System.out.print(i+" ");
		}
		
	}
	
	
	private static void dfs(int x, int y) {
		visit[x][y] = true;
		cnt++;
		for(int i = 0; i < 4; i++) {
			int xx = dx[i] + x;
			int yy = dy[i] + y;
			
			if((xx >= 0 && yy >= 0) && (xx < n && yy < m)) {
				if(visit[xx][yy] == false) {
					dfs(xx, yy);
				}
			}
			
		}
	}
}
