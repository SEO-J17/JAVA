package Sort;
import java.util.*;
import java.io.*;

public class ÄüÁ¤·Ä {
	public static void main(String[] args) throws IOException,NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int arr [] = new int [n];
		
		for(int i=0; i < n; i++ ) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		quicksort(arr, 0, n-1);
		
		for(int d : arr)
			System.out.println(d);
			
	}

	private static void quicksort(int[] arr, int start, int end ) {
		int pl = start;
		int pr = end;
		int mid = arr[ (end+start) / 2 ];
		
		while(pl <= pr) {
			while(arr[pl] < mid) pl++;
			while(arr[pr] > mid) pr--;
			
			if(pl <= pr)			//??
				swap(arr, pl++, pr--);

			if(start < pr) quicksort(arr, start, pr);
			if(end > pl) quicksort(arr, pl, end);
			
		}
		
	}

	private static void swap(int[] arr, int i, int j) {
		int tmp = arr[j];
		arr[j] =  arr[i];
		arr[i] = tmp;
	}
}
