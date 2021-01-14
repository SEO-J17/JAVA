//2309
package 브루트포스;
import java.io.*;
import java.util.*;

public class 일곱난쟁이 {
	public static void main(String[] args) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int [] cand = new int [9];
		int [] result = new int [7];
		
		for(int i=0; i<9; i++) {
			cand[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i=0; i < 3; i++) {
			int sum = cand[i];
			for(int j=i+1; j < 9; j++) {
				sum += result[j];
				if(sum == 100) {
					result[0] = cand[i];
					break;
				}
					
			}
			if(sum == 100) break;
		}
		
		for(int i=1; i<7; i++) {
		}
		
	}
}
