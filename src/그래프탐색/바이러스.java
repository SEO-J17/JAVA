package 그래프탐색;
import java.util.*;
import java.io.*;
public class 바이러스 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int link = Integer.parseInt(br.readLine());
		
		int arr[][] = new int [n+1][n+1];
		boolean visit[] = new boolean[n+1];
		int cnt=0;
 		for(int i=0; i<link; i++) {
 			StringTokenizer st = new StringTokenizer(br.readLine());
 			int a = Integer.parseInt(st.nextToken());
 			int b = Integer.parseInt(st.nextToken());
 			arr[a][b]=arr[b][a]=1;
		}
 		
 		Queue<Integer> qu =new LinkedList<>();
 		int start=0;
 		qu.add(1);
 		visit[1] = true;
 		while(!qu.isEmpty()) {
 			start = qu.poll();
 			for(int i=1; i<=n; i++) {
 				if(arr[start][i] ==1 && visit[i] != true) {
 					qu.add(i);
 					visit[i] = true;
 					cnt++;
 				}
 			}
 		}
		
 		System.out.println(cnt);
 		
		
	}
}
