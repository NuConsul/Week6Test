package com.chemwater.week6test;

import java.util.Stack;

public class BracketCheck {

    public static final String NEW_VARIABLE = "({})[] : " ;

    public static void main(String[] args) {

        String expression = checkBalance(NEW_VARIABLE);
        System.out.println(NEW_VARIABLE + expression);

    }



    public static String checkBalance(String expr)
    {
        if (expr.isEmpty())
            return "True";

        Stack<Character> stackOne = new Stack<Character>();
        for (int j = 0; j < expr.length(); j++)
        {
            char current = expr.charAt(j);
            if (current == '{' || current == '(' || current == '[')
            {
                stackOne.push(current);
            }
            if (current == '}' || current == ')' || current == ']')
            {
                if (stackOne.isEmpty())
                    return "False";
                char last = stackOne.peek();
                if (current == '}' && last == '{' || current == ')' && last == '(' || current == ']' && last == '[')
                    stackOne.pop();
                else
                    return "False";
            }
        }
        return stackOne.isEmpty()?"True":"False";
    }

}