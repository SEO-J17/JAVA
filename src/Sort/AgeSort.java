//10814 나이순으로 정렬하고 나이가 같으면 가입한순으로 정렬한다.
package Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class AgeSort {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader a =new BufferedReader(new InputStreamReader(System.in));
		Integer N = Integer.parseInt(a.readLine());
		String [][] arr = new String [N][2];
		for(int i=0; i<N; i++) {
			StringTokenizer st =new StringTokenizer(a.readLine());
			arr[i][0] = st.nextToken();
			arr[i][1] = st.nextToken();
		}
		//나이순 정렬
		Arrays.sort(arr, new Comparator<String []>() {
			public int compare(String [] o1, String [] o2) {
					return Integer.compare(Integer.parseInt(o1[0]),Integer.parseInt(o2[0]));
			}
		});
		
		
		for(int d=0; d<N; d++) {
			System.out.println(arr[d][0]+" "+arr[d][1]);
		}
		
	}
}
