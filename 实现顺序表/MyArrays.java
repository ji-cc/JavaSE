import java.util.Arrays;

public class MyArrays {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(0,10);
        myArrayList.add(1,20);
        myArrayList.add(2,30);  //在 pos 位置新增元素
        myArrayList.add(3,40);
        //打印顺序表
        myArrayList.display();
        //判定是否包含某个元素
        System.out.println(myArrayList.contains(30));
        // 查找某个元素对应的位置
        System.out.println(myArrayList.search(40));
        // 获取 pos 位置的元素
        System.out.println(myArrayList.getPos(2));
        //给 pos 位置的元素设为 value,并打印新数组
        myArrayList.setPos(0, 100);
        //删除第一次出现的关键字key,
        myArrayList.remove(20);
        //获取顺序表长度
        System.out.println(myArrayList.size());
        //清空顺序表,并打印
        myArrayList.clear();

    }
}
