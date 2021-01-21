//14888
//µ¡¼À,»¬¼À,°ö¼À,³ª´°¼À

package ºê·çÆ®Æ÷½º;
import java.util.*;
import java.io.*;
public class ¿¬»êÀÚ³¢¿ö³Ö±â {
	static int max;
	static int min;
	static int n; 
	static int arr[] ;
	static int op[] = new int [4];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		arr = new int [n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		for(int i=0; i < n; i++) {arr[i] = Integer.parseInt(st.nextToken());}
		for(int i=0; i < 4; i++) {op[i] = Integer.parseInt(st2.nextToken());}
		
		calc(arr[0], 1);
		System.out.println(max);
		System.out.println(min);
	}
	
	private static void calc(int num, int index) {
		if(index == n) {
			max = Math.max(max, num);
			min = Math.min(min, num);
			return;
		}
		
		for(int i=0; i < 4; i++) {
			if(op[i] > 0) {
				op[i]--;
				switch (i) {
				case 0: calc(num + arr[index], index+1); break;
				case 1: calc(num - arr[index], index+1); break;
				case 2: calc(num * arr[index], index+1); break;
				case 3: calc(num / arr[index], index+1); break;
				}
				op[i]++;
			}
		}
		
		
	}
}
