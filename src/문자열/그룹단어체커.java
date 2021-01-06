package 문자열;
import java.io.*;
import java.util.*;

public class 그룹단어체커{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int cnt =n;
		
		for(int i=0; i < n; i++) {
			String str = br.readLine();
			boolean words [] = new boolean [26];	//알파벳 개수 26개.l
			for(int j = 1; j < str.length(); j++) {
				if(str.charAt(j-1) != str.charAt(j)) {
					if(words[str.charAt(j)-97] == true) {
						cnt--;
						break;
					}
					words[str.charAt(j-1)-97] = true;
				}
			}
		}
		System.out.println(cnt);
		
	}

}