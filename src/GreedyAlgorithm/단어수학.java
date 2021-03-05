package GreedyAlgorithm;
import java.io.*;
import java.util.*;
public class 단어수학 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String [] arr = new String [n];
		int [] alph = new int [26];
		
		for(int i=0; i<n; i++) {
			arr[i] = br.readLine();
		}
		
		for(int i=0; i<n; i++) {
			int temp = (int) Math.pow(10, arr[i].length()-1);
			for(int j=0; j<arr[i].length(); j++) {
				alph[arr[i].charAt(j)-'A']+=temp;
				temp /= 10;
			}
		}
		
		Arrays.sort(alph);
		int idx=9;
		int sum=0;
		for(int i = alph.length-1; i>=0; i--) {
			sum += alph[i]*idx;
			idx--;
		}
		
		System.out.println(sum);
		
		
	}
}
