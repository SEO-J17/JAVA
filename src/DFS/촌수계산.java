//2644
package DFS;
import java.util.*;
import java.io.*;
public class 촌수계산 {
	static int n;
	static int arr[][];
	static int man1,man2;
	static int num;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		n = Integer.parseInt(br.readLine());		//사람수 입력
		arr = new int [n+1][n+1];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		man1 = Integer.parseInt(st.nextToken());
		man2 = Integer.parseInt(st.nextToken());
		
		int m = Integer.parseInt(br.readLine());	//관계개수
		
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int a1 = Integer.parseInt(st.nextToken());
			int a2 = Integer.parseInt(st.nextToken());
			arr[a1][a2] = arr[a2][a1] = 1;
		}
		
		
		
		
	}
	
	private static void bfs(int man_1, int man_2) {
		boolean[] visit = new boolean [n+1];
		Queue<Integer> qu = new LinkedList<>();
		visit[man_1] = true;
		qu.add(man_1);
		
		while(!qu.isEmpty()) {
				int now = qu.poll();
				for(int j = 1; j <= n; j++) {
					if(arr[now][j] == 1 && !visit[j]) {
						visit[j] = true;
						qu.add(j);
					}
				}
			num++;
		}
	}
}
