package 릿코드;

public class ContainerWithMostWater_11 {
	class Solution {
		public int maxArea(int[] height) {
			int answer = 0;
			int start = 0;
			int end = height.length - 1;

			while (start < end) {
				answer = Math.max((end - start) * Math.min(height[end], height[start]), answer);
				if (height[start] < height[end]) {
					start++;
				} else {
					end--;
				}
			}

			return answer;
		}
	}
}

// 그리디 관련 문제였음.
// 처음 이중 for문으로 하나씩 계산해서 하니깐 시간초과가 났음.
// 각각 끝점과 처음부터 하나씩 증가시키면서 하는 방법으로 최대 영역을 구했음.
// 투포인터 알고리즘이 사용됨.
