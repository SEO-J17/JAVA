package 구현;

import java.io.*;
import java.util.*;

public class 좌표압축 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int arr[] = new int[n];
        int arr2[] = new int[n];
		HashMap<Integer, Integer> map = new HashMap();
		int rank = 0;

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			int temp = Integer.parseInt(st.nextToken());
			arr[i] = temp;
            arr2[i] = temp;
		}

		
		Arrays.sort(arr);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
            if(!map.containsKey(arr[i])){
                map.put(arr[i], rank);
                rank++;
            }
		}
		
		for(int d : arr2){
            sb.append(map.get(d)).append(" ");
        }

		System.out.println(sb);

	}
}
