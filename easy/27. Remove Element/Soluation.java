public class Solution {
    public int removeElement(int[] nums, int val) {
        int ans=0;
        int slow=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==val)
            {
                ans=ans+1;
                
            }
            else
            {
                nums[slow]=nums[i];
                slow++;
            }
        }
        return ans;
    }
}