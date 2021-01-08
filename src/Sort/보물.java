package Sort;

import java.io.*;
import java.util.*;

public class º¸¹° {
	public static void main(String[] args) throws IOException, NumberFormatException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		ArrayList <Integer> arr1 = new ArrayList<>();
		ArrayList <Integer> arr2 = new ArrayList<>();
		
		for(int i=0; i < 2; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			while(st.hasMoreTokens()) {
				if(i==0) {
					arr1.add(Integer.parseInt(st.nextToken()));
				}else
					arr2.add(Integer.parseInt(st.nextToken()));
			}
		}
		
		Collections.sort(arr1);
		Collections.sort(arr2);
		Collections.reverse(arr2);
		int sum=0;
		for(int i=0; i<n; i++)
			sum += arr1.get(i)*arr2.get(i);
		
		System.out.println(sum);
	}
}

