//给定一个数组nums 和一个数target 判断是否在数组中存在两个数的和等于target
//返回下标值


//可以使用hash策略 将已经有的值存在hashmap当中，然后遍历的数 用target减去看看是否存在hashmap当中
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                       
                       answer[0]=i;
                       answer[1]=j;
                       return answer;
                }
            }
        }
        return answer;
    }
}