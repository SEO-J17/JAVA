package 코딩테스트준비기초;

import java.io.*;
import java.util.*;

public class BF_날짜계산 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
//		(1 ≤ E ≤ 15, 1 ≤ S ≤ 28, 1 ≤ M ≤ 19)
		int E = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int e = 1;
		int s = 1;
		int m = 1;
		int result = 1;
		
			
			while(true) {
				if(e == E && s == S && m == M) 
					break;
				
				++result;
			
				++e;
				if(e > 15) 
					e = 1;
				
				++s;
				if(s > 28) 
					s = 1;
				
				++m;
				if(m > 19) 
					m = 1;
			
			}
			
			System.out.println(result);
			
	}
}
