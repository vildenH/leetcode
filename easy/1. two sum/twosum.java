//给定一个数组nums 和一个数target 判断是否在数组中存在两个数的和等于target
//返回下标值

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(target-nums[i]))
            {
                answer[0]=map.get(target-nums[i]);
                answer[1]=i;
            }
            map.put(nums[i],i);
        }
        return answer;
    }
}