import java.util.HashMap;
//移除有序数组中的重复元素
//使用hashmap 时间N 空间 N
public class Solution {
	public int removeDuplicates(int[] nums) {
		int ans = 0;
		
		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		int temp=0;
		for (int i = 0; i < nums.length; i++) {
			int j = nums[i];

			if (!(hashMap.containsKey(j))) {
				nums[temp]=j;
				temp++;
				hashMap.put(j, 0);
				ans++;
			}
		}

		return ans;
	}
    	public int removeDuplicates2(int[] nums) {
		int ans = 0;
		
		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		int temp=0;
		for (int i = 0; i < nums.length; i++) {
			int j = nums[i];

			if (!(hashMap.containsKey(j))) {
				nums[temp]=j;
				temp++;
				hashMap.put(j, 0);
				ans++;
			}
		}

		return ans;
	}
}