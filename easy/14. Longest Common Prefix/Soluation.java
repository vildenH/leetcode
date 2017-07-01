import java.util.Arrays;

public class Solution {

	public String longestCommonPrefix(String[] strs) {
		StringBuilder result = new StringBuilder();

		if (strs != null && strs.length > 0) {

			Arrays.sort(strs); // sort完毕后已经按字典序排列 所以可以用最短的和最长的直接找公共部分

			char[] a = strs[0].toCharArray();
			char[] b = strs[strs.length - 1].toCharArray();

			for (int i = 0; i < a.length; i++) {
				if (b.length > i && b[i] == a[i]) {
					result.append(b[i]);
				} else {
					return result.toString();
				}
			}
			return result.toString();
		}
		result = result.append("");
		return result.toString();
	}
}