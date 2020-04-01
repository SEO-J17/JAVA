//11650 2차원 평면에 점 N개가 점들을 정렬하라.

package Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class PointSort {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
		Integer N = Integer.parseInt(a.readLine());
		int [][] point = new int [N][2];
		
		for(int i=0; i<N; i++) {
		   StringTokenizer st= new StringTokenizer(a.readLine());
		   int temp1 = Integer.parseInt(st.nextToken());
		   int temp2 = Integer.parseInt(st.nextToken());
		   point [i][0] = temp1;
		   point [i][1] = temp2;
		}
		
		Arrays.sort(point, new Comparator<int []>() {
			public int compare(int[] o1, int[] o2) {
				if(o1[0] == o2 [0] ) {
					return Integer.compare(o1[1], o2[1]);
				}else
					return Integer.compare(o1[0], o2[0]);
			}
		});
		for(int d=0; d<N; d++) {
			System.out.print(point[d][0]);
			System.out.println(" "+point[d][1]);
		}
			
	}
}
