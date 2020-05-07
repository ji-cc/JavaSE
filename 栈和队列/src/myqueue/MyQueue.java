package myqueue;

import mystack.LinkedStack;

public class MyQueue {
    public static void main(String[] args) {
        LinkedQueue linkedQueue = new LinkedQueue();
        linkedQueue.offer(1);
        linkedQueue.offer(2);
        linkedQueue.offer(3);
        System.out.println(linkedQueue.peek());
        System.out.println(linkedQueue.poll());


        SequeueQueue sequeueQueue = new SequeueQueue();
        sequeueQueue.offer(1);
        sequeueQueue.offer(2);
        sequeueQueue.offer(3);
        System.out.println(sequeueQueue.peek());
        System.out.println(sequeueQueue.poll());
    }
}
