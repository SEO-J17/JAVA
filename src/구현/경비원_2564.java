package 구현;

import java.io.*;
import java.util.*;

public class 경비원_2564 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int tc = Integer.parseInt(br.readLine());
		int sum = 0;
		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i <= tc; i++) {
			st = new StringTokenizer(br.readLine());
			int direc = Integer.parseInt(st.nextToken());
			int pos = Integer.parseInt(st.nextToken());
			if (direc == 1) {
				list.add(pos);
			} else if (direc == 2) {
				list.add(n + m + n - pos);
			} else if (direc == 3) {
				list.add(2 * n + m + m - pos);
			} else {
				list.add(n + pos);
			}
		}

		int x = list.get(list.size() - 1);
		int rec_length = 2 * (n + m);

		for (int i = 0; i < tc; i++) {
			int dis = Math.abs(list.get(i) - x);
			sum += Math.min(dis, rec_length - dis);
		}

		System.out.println(sum);
		
	}
}
