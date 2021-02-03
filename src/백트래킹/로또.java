//6603
package 백트래킹;
import java.io.*;
import java.util.*;
public class 로또 {
	static int k;
	static int arr[];
	static boolean visit[];
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			k = Integer.parseInt(st.nextToken());
			
			if(k == 0) {break;}
			
			visit = new boolean[k];
			arr = new int [k];
			
			for(int i=0; i<k; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			calc(0,0);
			sb.append("\n");
		}
		
		System.out.println(sb);
		
	}
	
	
	
	private static void calc(int index, int depth) {
		if(depth == 6) {
			for(int i=0; i < k; i++) {
				if(visit[i] == true)
					sb.append(arr[i]).append(" ");
			}
			sb.append("\n");
			return;
		}
		
		
		for(int i=index; i < k; i++) {
			if(visit[i] != true) {
				visit[i]=true;
				calc(i+1,depth+1);
				visit[i] = false;
			}
			
		}
	}

}
