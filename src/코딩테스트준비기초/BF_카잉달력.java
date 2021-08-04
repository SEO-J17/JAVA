//6064
package 코딩테스트준비기초;

import java.util.*;
import java.io.*;

public class BF_카잉달력 {
	static int m[];
	static int n[];
	static int x[];
	static int y[];
	static int tc;
	static int result;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		tc = Integer.parseInt(br.readLine());
		m = new int[tc];
		n = new int[tc];
		x = new int[tc];
		y = new int[tc];

		for (int i = 0; i < tc; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			m[i] = Integer.parseInt(st.nextToken());
			n[i] = Integer.parseInt(st.nextToken());
			x[i] = Integer.parseInt(st.nextToken());
			y[i] = Integer.parseInt(st.nextToken());
		}

		int break_point = 0;
		result = 0;


		System.out.println(sb);
	}

}
