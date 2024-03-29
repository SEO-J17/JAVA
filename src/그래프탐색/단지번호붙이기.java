//2667
package 그래프탐색;
import java.awt.Point;
import java.io.*;
import java.util.*;
public class 단지번호붙이기 {
	static int dx[] = {-1,1,0,0};
	static int dy[] = {0,0,-1,1};
	static int apartnum=0;
	static boolean visit[][];
	static int map[][];
	static int n;
	static ArrayList<Integer> list = new ArrayList<>();
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		map = new int [n][n];
		visit = new boolean [n][n];
		
		for(int i=0; i<n; i++) {
			String temp = br.readLine();
			for(int j=0; j<n; j++) {
				map[i][j] = temp.charAt(j)-'0';
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(map[i][j] == 1 && !visit[i][j]) {
					apartnum++;
					bfs(i,j);
				}
			}
		}

		System.out.println(apartnum);
		Collections.sort(list);
		
		for(int d : list)
			System.out.println(d);
		
	}
	
	
	private static void bfs(int i, int j) {
		Queue<Point> qu = new LinkedList<>();
		int x,y;
		int cnt=1;
		qu.offer(new Point(i,j));
		visit[i][j] = true;
		
		while(!qu.isEmpty()) {
			Point now = qu.poll();
			
			for(int s=0; s<4; s++) {			//상하좌우
				x = now.x+dx[s];
				y = now.y+dy[s];
				
				if(x >=0 && y >= 0 && x<n && y<n) {
					if(map[x][y] == 1 && visit[x][y] == false) {
						qu.offer(new Point(x,y));
						visit[x][y] = true;
						cnt++;
					}
				}
			}
		}
		list.add(cnt);
	}
}
//awt point는 좌표를 나타내는 것이다. 원의 좌표. 좌표를 통쨰로 가져오며 .x .y로 x좌표 y좌표를 꺼낸다.