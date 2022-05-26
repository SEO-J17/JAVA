package 구현;

import java.awt.Point;
import java.io.*;
import java.util.*;

public class 맥주마시면서걸어가기_9205 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();

		for (int k = 0; k < tc; k++) {
			int stores_num = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			Point home = new Point(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
			int distance = 1000;

			ArrayList<Point> list = new ArrayList<Point>();
			for (int i = 0; i < stores_num; i++) {
				st = new StringTokenizer(br.readLine());
				list.add(new Point(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
			}

			st = new StringTokenizer(br.readLine());
			Point festival = new Point(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));

			
			if ((Math.abs(home.x - festival.x) + Math.abs(home.y - festival.y)) <= 1000) {
				sb.append("happy").append("\n");
				continue;
			}
			
			
			boolean flag = false;
			for (int i = 0; i < stores_num; i++) {
				Point temp = list.get(i); // 편의점 좌표
				if ((Math.abs(home.x - temp.x) + Math.abs(home.y - temp.y)) <= 1000) {
					home.x = temp.x;
					home.y = temp.y;
				} 
				
				if ((Math.abs(home.x - festival.x) + Math.abs(home.y - festival.y)) <= 1000) {
					sb.append("happy").append("\n");
					flag = true;
					break;
				}

			}

			if (flag) {
				continue;
			}
			
			sb.append("sad").append("\n");
			
		}

		System.out.println(sb);

	}
}
