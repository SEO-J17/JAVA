package GreedyAlgorithm;
import java.io.*;
import java.util.*;
public class ���� {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Integer arr [] = new Integer [n];
		int max = 0;
	
		if(n ==1) {
			System.out.println(Integer.parseInt(br.readLine()));
		}else {
			for(int i=0; i<n; i++) {
				arr[i] = Integer.parseInt(br.readLine());
			}
			
			Arrays.sort(arr, Collections.reverseOrder());
		
			max = 2*arr[1];
	
			for(int i=2; i<n; i++) {
				int temp = (i+1)*arr[i];
				if(max < temp) {
					max = temp;
				}
			}
			
			System.out.println(max);
			
		}
	}
}

//�������� integer�迭�� ����!
//Arrays.sort(arr, Collections.reverseOrder()); �˾ƵѰ�.
