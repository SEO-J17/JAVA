//2805 절단기 높이설정을 한다면 높이설정보다 위에가 잘리는것이다.

package BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class CutTree {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(a.readLine());
		Integer tree = Integer.parseInt(st.nextToken());
		Integer minmum = Integer.parseInt(st.nextToken());
		int [] treemeter = new int [tree];
		StringTokenizer st2 = new StringTokenizer(a.readLine());
		
		for(int i=0; i<tree; i++) {
			treemeter[i] = Integer.parseInt(st2.nextToken());
		}
		Arrays.sort(treemeter);
		
		int start =0;
		int end = treemeter[tree-1];		//나무의 최대길이
		int mid = (start+end)/2;			//절단기의 중간값
		
		for(int w=0; w<tree; w++) {
			
		}
		
		
		
		
		
		
	}
}




