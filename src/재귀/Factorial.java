package Àç±Í;
import java.io.*;
import java.util.*;

public class Factorial {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int fac =1;
		for(int i=1; i<=n; i++) {
			fac*=i;
		}
		System.out.println(fac);
		
	}
}
