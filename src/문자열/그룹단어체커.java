package 문자열;
import java.io.*;
import java.util.*;

public class 그룹단어체커{
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int [] arr = new int [26];
		int cnt=0;
		
		for(int i=0; i<n; i++) {
			String word = br.readLine();
			for(int j=0; j<word.length(); j++) {
				if(j == 0) {
					if(word.length() == 1) {
						cnt++;
					}else
						arr[word.charAt(j)-'a']++;
				}else if(word.charAt(j-1) != word.charAt(j) && arr[word.charAt(j)-'a'] != 0) {
					break;
				}else if(j == word.length()-1 && arr[word.charAt(j)-'a'] == 0) {
					cnt++;
				}else
					arr[word.charAt(j)-'a']++;
					
			}
		}
			System.out.println(cnt);
	   }
	}

