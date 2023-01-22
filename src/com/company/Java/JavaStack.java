package com.company.Java;

import java.util.Scanner;
import java.util.Stack;

public class JavaStack {
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);


        while (sc.hasNext()) {
            boolean output = false;

            String input=sc.next();

            Stack<Character> charStack = new Stack<>();

            for (int i = 0; i < input.length(); i++) {
                char newChar = input.charAt(i);

                if (newChar == '(' || newChar == '{' || newChar == '[') {
                    charStack.add(newChar);
                } else {

                    if (charStack.size() == 0) {
                        System.out.println(false);
                        output = true;
                        break;
                    }

                    char compare = charStack.pop();

                    if (compare != '{' && newChar == '}' || compare != '(' && newChar == ')' || compare != '[' && newChar == ']') {
                        System.out.println(false);
                        output = true;
                        break;
                    }
                }
            }

            if (!output) {
                if (charStack.size() > 0) {
                    System.out.println(false);
                } else {
                    System.out.println(true);
                }
            }


        }


    }
}
