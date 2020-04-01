package Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class PointSort2 {
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
				if(o1[1] == o2 [1]) {
					return Integer.compare(o1[0], o2[0]);		//pointsort1에서 순서만 바꿈.
				}else
					return Integer.compare(o1[1], o2[1]);
			}
		});
		
		for(int d=0; d<N; d++) {
			System.out.print(point[d][0]);
			System.out.println(" "+point[d][1]);
		}
			
	}
}
