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
		
		for(int i = 1; i <= m; i++) {
			st = new StringTokenizer(br.readLine());
			arr[Integer.parseInt(st.nextToken())][i] = Integer.parseInt(st.nextToken()); 
		}
		
		for(int i = 1; i <= m; i++) {
			bfs(i,)
		}
		
		
		
		
	}
}
