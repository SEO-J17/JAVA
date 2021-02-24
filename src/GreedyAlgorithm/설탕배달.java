package GreedyAlgorithm;
import java.io.*;
import java.util.*;
public class º≥≈¡πË¥ﬁ {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int cnt=0;
		
		while(true) {
			 if(n%5 == 0) {
				 cnt += n/5;
				 System.out.println(cnt);
				 break;
			 }else if (n < 0) {
				 System.out.println(-1);
				 break;
			 }else {
				 n -= 3;
				 cnt++;
			 }
		}
	}
}
