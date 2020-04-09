class Node {
    public int data;
    public Node next;  // 后继
    public Node pre;   // 前驱
    public Node(int data) {
        this.data = data;
    }
}
public class DoubleLinkedList {
    public Node head;  //指向头结点
    public Node last; //指向尾结点

    //头插法
    public void addFirst(int data) {
        Node node = new Node(data);
        if(this.head == null) {
            this.head = node;
            this.last = node;
        }else {
            node.next = this.head;
            this.head.pre = node;
            this.head = node;
        }
    }

    //尾插法
    public void addLast(int data) {
        Node node = new Node(data);
        if(this.head == null) {
            this.head = node;
            this.last = node;
        }else {
            this.last.next = node;
            node.pre = this.last;
            this.last = node;
        }
    }

    //判断index位置是否合法
    private void isIndex(int index){
        if(index < 0 || index > size()) {
            throw new RuntimeException("Index 位置不合法");
        }
    }
    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index,int data) {
        isIndex(index);
        Node node = new Node(data);
        if(index == 0) {
            addFirst(data);
        }
        if(index == size()){
            addLast(data);
        }
        //定义cur指向index位置
        Node cur = this.head;
        while(index != 0) {
            cur = cur.next;
            index--;
        }
        node.next = cur;
        node.pre = cur.pre;
        cur.pre.next = node;
        cur.pre = node;
    }

    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key) {
        Node cur = this.head;
        while(cur != null) {
            if(cur.data == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    //删除第一次出现关键字为key的节点
    public void remove(int key) {
        Node cur = this.head;
        while(cur != null) {
            if(cur.data == key) {   //cur指向要删除的结点
                if(cur == this.head) {   //删除头结点
                    this.head = this.head.next;
                    this.head.pre = null;
                }else {
                    if(cur == this.last) {   //删除尾结点
                        this.last = this.last.pre;
                        this.last.next = null;
                    }else {  // 删除中间结点
                        cur.pre.next = cur.next;
                        cur.next.pre = cur.pre;
                    }
                }
                return;  //跳出整个函数
            }
            cur = cur.next;
        }
    }

    //删除所有值为key的节点
    public void removeAllKey(int key) {
        Node cur = this.head;
        while(cur != null) {
            if(cur.data == key) {   //cur指向要删除的结点
                if(cur == this.head) {   //删除头结点
                    this.head = this.head.next;
                    this.head.pre = null;
                }else {
                    if(cur == this.last) {   //删除尾结点
                        this.last = this.last.pre;
                        this.last.next = null;
                    }else {  // 删除中间结点
                        cur.pre.next = cur.next;
                        cur.next.pre = cur.pre;
                    }
                }
            }
            cur = cur.next;
        }
    }

    //得到单链表的长度
    public int size() {
        int count = 0;
        Node cur = this.head;
        while(cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }

    public void display() {
        Node cur = this.head;
        while(cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    public void clear(){
        this.head = null;
        this.last = null;
    }
}
