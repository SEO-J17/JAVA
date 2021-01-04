package 문자열;
import java.io.*;
import java.util.*;

public class 다이얼{
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int sum=0;
		
		for(int i=0; i < str.length(); i++) {
			if('A' <= str.charAt(i) && 'C' >= str.charAt(i)) {
				sum += 2;
			}else if('D' <= str.charAt(i) && 'F' >= str.charAt(i)) {
				sum += 3;
			}else if('G' <= str.charAt(i) && 'I' >= str.charAt(i)) {
				sum += 4;
			}else if('J' <= str.charAt(i) && 'L' >= str.charAt(i)) {
				sum += 5;
			}else if('M' <= str.charAt(i) && 'O' >= str.charAt(i)) {
				sum += 6;
			}else if('P' <= str.charAt(i) && 'S' >= str.charAt(i)) {
				sum += 7;
			}else if('T' <= str.charAt(i) && 'V' >= str.charAt(i)) {
				sum += 8;
			}else if('W' <= str.charAt(i) && 'Z' >= str.charAt(i)) {
				sum += 9;
			}
		}
		
		System.out.println(sum+str.length());
		
	   }
	}

