package ���ڿ�;
import java.io.*;
import java.util.*;
public class �ܾ��ǰ��� {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer a = new StringTokenizer(br.readLine());
		int cnt=0;
		while(a.hasMoreTokens()) {
			a.nextToken();
			cnt++;
		}
		System.out.println(cnt);
	}
}
