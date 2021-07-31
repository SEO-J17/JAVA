//2309
package 코딩테스트준비기초;
import java.io.*;
import java.util.*;
public class BF_일곱난쟁이 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		int sum = 0;
		int arr[];
		boolean chk = false;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		arr = new int [9];
		
 		for(int i = 0; i < 9; i++) {
 			arr[i] = Integer.parseInt(br.readLine());
 			sum += arr[i];
		}
 		
 		
 		for(int i = 0; i < 9; i++) {
 			for(int j = 0; j < 9; j++) {
 				if(i == j) {
 					continue;
 				}
 				if(sum - arr[i] -arr[j] == 100) {
 					arr[i] = 0;
 					arr[j] = 0;
 					chk = true;
 				}
 			}
 			if(chk == true) {
 				break;
 			}
 		}
 		
 		Arrays.sort(arr);

 		for(int d : arr) {
 			if(d != 0)
 			System.out.println(d);
 		}
	}
	
}
