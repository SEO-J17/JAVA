package 문자열;
import java.io.*;
import java.util.*;

public class 상수{
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer a = new StringTokenizer(br.readLine());
		String s1= a.nextToken();
		String s2= a.nextToken();
		int i1 = 0,i2 = 0;
		int tmp=100;
		
		for(int i=2; i >= 0; i--) {
			i1 += (s1.charAt(i)-'0')*tmp;			//상수로 변환
			i2 += (s2.charAt(i)-'0')*tmp;
			tmp /= 10;
		}
		
		System.out.println(i1 > i2 ? i1:i2 );
		
		
  }
}

