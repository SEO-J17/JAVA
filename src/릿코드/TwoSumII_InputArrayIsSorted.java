package ���ڵ�;

public class TwoSumII_InputArrayIsSorted {
	class Solution {
	    public int[] twoSum(int[] numbers, int target) {
	        int answer[] = new int [2];
	        int start = 0;
	        int end = numbers.length - 1;
	        
	        while(start < end){
	            if(numbers[start] + numbers[end] == target){
	                answer[0] = start + 1;
	                answer[1] = end + 1;
					break;
				}
				if (numbers[start] + numbers[end] > target) {
	                end--;
	            }else{
	                start++;
	            }
	        }
	        
	        return answer;
	    }
	}
}

//�ΰ��� ��Ҹ� �������� Ÿ�� ���� ������ �ش� 2���� ����� �ε��� +1 ���� ����ϴ� ��������
//ó�� ���� for������ Ǯ������ �������ͷ� Ǫ�°��� ���� ȿ�� ���̾���.
// �������� �˰����� �Ƹ��� �ΰ��� ���, � ���� ���� ã�Ƴ��µ� �־ �����ϴ�.
