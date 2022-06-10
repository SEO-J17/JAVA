package 릿코드;

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
//주어진 두개의 배열들의 요소들을 하나의 배열로 합쳐서 중간값을 찾아내면 되는 문제였음.
//하나의 배열을 List로 이용하였고 두개의 배열의 값들을 리스트에넣어서 collecntion으로 정렬을 했다.
//collection 정렬은 최악,최선 모두 nlogn의 시간복잡도를 가지고있어서 효율적이다.
//그후 리턴값은 double로 출력해야했다.