package ���ڿ�;
import java.io.*;
import java.util.*;
public class KMP {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String a = br.readLine();
		
		for(int i=0; i<a.length(); i++) {
			if('A' <= a.charAt(i) && a.charAt(i) <= 'Z') {
				String temp =String.valueOf(a.charAt(i));
				sb.append(temp);
			}
		}
		 System.out.println(sb);
		
	}
}

//StringTokenizer tokenizer = new StringTokenizer(br.readLine(), "-");
//
//while (tokenizer.hasMoreTokens()) {
//    sb.append(tokenizer.nextToken().charAt(0));
//}
//StringTokenzier�� ����ϸ� ��ū���ι޾� �ϳ��� ������ ��!