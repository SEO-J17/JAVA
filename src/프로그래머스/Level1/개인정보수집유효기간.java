package 프로그래머스.Level1;

import java.util.*;

public class 개인정보수집유효기간 {
    class Solution {
        public ArrayList<Integer> solution(String today, String[] terms, String[] privacies) {
            HashMap<String, Integer> map = new HashMap();
            ArrayList<Integer> answer = new ArrayList();

            String dateArr[] = today.split("\\.");
            int date = toInt(dateArr[0]) * 28 * 12 + toInt(dateArr[1]) * 28 + toInt(dateArr[2]);

            for (String s : terms) {
                String word[] = s.split(" ");
                map.put(word[0], toInt(word[1]) * 28);
            }

            for (int i = 0; i < privacies.length; i++) {
                String str[] = privacies[i].split(" ");
                String day[] = str[0].split("\\.");
                int privacy = toInt(day[0]) * 12 * 28 + toInt(day[1]) * 28 + toInt(day[2]) + map.get(str[1]) - 1;
                if (date > privacy) {
                    answer.add(i + 1);
                }
            }

            return answer;
        }

        private int toInt(String s) {
            return Integer.parseInt(s);
        }
    }
}
