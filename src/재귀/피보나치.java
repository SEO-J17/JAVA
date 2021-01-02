package 재귀;
import java.io.*;
import java.util.*;

public class 피보나치 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
			System.out.println(pibonach(n));
	}

	private static int pibonach(int num) {
		if(num ==0) return 0;
		if(num ==1) return 1;
		return pibonach(num-1)+pibonach(num-2);
	}
}
