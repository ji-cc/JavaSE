public class Demo {
    public static void main(String[] args) {
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();

        /*
        doubleLinkedList.addFirst(1);
        doubleLinkedList.addFirst(2);
        doubleLinkedList.addFirst(3);
        doubleLinkedList.display();
        */
        doubleLinkedList.addLast(2);
        doubleLinkedList.addLast(1) ;
        doubleLinkedList.addLast(2);
        doubleLinkedList.addLast(2);
        doubleLinkedList.addLast(3);
        doubleLinkedList.addLast(2);
        doubleLinkedList.display();
        System.out.println(doubleLinkedList.size());
        doubleLinkedList.addIndex(1,9);
        doubleLinkedList.display();
        System.out.println(doubleLinkedList.contains(1));
        /*doubleLinkedList.remove(1);
        doubleLinkedList.display();
        doubleLinkedList.remove(1);
        doubleLinkedList.display();*/

        doubleLinkedList.removeAllKey(2) ;
        doubleLinkedList.display();
        doubleLinkedList.clear();
        doubleLinkedList.display();
    }
}
