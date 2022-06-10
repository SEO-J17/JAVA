package ���ڵ�;

import java.util.*;

public class MedianofTwoSortedArrays_4 {
	class Solution {
		public double findMedianSortedArrays(int[] nums1, int[] nums2) {
			List<Integer> list = new LinkedList();
			for (int i = 0; i < nums1.length; i++) {
				list.add(nums1[i]);
			}
			for (int i = 0; i < nums2.length; i++) {
				list.add(nums2[i]);
			}
			Collections.sort(list);

			if (list.size() == 0) {
				return (double) 0;
			} else if (list.size() == 1) {
				return (double) list.get(0);
			} else if (list.size() % 2 == 0) {
				int temp = list.get(list.size() / 2) + list.get(list.size() / 2 - 1);
				return (double) temp / (double) 2;
			} else {
				int temp = list.get(list.size() / 2);
				return (double) temp;
			}
		}
	}
}
//�־��� �ΰ��� �迭���� ��ҵ��� �ϳ��� �迭�� ���ļ� �߰����� ã�Ƴ��� �Ǵ� ��������.
//�ϳ��� �迭�� List�� �̿��Ͽ��� �ΰ��� �迭�� ������ ����Ʈ���־ collecntion���� ������ �ߴ�.
//collection ������ �־�,�ּ� ��� nlogn�� �ð����⵵�� �������־ ȿ�����̴�.
//���� ���ϰ��� double�� ����ؾ��ߴ�.