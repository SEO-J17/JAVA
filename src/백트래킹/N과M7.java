package 백트래킹;
import java.util.*;
import java.io.*;
public class N과M7 {
	static int n,m;
	static boolean visit[];
	static int arr[];
	static int result[];
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
			BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st =new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			m = Integer.parseInt(st.nextToken());
			arr = new int [n];
			result = new int [n];
			visit = new boolean [n];
			st =new StringTokenizer(br.readLine());
			
			for(int i=0; i<n; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(arr);
			calc(0,0);
			
			System.out.println(sb);
		}
		
		
		private static void calc(int index,int depth) {
			if(depth == m) {
				for(int i=0; i<m; i++) {
						sb.append(result[i]).append(" ");
					}
					sb.append("\n");
					return;
				}
			
				for(int i=index; i<n; i++) {
						result[depth] = i;
						result[depth] = arr[i];
						calc(i+1,depth+1);
				}
			
			}			
		}