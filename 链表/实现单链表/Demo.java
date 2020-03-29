public class Demo {
    public static void main(String[] args) {
        MyLinedList myLinedList = new MyLinedList();
        /*System.out.println("头插法");
        myLinedList.addFirst(1) ;
        myLinedList.addFirst(5);
        myLinedList.addFirst(3);
        myLinedList.addFirst(7);
        myLinedList.addFirst(9);
        myLinedList.display();*/
        System.out.println("尾插法");
        myLinedList.addLast(2) ;
        myLinedList.addLast(3);
        myLinedList.addLast(2);
        myLinedList.addLast(7);
        myLinedList.addLast(2);
        myLinedList.display();
        System.out.println(myLinedList.size());
        //myLinedList.addIndex(0,10);
        //myLinedList.display();
        /*myLinedList.addIndex(2,20);
        myLinedList.display();
        myLinedList.addIndex(8,30);
        myLinedList.display();*/
        //System.out.println(myLinedList.contains(10));
        myLinedList.removeAllKey(2);
        myLinedList.display();
    }

}
