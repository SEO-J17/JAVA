//6064
package 코딩테스트준비기초;

import java.util.*;
import java.io.*;

public class BF_카잉달력 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int tc = Integer.parseInt(br.readLine());

		for (int i = 0; i < tc; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			boolean excep = false;
			int m = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
			int x = Integer.parseInt(st.nextToken()) - 1;
			int y = Integer.parseInt(st.nextToken()) - 1;

			for (int j = x; j < (n * m); j += m) {
				if (j % n == y) {
					sb.append(j + 1).append("\n");
					excep = true;
					break;
				}
			}
			if (!excep)
				sb.append(-1).append("\n");
		}

		System.out.println(sb);

	}
}
