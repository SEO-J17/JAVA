//5430
package Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class AC {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
		Integer testcase = Integer.parseInt(a.readLine());
		ArrayDeque<Integer> qu = new ArrayDeque<Integer>();
		String [] solution = new String [testcase];
		
		for(int k=0; k<testcase; k++) {
		String func = a.readLine();
		Integer arr_num = Integer.parseInt(a.readLine());			//배열의 길이
		String arr = a.readLine();
		//덱에 숫자만 걸러내는것
		for(int i=1;i<arr.length(); i++) {
			if(i%2 !=0) {
				qu.add(arr.charAt(i)-'0');
			}
			if(i== arr.length()-2) {
				break;
			}
		}
		//기능.
		for(int i=0; i<func.length(); i++) {
			int [] temp = new int [arr_num];
			if('R' == func.charAt(i)) {
				for(int j=0; j<arr_num-1;j++) {
						temp[j] = qu.pollFirst();
				}
				for(int d=arr_num-2; d>=0; d--) {
					qu.addLast(temp[d]);
				}
			}if('D' == func.charAt(i)) {
				qu.pollFirst();
			}
		}
		}
		for(int i: qu) {
		System.out.println(i);
		}
	}
}
