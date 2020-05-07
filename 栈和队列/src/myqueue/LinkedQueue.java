package myqueue;
//队列：先进先出
//基于链表实现队列
public class LinkedQueue {
    static class Node {
        public int value;
        public Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    //建立一个带有傀儡结点的链表
    //链表头部作为对首，链表尾部座位队尾
    private Node head = new Node(-1);
    private Node tail = head;   //指向链表尾部

    //入队列  尾插
    public void offer(int value) {
        Node newNode = new Node(value);
        tail.next = newNode;
        tail = tail.next;  //让tail始终指向链表尾部
    }

    //出队列 头删
    public Integer poll() {
        if(head.next == null) {
            //链表为空，出队列失败
            return null;
        }
        Node delNode = head.next;
        head.next = delNode.next;
        if(head.next == null) {
            //此时队列已经为空
            //使tail指回傀儡结点
            tail = head;
        }
        return delNode.value;
    }

    //取队首元素
    public Integer peek() {
        if(head.next == null) {
            //链表为空，取队首元素失败
            return null;
        }
        return head.next.value;
    }
}
