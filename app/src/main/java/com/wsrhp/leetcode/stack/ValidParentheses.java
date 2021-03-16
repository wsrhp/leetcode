package com.wsrhp.leetcode.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        int n = s.length();
        if (n % 2 == 1) return false;
        Map<Character, Character> pairs = new HashMap<>();
        pairs.put('}', '{');pairs.put(']', '[');pairs.put(')', '(');
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < n ; i ++) {
            Character ch = s.charAt(i);
            if (pairs.containsKey(ch)) {
                if (stack.isEmpty() || stack.peek() != pairs.get(ch)) {
                    return false;
                }
                stack.pop();
            } else {
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }
}
