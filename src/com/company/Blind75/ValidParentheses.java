package com.company.Blind75;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> bracketStack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char symb = s.charAt(i);

            if (symb == '(' || symb == '{' || symb == '[') {
                bracketStack.push(symb);
            } else if (symb == ')' || symb == '}' || symb == ']') {
                char bracket = ' ';

                if (bracketStack.size() != 0) {
                    bracket = bracketStack.pop();
                } else {
                    return false;
                }

                if ( symb == ')' && bracket != '(' ||
                        symb == ']' && bracket != '[' ||
                        symb == '}' && bracket != '{'

                ) {
                    return false;
                }
            }
        }

        if (bracketStack.size() != 0) {
            return false;
        }

        return true;
    }
    
}
