//2309
package 코딩테스트준비기초;
import java.io.*;
import java.util.*;
public class BF_일곱난쟁이 {
	static int sum = 0;
	static int arr[];
	static ArrayList<Integer> result;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		result = new ArrayList<>();
		arr = new int [9];
		
 		for(int i = 0; i < 9; i++) {
 			arr[i] = Integer.parseInt(br.readLine());
		}
 		
 		Arrays.sort(arr);
 		
 		calc(0);
 		
 		for(int d : result) {
 			System.out.println(d);
 		}
 		
	}
	
	private static void calc(int idx) {
		int num = arr[idx];
		for(int i = 0; i < 9; i++) {
			if(i == idx) {
				continue;
			}else {
				num += arr[i];
				
			}
		}
	}
}
