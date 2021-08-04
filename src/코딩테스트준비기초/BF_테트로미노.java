//14500
package 코딩테스트준비기초;
import java.io.*;
import java.util.*;

public class BF_테트로미노 {
	static int arr[][];
	static boolean visit[][];
	static int n,m;
	static int dx[] = {1,-1,0,0};
	static int dy[] = {0,0,1,-1};
	static int max = -1;
	public static void main(String[] args) throws IOException,NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int [n][m];
		visit = new boolean [n][m];
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < m; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				dfs(i,j,0,0);
				dfs2(i,j);
			}
		}
		
		System.out.println(max);
		
	}
	

	private static void dfs(int x, int y, int depth, int result) {
		if(depth == 4) {
			max = Math.max(max, result);
			return;
		}
		
		for(int i = 0; i < 4; i++) {
			int xx = x + dx[i];
			int yy = y + dy[i];
			
			if(xx >= 0 && yy >=0 && xx < n && yy < m) {
				if(!visit[xx][yy]) {
					visit[xx][yy] = true;
					dfs(xx,yy,depth + 1, result + arr[xx][yy]);
					visit[xx][yy] = false;
				}
			}else 
				continue;
		}
	}
	
	//'ㅗ' 모형은 ㅗ,ㅓ,ㅏ,ㅜ 로 돌아 갈 수 있기 때문에 '┼' 에서 날개 하나를 빼는 식으로 구현한다.
	//ㅗ 모양은 DFS로 구현이 안되므로 따로 구현해야 한다.
	//dfs2는 +모양에서 하나씩 튀어나온 부분을 빼는 것을 구현한 메소드 이다.
	private static void dfs2(int x, int y) {
		int shape = 4;				//+모양, 상하좌우
		int min = Integer.MAX_VALUE;
		int sum = arr[x][y];
		
		for(int i = 0; i < 4; i++) {
			int xx = x + dx[i];
			int yy = y + dy[i];
			
			//튀어나온 모양이 2개이상 없다면 ㅗ 모양이 아니므로 종료하게 한다.
			if(shape <=2)
				return;
			//맵바깥에 있으면 안된다.
			if(xx < 0 || yy < 0 || xx >= n || yy >= m) {
				shape--;
				continue;
			}
			
			min = Math.min(min, arr[xx][yy]);
			sum += arr[xx][yy];
		}
		
		//+모양일때 튀어나온 부분 중 가장 작은 값을 빼줘야 ㅗ 모양이 나온다. 
		if(shape == 4) {
			sum -= min;
		}
		max = Math.max(max, sum);
	}
}
