package 문자열;
import java.io.*;
import java.util.*;

public class 문자열반복{
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int arr1 [] = new int [n];
		String arr2 [] = new String [n];
		
		for(int i=0; i<n; i++) {
			StringTokenizer a = new StringTokenizer(br.readLine());
			arr1[i] = Integer.valueOf(a.nextToken());
			arr2[i] = a.nextToken();
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<arr2[i].length(); j++) {
				for(int k=0; k<arr1[i]; k++) {
					System.out.print(arr2[i].charAt(j));
				}
			}
			System.out.println();
		}
		
	}
}
