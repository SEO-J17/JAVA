//2751
//n���� ���� �־������� ������������ �����϶�.
package Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class NumbersSort {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
		Integer num = Integer.parseInt(a.readLine());
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int temp =0;
		
		for(int i =0 ; i<num; i++) {
			arr.add(Integer.parseInt(a.readLine()));
			}
		Collections.sort(arr);
		
		for(int d : arr) {
			System.out.println(d);
		}
	}
}
