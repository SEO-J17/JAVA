//2309
package �ڵ��׽�Ʈ�غ����;
import java.io.*;
import java.util.*;
public class BF_�ϰ������� {
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
