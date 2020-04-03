public class Demo {
    public static void main(String[] args) {
        /*MyLinedList myLinedList1  = new MyLinedList();
        myLinedList1.addLast(1);
        myLinedList1.addLast(3);
        myLinedList1.addLast(7);
        myLinedList1.addLast(9);
        myLinedList1.display();
        myLinedList1.reverseList();
        myLinedList1.display();
        System.out.println(myLinedList1.middleNode().data);
        System.out.println(myLinedList1.FindKthToTail(6).data);*/

        /*//测试mergeTwoLists()
        MyLinedList myLinedList1  = new MyLinedList();
        myLinedList1.addLast(1);
        myLinedList1.addLast(3);
        myLinedList1.addLast(7);
        myLinedList1.addLast(9);
        myLinedList1.display();
        MyLinedList myLinedList2  = new MyLinedList();
        myLinedList2.addLast(3);
        myLinedList2.addLast(4);
        myLinedList2.addLast(6);
        myLinedList2.display();
        LinedList linedList = new LinedList();
        Node ret = linedList.mergeTwoLists(myLinedList1.head,myLinedList2.head);
        myLinedList2.display2(ret);*/

        /*//测试partition()
        MyLinedList myLinedList2  = new MyLinedList();
        myLinedList2.addLast(4);
        myLinedList2.addLast(2);
        myLinedList2.addLast(6);
        myLinedList2.addLast(5);
        myLinedList2.addLast(1);
        myLinedList2.display();
        Node ret1 = myLinedList2.partition(4);
        myLinedList2.display2(ret1);*/


        //测试deleteDuplication()
/*
        MyLinedList myLinedList2  = new MyLinedList();
        myLinedList2.addLast(2);
        myLinedList2.addLast(2);
        myLinedList2.addLast(2);
        myLinedList2.addLast(3);
        myLinedList2.addLast(3);
        myLinedList2.display();
        Node ret = myLinedList2.deleteDuplication();
        myLinedList2.display2(ret);
*/


        //测试chkPalindrome()
        MyLinedList myLinedList2  = new MyLinedList();
        myLinedList2.addLast(1);
        myLinedList2.addLast(3);
        //myLinedList2.addLast(5);
        myLinedList2.addLast(3);
        myLinedList2.addLast(1);
        myLinedList2.display();
        System.out.println(myLinedList2.chkPalindrome());
    }
}
