import java.util.HashMap;
import java.util.Stack;

public class validParentheses {
    // LeetCode Easy
    // Time Complexity: O(n)
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> hm = new HashMap<>();
        // Keys are closing while values are opening
        hm.put(')', '(');
        hm.put('}', '{');
        hm.put(']', '[');

        for (char c: s.toCharArray())
        {
            if (hm.containsKey(c))
            {
                if (!stack.isEmpty() && stack.peek() == hm.get(c))
                {
                    stack.pop();
                }
                else{
                    return false;
                }
            }
            else{
                stack.push(c);
            }
        }
        return stack.isEmpty();
        }
}