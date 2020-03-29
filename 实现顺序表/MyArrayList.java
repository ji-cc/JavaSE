import java.util.Arrays;

public class MyArrayList {
    private int[] elem;   //顺序表
    private int count;    //记录elem长度
    //设置默认容量
    private static final int DAULT_SIZE = 10;   //申请的顺序表的空间
    //构造函数   初始化
    public MyArrayList() {
        this.elem = new int[DAULT_SIZE];
        this.count = 0;

    }

    // 打印顺序表
    public void display() {
        for (int i = 0; i < this.count; i++) {
            System.out.print(this.elem[i] + " ");
        }
        System.out.println();
    }
    //判断顺序表是否满的
    private void isFull(){
        if (this.count == DAULT_SIZE) {
            throw new RuntimeException("顺序表是满的");
        }
    }
    //判断pos位置是否合法
    private void checkPos(int pos) {
        //如果是满的，则报异常
        if (pos < 0 || pos > this.count) {
            throw new RuntimeException("pos位置不合法");
        }
    }
    //在 pos 位置新增元素
    public void add(int pos, int data) {
        //如果是满的，则报异常
        isFull();
        checkPos(pos);
        for(int i = this.count-1; i > pos-1; i--) {
            this.elem[i+1] = this.elem[i];
        }
        this.elem[pos] = data;
        this.count++;
    }

    //判断顺序表是否为空
    private void isEmpty(){
        if (this.count == 0) {
            throw new RuntimeException("顺序表为空");
        }
    }
    // 判定是否包含某个元素
    public boolean contains(int toFind) {
        isEmpty();
        for (int i = 0; i < this.count; i++) {
            if (this.elem[i] == toFind) {
                return true;
            }
        }
        return false;
    }
    // 查找某个元素对应的位置
    public int search(int toFind) {
        isEmpty();
        for (int i = 0; i < this.count; i++) {
            if (this.elem[i] == toFind) {
                return i;
            }
        }
        return -1;
    }
    // 获取 pos 位置的元素
    public int getPos(int pos) {
        isEmpty();
        checkPos(pos);
        return this.elem[pos];
    }
    // 给 pos 位置的元素设为 value
    public void setPos(int pos, int value) {
        isEmpty();
        checkPos(pos);
        this.elem[pos] = value;
        display();  //打印新数组
    }
    //删除第一次出现的关键字key，并打印
    public void remove(int key) {
        int index = search(key);
        if(index == -1) {
            System.out.println("顺序表中无关键字key");
        }
        for (int i = index; i < this.count-1; i++) {
            this.elem[i] = this.elem[i+1];
        }
        this.count--;
        display();
    }
    // 获取顺序表长度
    public int size() {
        isEmpty();
        return this.count;
    }
    // 清空顺序表
    public void clear() {
        isEmpty();
        this.count = 0;
        display();
    }
}
