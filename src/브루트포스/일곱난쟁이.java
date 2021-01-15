//2309
package 브루트포스;
import java.io.*;
import java.util.*;


public class 일곱난쟁이 {
	public static void main(String[] args) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int candi[] = new int [9];
		int sum=0;
		boolean chk = false;
		
			for (int i = 0; i < 9; i++) {
				candi[i] = Integer.parseInt(br.readLine());
				sum+=candi[i];
			}
			
			for(int i=0; i < 9; i++) {
				for(int j = 0; j < 9; j++) {
					if(i == j)
						continue;
					else if(sum - candi[i] - candi[j] == 100){
						candi[i]=0;
						candi[j]=0;
						chk = true;  
					}
				}
				if(chk == true) break;
			}
				
			Arrays.sort(candi);
			
			for(int d: candi)
				if(d !=0)
					sb.append(d+"\n");
			
			System.out.print(sb);
			
	}
}



