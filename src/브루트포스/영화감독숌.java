//1436
package ���Ʈ����;
import java.io.*;
import java.util.*;

public class ��ȭ������ {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int target=666;
		int cnt=0;
		
		while(true) {
			if(n == 1) {
				System.out.println(666);
				break;
			}
			if(String.valueOf(target).contains("666")) {
				cnt++;
				if(cnt == n) {
					System.out.print(target);
					break;
				}
			}
			target++;
		}
		
	}
}
