package 릿코드;

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

//배열 nums에서 오직 두개의 요소를 더 했을때 target의 값이 나오는 인덱스들을 출력하라.
//정렬을 이용하면 인덱스가 바뀌므로 그냥 바로 tartget의 값이 나오면 break 하도록 했다.
