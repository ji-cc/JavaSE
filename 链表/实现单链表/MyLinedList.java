//定义一个节点
class Node{
    public int data;
    public Node next;
    //构造方法
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class MyLinedList {
   //定义头结点，存放地址
    public Node head;

    public MyLinedList() {

    }
    //输出链表
    public void display() {
        Node cur = this.head;
        while(cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    //头插法
    public void addFirst(int data) {
        //创建一个节点
        Node node = new Node(data);
        //第一次插入节点
        if(this.head == null) {
            this.head = node;
            return;
        }
        //头插
        node.next = this.head;
        this.head = node;
    }

    //尾插法
    public void addLast(int data) {
        Node node = new Node(data);
        //第一次插入节点
        if(this.head == null) {
            this.head = node;
            return;
        }
        //尾插
        Node cur = this.head;
        //使cur指向尾结点
        while(cur.next != null) {
            cur = cur.next;
        }
        cur.next = node;
    }

    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index,int data) {
        if(index < 0 || index > size()) {
            throw new RuntimeException("index位置不合法");
        }
        if(index == 0) {
            addFirst(data);
            return;
        }
        if(index == size()) {
            addLast(data);
            return;
        }
        //定义一个cur指向标号为index-1的节点
        Node cur = this.head;
        for (int i = 1; i < index; i++) {
            cur = cur.next;
        }
        //创建要插入的data新节点
        Node node = new Node(data);
        node.next = cur.next;
        cur.next = node;
    }
    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key) {
        if(this.head == null){
            throw new RuntimeException("空链表");
        }
        Node cur = this.head;
        while(cur != null) {
            if(cur.data == key) {
                return true;
            }
            cur = cur.next;
        }
        return  false;
    }
    //删除第一次出现关键字为key的节点
    public void remove(int key) {
        if(this.head == null) {
            throw new RuntimeException("链表为空");
        }
        //假设要删除的是头结点
        if(this.head.data == key) {
            this.head = this.head.next;
            return;
        }
        //定义prev指向头结点，del指向第二个结点
        Node prev = this.head;
        Node del = this.head.next;   //del代表要删除的结点
        while(del != null) {
            if(del.data == key) {
                prev.next = del.next;
                return;
            }
            del = del.next;
            prev = prev.next;
        }
        if(del == null) {
            System.out.println("不存在关键字key");
        }
    }
    //删除所有值为key的节点
     public void removeAllKey(int key) {
        Node prev = this.head;
        Node del = this.head.next;
        while(del != null) {
            if(del.data == key) {
                prev.next = del.next;
                del = prev.next;
            }else {
                del = del.next;
                prev= prev.next;
            }

        }
        if(this.head.data == key) {
            this.head = this.head.next;
        }
    }

    //得到单链表的长度
    public int size() {
        int count=0;
        Node cur = this.head;
        while(cur != null) {
            cur = cur.next;
            count++;
        }
        return count;
    }
    //清空链表
    public void clear() {
        this.head = null;
    }



}
