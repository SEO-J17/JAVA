package ���ڵ�;

public class TwoSum_1 {
	class Solution {
	    public int[] twoSum(int[] nums, int target) {
	        int [] answer = new int [2];
	        for(int i = 0; i < nums.length - 1; i++){
	            boolean flag = false;
	            for(int j = i + 1 ; j < nums.length; j++){
	                if(nums[i] + nums[j] == target){
	                    answer[0] = i;
	                    answer[1] = j;
	                    flag = true;
	                    break;
	                }
	            }
	            if(flag){
	                break;
	            }
	        }
	        return answer;
	    }
	}
}

//�迭 nums���� ���� �ΰ��� ��Ҹ� �� ������ target�� ���� ������ �ε������� ����϶�.
//������ �̿��ϸ� �ε����� �ٲ�Ƿ� �׳� �ٷ� tartget�� ���� ������ break �ϵ��� �ߴ�.
