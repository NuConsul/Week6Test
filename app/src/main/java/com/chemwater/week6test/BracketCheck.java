package com.chemwater.week6test;

import java.util.Stack;

public class BracketCheck {

    public static final String NEW_VARIABLE = "[]{}() : " ;

    public static void main(String[] args) {

        String expression = checkBalance(NEW_VARIABLE);
        System.out.println(NEW_VARIABLE + expression);

    }



    public static String checkBalance(String expr)
    {
        if (expr.isEmpty())
            return "True";

        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < expr.length(); i++)
        {
            char current = expr.charAt(i);
            if (current == '{' || current == '(' || current == '[')
            {
                stack.push(current);
            }
            if (current == '}' || current == ')' || current == ']')
            {
                if (stack.isEmpty())
                    return "False";
                char last = stack.peek();
                if (current == '}' && last == '{' || current == ')' && last == '(' || current == ']' && last == '[')
                    stack.pop();
                else
                    return "False";
            }
        }
        return stack.isEmpty()?"True":"False";
    }

}