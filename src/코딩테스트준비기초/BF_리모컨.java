//1107
package 코딩테스트준비기초;

import java.io.*;
import java.util.*;

public class BF_리모컨 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String channel = br.readLine();
		int m = Integer.parseInt(br.readLine());
		int trouble [] = new int [m];
		int remote [] = new int [10];
		
		for(int i = 0; i < 10; i++) {
			remote[i] = i;
		}
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < m; i++) {
			remote[Integer.parseInt(st.nextToken())] = 44;
		}
		
		String temp = "";
		int temp2 = 0;
		while(true) {
			for(int i = 0; i < 10; i++) {
				
			}
		}
		
	}
}
