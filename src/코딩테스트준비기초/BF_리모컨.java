//1107
package �ڵ��׽�Ʈ�غ����;

import java.io.*;
import java.util.*;

public class BF_������ {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int channel = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		
		boolean trouble [] = new boolean [10];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < m; i++) {
			int temp = Integer.parseInt(st.nextToken());
			trouble[temp] = true;
		}
		
		int result = Math.abs(channel - 100);
		
		for(int i = 0; i <= 999999; i++) {
			String temp = String.valueOf(i);
			int len = temp.length();
			
			boolean chk = false;
			for(int j = 0; j < len; j++) {
				if(trouble[temp.charAt(j) - '0']) {
					chk = true;
					break;
				}
			}
			
			if(!chk) {
				int min = Math.abs(channel - i) + len;
				result = Math.min(min, result);
			}
		}
		
		System.out.println(result);
		
	}
}
