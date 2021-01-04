package 문자열;
import java.io.*;
import java.util.*;

public class 단어공부{
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int [] arr = new int [26];
		
		for(int i = 0; i < str.length(); i++) {
				if('A' <= str.charAt(i) && str.charAt(i) <= 'Z') {
					arr[(int)str.charAt(i)-65]++;
				}else
					arr[(int)str.charAt(i)-97]++;
			}
		int max = -1;
		char result = '?';
		for(int i = 0; i < 26; i++) {
			if(arr[i] > max) {
				max = arr[i];
				result = (char)(i+65);
			}else if(arr[i] == max) {
				result = '?';
			}
		}
			System.out.println(result);
		
	   }
	}

