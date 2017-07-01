import java.util.Stack;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Solution {
	public boolean isValid(String s) {

		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			char temp = s.charAt(i);
			if (temp == '(' || temp == '[' || temp == '{') {
				stack.push(temp);
			} else {

				if (stack.isEmpty())
					return false;

				if (temp == ')') {
					char temp2 = stack.pop();
					if (temp2 != '(') {
						return false;
					}
				} else if (temp == '}') {
					char temp2 = stack.pop();
					if (temp2 != '{') {
						return false;
					}
				} else if (temp == ']') {
					char temp2 = stack.pop();
					if (temp2 != '[') {
						return false;
					}
				}
			}
		}
		if (stack.isEmpty())
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		String string="{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}";
		System.out.println(new Solution().isValid(string));
	}
}