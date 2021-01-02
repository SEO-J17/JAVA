package 문자열;
import java.io.*;
import java.util.*;
public class 숫자의개수 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int result=1;
		for(int i=0; i<3; i++) {
			result*=Integer.parseInt(br.readLine());
		}
		
		String tmp = String.valueOf(result);
		
		for(int i=0; i<10; i++) {
			int cnt=0;
			for(int j=0; j<tmp.length(); j++) {
				if(Integer.parseInt(tmp.substring(j,j+1)) == i) {
					cnt++;
				}
			}
			System.out.println(cnt);
		}
	}
}
