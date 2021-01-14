//2309
package 브루트포스;
import java.io.*;
import java.util.*;


public class 일곱난쟁이 {
	public static void main(String[] args) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int candi[] = new int [9];
		int result[] = new int [7];
			for (int i = 0; i < 9; i++) {
				candi[i] = Integer.parseInt(br.readLine());
			}
			
			while(true) {
				int sum = 0;
				for(int i =0; i < 7; i++){
					sum += candi[i];
				}
				if(sum == 100) {
					for(int i =0; i < 7; i++){
						result[i] = candi[i];
					}
					Arrays.sort(result);
					for(int d: result)
						sb.append(d+"\n");
						
						System.out.println(sb);
						break;
				}else {
					for(int i=1; i < 9; i++) {
						int tmp = candi[i-1];
						candi[i-1] = candi[i];
						candi[i] = tmp;
					}
				}
			}
	}
}



