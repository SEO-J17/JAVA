package ±×·¡ÇÁÅ½»ö;
import java.awt.Point;
import java.io.*;
import java.util.*;
public class À¯±â³ó¹èÃß {
	static int dx[] = {-1,1,0,0};
	static int dy[] = {0,0,-1,1};
	static int map [][];
	static boolean visit[][];
	static int m,n,k;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		
		while(t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			m = Integer.parseInt(st.nextToken());
			n = Integer.parseInt(st.nextToken());
			k = Integer.parseInt(st.nextToken());
			map = new int [m][n];
			visit = new boolean [m][n];
			int warm = 0;
			
			for(int i=0; i<k; i++) {
				st = new StringTokenizer(br.readLine());
				map[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())] = 1;
			}
			
			for(int i=0; i<m; i++) {
				for(int j=0; j<n; j++) {
					if(!visit[i][j] && map[i][j] == 1) {
						warm++;
						bfs(i,j);					
					}
				}
			}
			sb.append(warm).append("\n");
		}
		
		
		System.out.println(sb);
		
	}
	
	private static void bfs(int i, int j) {
		int x,y;
		Queue<Point> qu = new LinkedList<>();
		qu.add(new Point(i,j));
		visit[i][j] = true;

		while(!qu.isEmpty()) {
			Point temp = qu.poll();
			for(int s=0; s<4; s++) {
				x = temp.x+dx[s];
				y = temp.y+dy[s];
				if(x >=0 && y >= 0 && x < m && y < n ) {
					if(!visit[x][y] && map[x][y] == 1) {
						visit[x][y] = true;
						qu.offer(new Point(x,y));
					}
				}
			}
		}
	}
}
