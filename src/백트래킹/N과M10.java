//15664
package 백트래킹;
import java.util.*;
import java.io.*;
public class N과M10 {
	static int n,m;
	static int result[],arr[];
	static boolean visit[];
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr = new int [n];
		visit = new boolean[n];
		result = new int [n];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		calc(0,0);
		
		System.out.println(sb);
		
	}
	
	
	private static void calc(int index, int depth) {
		if(depth == m) {
			for(int i=0; i<m; i++) {
				sb.append(result[i]).append(" ");
			}
			sb.append("\n");
			return;
		}
		
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=index; i<n; i++) {
			if(visit[i] != true) {
				int a = 0;
					for(int j=0; j < list.size(); j++) {
						if(list.get(j).equals(arr[i])) 
								a++;
					}
					
					if(a == 0) {
						visit[i] = true;
						list.add(arr[i]);
						result[depth] = arr[i];
						calc(i+1, depth+1);
						visit[i] = false;
					}
			}	
		}
	}
}
