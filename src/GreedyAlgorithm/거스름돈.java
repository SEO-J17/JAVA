package GreedyAlgorithm;
import java.io.*;
import java.util.*;
public class �Ž����� {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = 1000 - Integer.parseInt(br.readLine());
		int cnt = 0;
		
		if(n >= 500) {
			int temp = n-500;
			cnt += 1+temp/100;
			cnt += (temp%100)/50;
			cnt += (temp%100%50)/10;
			cnt += (temp%100%50%10)/5;
			cnt += (temp%100%50%10%5)/1;
		}else {
			cnt += n/100;
			cnt += (n%100)/50;
			cnt += (n%100%50)/10;
			cnt += (n%100%50%10)/5;
			cnt += (n%100%50%10%5)/1;
		}
		
		
		System.out.println(cnt);
		
		
	}
}
//�迭�� ��Ƽ� for���� �̿��ϴ� ����� ����
