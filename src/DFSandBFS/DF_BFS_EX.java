//1260 정점개수,간선개수,탐색을 시작할 번호가 주어지고 dfs,bfs수행한 결과를 출력해라.
package DFSandBFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DF_BFS_EX {
	static int N,M,V=0;
	static boolean [] visit;
	static int [][] map;
	
	public static void main(String[] args) throws IOException {
		BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(a.readLine());
		N=Integer.parseInt(st.nextToken());		//정점개수 입력
		M=Integer.parseInt(st.nextToken());		//간선개수 입력
		V=Integer.parseInt(st.nextToken());		//시작할 정점의 번호 입력
		
		map = new int [N+1][N+1];		//행렬이기 때문에 인덱스 0을 안쓰기 위함+1을 한다!
		visit = new boolean[N+1];		//방문했는지 체크용도.
		
		for(int i=0; i<M; i++) {
			StringTokenizer temp = new StringTokenizer(a.readLine());
			int x = Integer.parseInt(temp.nextToken());
			int y = Integer.parseInt(temp.nextToken());
			map[x][y] = map[y][x] = 1;		//인접 행렬.
		}
		//dfs 시작.
		dfs(V,N);
		System.out.println();				//bfs 위해 줄바꿈!
		visit = new boolean[N+1];
	}

	private static void dfs(int V, int n) {
		if(visit[V]) {
			return;				//방문한 경우 빠져나옴
		}
		visit[V] =true;
		System.out.print(V+" ");
		
		for(int d=1; d<=n; d++) {
			if(map[V][d] == 1) {
				dfs(d, n);
			}
		}
	}
}
