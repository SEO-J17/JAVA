package 릿코드;

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

//두개의 요소를 더했을때 타겟 값이 나오면 해당 2개의 요소의 인덱스 +1 값을 출력하는 문제였음
//처음 이중 for문으로 풀었지만 투포인터로 푸는것이 제일 효율 적이었다.
// 투포인터 알고리즘은 아마도 두개의 요소, 어떤 합의 값을 찾아내는데 있어서 유용하다.
