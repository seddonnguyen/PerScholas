package LeetCode;

import java.util.LinkedList;
import java.util.Map;

// https://leetcode.com/problems/valid-parentheses
public class Valid_Parentheses {
    public static boolean isValid(String s) {
        if (s == null || s.isBlank()) {
            return true;
        }

        var stack = new LinkedList<Character>();
        var map = Map.of(')', '(', ']', '[', '}', '{');

        for (var current : s.toCharArray()) {
            if (!map.containsKey(current)) {
                stack.push(current);
                continue;
            }

            if (stack.isEmpty() || stack.pop() != map.get(current)) {
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("[]"));
    }
}
