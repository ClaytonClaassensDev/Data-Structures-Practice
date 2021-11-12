package com.claassens.clayton;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Stack stack = new Stack();

        stack.push(1, 2);
        stack.push(2, 4);
        stack.push(3, 6);
        stack.push(4, 8);

        System.out.println("The top element is " + stack.peek());

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();

        if (stack.isEmpty()) {
            System.out.print("The stack is empty");
        }
        else {
            System.out.print("The stack is not empty");
        }

    }
}
