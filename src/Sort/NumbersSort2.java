//2750
//
package Sort;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
	
public class NumbersSort2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
			BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
			Integer num = Integer.parseInt(a.readLine());
			int arr [] = new int [num];
			for(int i = 0; i<num; i++) {
				arr[i] = Integer.parseInt(a.readLine());
			}
			selectionsort(arr);
			for(int d : arr) {
				System.out.println(d);
			}
		}

	public static void selectionsort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int j = lowestIndex(arr, i);
			swapelements(arr, i, j);
		}
	}

	public static void swapelements(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;		 
	}

	public static int lowestIndex(int[] arr, int start) {
		int lowest = start;
		for(int i=start; i<arr.length; i++){
			if(arr[i]<arr[lowest]) {
				lowest=i;
			}
		}
		return lowest;
	}
}
