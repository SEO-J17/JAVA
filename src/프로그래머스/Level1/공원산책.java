package 프로그래머스.Level1;

import java.util.*;

public class 공원산책 {
    class Solution {
        int[] answer = new int[2];

        public int[] solution(String[] park, String[] routes) {
            char arr[][] = new char[park.length][park[0].length()];

            for (int i = 0; i < park.length; i++) {
                for (int j = 0; j < park[i].length(); j++) {
                    char c = park[i].charAt(j);
                    arr[i][j] = c;
                    if (c == 'S') {
                        answer[0] = i;
                        answer[1] = j;
                    }
                }
            }

            for (int i = 0; i < routes.length; i++) {
                String str[] = routes[i].split(" ");
                String direc = str[0];
                int move = Integer.parseInt(str[1]);
                calc(direc, move, arr);
            }

            return answer;
        }

        private void calc(String direc, int move, char[][] map) {
            int x = answer[0];
            int y = answer[1];
            for (int i = 0; i < move; i++) {
                switch (direc) {
                    case "E" -> {
                        if (!validate(x, ++y, map)) {
                            return;
                        }
                        break;
                    }
                    case "W" -> {
                        if (!validate(x, --y, map)) {
                            return;
                        }
                        break;
                    }
                    case "S" -> {
                        if (!validate(++x, y, map)) {
                            return;
                        }
                        break;
                    }
                    case "N" -> {
                        if (!validate(--x, y, map)) {
                            return;
                        }
                        break;
                    }
                }
            }
            answer[0] = x;
            answer[1] = y;
        }

        private boolean validate(int x, int y, char[][] map) {
            if (x >= 0 && y >= 0 && y < map[0].length && x < map.length) {
                if (map[x][y] != 'X') {
                    return true;
                }
            }
            return false;
        }
    }
}
