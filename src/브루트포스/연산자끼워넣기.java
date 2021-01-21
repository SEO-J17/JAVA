//14888
//����,����,����,������

package ���Ʈ����;
import java.util.*;
import java.io.*;
public class �����ڳ����ֱ� {
	static int max = Integer.MIN_VALUE;
	static int min = Integer.MAX_VALUE;
	static int n; 
	static int arr[] ;
	static int op[] = new int [4];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		arr = new int [n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i < n; i++) {arr[i] = Integer.parseInt(st.nextToken());}
		st = new StringTokenizer(br.readLine());
		for(int i=0; i < 4; i++) {op[i] = Integer.parseInt(st.nextToken());}
		
		calc(arr[0], 1);
		System.out.println(max);
		System.out.println(min);
	}
	
	public static void calc(int num, int index) {
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
