//2751
//n개의 수가 주어졌을때 오름차순으로 정렬하라.
package Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NumbersSort {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
		Integer num = Integer.parseInt(a.readLine());
		int arr [] = new int [num];
		
		for(int i=0; i<num; i++) {
			arr[i] = Integer.parseInt(a.readLine());
		}
		
		for(int i=0; i<num; i++) {
			for(int j=i+1; j<num; j++) {
 				if(arr[i] > arr[j]) {
 					int tmp=0;
 					tmp = arr[j];
 					arr[j] = arr[i];
 					arr[i] = tmp;
				}
			}
		}
		
		for(int d : arr) {
			System.out.println(d);
		}
		
	}
}
