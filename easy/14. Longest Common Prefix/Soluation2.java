


//这种方法需要的比较次数较多。
//首先将第一个字符串作为前缀串，与后续字符串依次比较，如果该前缀串不存在与后序子串中，那么前缀减一。直到前缀变为空。
public class Solution {

	public String longestCommonPrefix(String[] strs) {
		if (strs.length == 0)
			return "";
		String prefix = strs[0];
		for (int i = 1; i < strs.length; i++)
			while (strs[i].indexOf(prefix) != 0) {
				prefix = prefix.substring(0, prefix.length() - 1);
				if (prefix.isEmpty())
					return "";
			}
		return prefix;
	}
}