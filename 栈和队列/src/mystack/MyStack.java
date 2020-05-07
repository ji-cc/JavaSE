package mystack;

import java.util.ArrayList;

public class MyStack {
    public static void main(String[] args) {
        SequenceStack sequenceStack = new SequenceStack();
        sequenceStack.push(1);
        sequenceStack.push(2);
        sequenceStack.push(3);
        System.out.println(sequenceStack.pop());
        System.out.println(sequenceStack.peek());
    }
}
