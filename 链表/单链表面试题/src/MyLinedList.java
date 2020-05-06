class Node {
    public int data;
    public Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class MyLinedList {
    public Node head;

    public MyLinedList() {

    }
    //头插
    public void addFirst(int data) {
        Node node = new Node(data);
        if(this.head == null) {
            this.head = node;
            return;
        }
        node.next = this.head;
        this.head = node;
    }
    public void display(){
        Node cur = this.head;
        while(cur != null){
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }
    public void display2(Node newHead){
        Node cur = newHead;
        while (cur != null) {
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
        System.out.println();
    }
    public void addLast(int data){
        Node node = new Node(data);
        if(this.head == null) {
            this.head = node;
            return;
        }
        Node cur = this.head;
        while(cur.next != null) {
            cur = cur.next;
        }
        cur.next = node;
    }
    //反转一个链表
    public Node reverseList(){
        if(this.head == null) {
            throw new RuntimeException("链表为空");
        }
        Node cur = this.head;
        Node prev = null;
        while(cur != null) {
            Node curNext = cur.next;
            if(curNext == null) {
                this.head = cur;
            }
            cur.next = prev;
            prev = cur;
            cur = curNext;
        }
        return this.head;
    }
    //返回链表的中间结点
    //定义fast与slow指向头结点，使fast的移动速度是slow的二倍
    //则fast指向尾结点时，slow指向中间结点
    public Node middleNode() {
        Node fast = this.head;
        Node slow = this.head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    //输入一个链表，输出该链表中倒数第k个结点
    //设置fast与slow指向头结点，先让fast走k-1步，
    // 再让fast与slow同时一步一步走，直到fast指向尾结点
    //此时的slow指向倒数k个结点
    public Node FindKthToTail(int k) {
        Node fast = this.head;
        Node slow = this.head;
        if(k > 0 && fast != null) {      //排除链表为空以及k不合理的情况
            //先让fast走k-1步
            for (int i = 0; i < k-1; i++) {
                if(fast.next == null) {   //排除k>情况链表长度的
                    System.out.println("没有该节点");
                    return null;
                }else {
                    fast = fast.next;
                }
            }
            //使fast与slow同时走
            while(fast.next != null) {
                fast = fast.next;
                slow = slow.next;
            }
        }else {   //当链表为空或者k不合理时返回null
            return null;
        }
        return slow;
    }


    //编写代码，以给定值x为基准将链表分割成两部分，
    // 所有小于x的结点排在大于或等于x的结点之前
    //分割以后保持原来的数据顺序不变
    public Node partition(int x) {
        Node cur = this.head;
        Node a1 = null;   //指向前一段的头
        Node a2 = null;   //指向前一段的尾
        Node b1 = null;   //指向后一段的头
        Node b2 = null;   //指向后一段的尾
        while(cur != null) {
            if(cur.data < x) {    //小于x的数放入前一段
                if(a1 == null) {   //第一次插入结点
                    a1 = cur;
                    a2 = cur;
                }else {
                    a2.next = cur;
                    a2 = a2.next;
                }
            }else {
                if(b1 == null) {   //第一次插入结点
                    b1 = cur;
                    b2 = cur;
                }else {
                    b2.next = cur;
                    b2 = b2.next;
                }
            }
            cur = cur.next;
        }
        if(a1 == null) {   //如果前一段没有数据则返回后一段
            return b1;
        }
        a2.next = b1;
        if(b1 != null) {
            b2.next = null;
        }
        return a1;
    }

    //在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，
    // 重复的结点不保留，返回链表头指针
    public Node deleteDuplication() {
        Node node = new Node(-1);
        Node newHead = node;
        Node cur = this.head;
        while(cur != null) {
            if(cur.next != null && cur.data == cur.next.data) {   //排除cur.next发生空指针异常的情况
                while(cur.next != null && cur.data == cur.next.data) {
                    cur = cur.next;  //此时cur指向重复结点的最后一个
                }
                cur = cur.next;
            }else {
                node.next = cur;
                cur = cur.next;
                node = node.next;
            }
        }
        node.next = null;
        return newHead.next;
    }

    //对于一个链表，请设计一个时间复杂度为O(n),
    // 额外空间复杂度为O(1)的算法，判断其是否为回文结构。
    public boolean chkPalindrome() {
        Node fast = this.head;
        Node slow = this.head;
        //使slow指向中间结点，fast指向尾结点
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        //局部反转（把链表的后半段进行反转）
        Node cur = slow.next;
        while(cur != null) {
            Node curNext = cur.next;
            cur.next = slow;
            slow = cur;
            cur = curNext;
        }
        //回文结构的判断
        Node prev = this.head;
        while(prev != slow) {
            if(prev.data != slow.data) {
                return false;
            }
            //偶数情况下slow与prev无法相遇
            if(prev.next == slow) {
                return true;
            }
            prev = prev.next;
            slow = slow.next;
        }
        return true;
    }
}

class LinedList {
    //将两个升序链表合并为一个新的升序链表并返回。
    // 新链表是通过拼接给定的两个链表的所有节点组成的。
    public Node mergeTwoLists(Node head1, Node head2) {
        //定义一个虚拟头结点
        Node newhead = new Node(-1);
        Node cur1 = head1;
        Node cur2 = head2;
        Node cur = newhead;
        while(cur1 != null && cur2 != null) {
            if(cur1.data < cur2.data) {
                cur.next = cur1;

                cur1 = cur1.next;
            }else {
                cur.next = cur2;

                cur2 = cur2.next;
            }
            cur = cur.next;
        }
        if(cur2 == null) {
            cur.next = cur1;
        }else {
            cur.next = cur2;
        }
        return newhead.next;
    }
}

//给定两个（单向）链表，判定它们是否相交并返回交点
class IntersectList{
    public Node getIntersectionNode(Node headA, Node headB) {
        if(headA == null || headB == null) { //其中一个是空链表，则返回null
            return null;
        }
        int lenA = 0;
        int lenB = 0;
        Node pL = headA;
        Node pS = headB;
        while(pL != null) {
            lenA++;    //A的链表长度
            pL = pL.next;
        }
        while(pS != null) {
            lenB++;    //B的链表长度
            pS = pS.next;
        }
        int len = lenA - lenB;  //len > 0：说明A是长链表，B是短链表
        pL = headA;
        pS = headB;
        if(len < 0) {
            pL = headB;   //pL指向长列表
            pS = headA;   //pS指向短链表
            len = lenB - lenA;    //len代表两个链表之间的差值
        }
        // 先让长链表走len步，再让两个链表同时走，直到pL == pS
        // 此时pL与pS指在相交的结点上
        while(len > 0){
            pL = pL.next;
            len--;
        }
        while(pL != pS ) {
            pL = pL.next;
            pS = pS.next;
        }
        if(pL != null && pL != null && pL == pS) {
            return pL;
        }
        return null;
    }
}

//给定一个链表，判断链表中是否有环
class Cycle {
    public boolean hasCycle(Node head) {
        // 设置fast 和 slow 指向头结点
        // 令fast一次走两步，slow一次走一步
        // 若在fast与slow都不等于null的前提下可以相遇，则表示有环
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null) {  //排除链表为空的可能
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) {
                break;
            }
        }
        if(fast == null || fast.next == null) {
            return false;
        }
        return true;
    }
}



