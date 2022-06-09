package ���ڵ�;

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

// �׸��� ���� ��������.
// ó�� ���� for������ �ϳ��� ����ؼ� �ϴϱ� �ð��ʰ��� ����.
// ���� ������ ó������ �ϳ��� ������Ű�鼭 �ϴ� ������� �ִ� ������ ������.
// �������� �˰����� ����.
