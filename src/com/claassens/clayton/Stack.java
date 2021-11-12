package com.claassens.clayton;

public class Stack {

    class View
    {
        int width;
        int height;
        View next;

        @Override
        public String toString() {
            return "View{" +
                    "width=" + width +
                    ", height=" + height +
                    ", next=" + next +
                    '}';
        }
    }

    private View top;

    public Stack() {
        this.top = null;
    }

    public void push(int x, int y)
    {

        View view = new View();

        if (view == null)
        {
            System.out.print("Full");
            return;
        }

        System.out.println("Inserting: " + x + " " + y);

        view.width = x;
        view.height = y;

        view.next = top;

        top = view;
    }


    public boolean isEmpty() {
        return top == null;
    }


    public String peek()
    {
        // check for an empty stack
        if (!isEmpty()) {
            return top.toString();
        }
        else {
            return "Stack is empty";
        }
    }


    public void pop()
    {
        // check for stack underflow
        if (top == null)
        {
            System.out.print("Empty");
            return;
        }

        System.out.println("Removing " + peek());

        top = (top).next;
    }



}
