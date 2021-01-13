package ���;
import java.util.*;
import java.io.*;

public class �ϳ���ž {
	public static StringBuilder sb = new StringBuilder();	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		sb.append((int)(Math.pow(2,n)-1)).append('\n');
		move(n,1,3); 		//1���� �ִ� ������ 3������ �ű�
		System.out.println(sb);
		
	}

	private static void move(int n, int x, int y) {
		if(n > 1)
			move(n-1, x, 6-x-y);
	
		sb.append(x + " " + y + "\n");
		if(n > 1)
			move(n-1, 6-x-y, y);
		
	}
}