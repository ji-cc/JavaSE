package mystack;

public class LinkedStack {
    //基于链表实现栈
    static class Node {
        public int value;
        public Node next;

        public Node(int value) {
            this.value = value;
        }
    }
    //头代表栈顶
    //写一个带傀儡结点的头结点
    Node head = new Node(-1);

    //入栈
    public void push(int value) {
        //头插
        Node newNode = new Node(value);
        newNode.next = head.next;
        head.next = newNode;
    }
    //出栈
    public Integer pop() {
        //头删
        Node delNode = head.next;
        if(delNode == null) {
            //链表为空，删除失败
            return null;
        }
        head.next = delNode.next;
        return delNode.value;
    }

    //取栈顶元素
    public Integer peek() {
        return head.next.value;
    }

}
