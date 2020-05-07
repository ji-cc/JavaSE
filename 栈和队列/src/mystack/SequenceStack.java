package mystack;

//栈：先进后出
public class SequenceStack {
    //基于顺序表实现的栈
    private int[] array = new int[100];
    // array中[0,size)区间中的元素是栈中的有效元素
    private int size = 0;

    //入栈
    //0号元素相当于栈底，size-1位置相当于栈顶
    public void push(int value) {
        //把value放到数组末尾，此处不考虑扩容问题
        array[size] = value;
        size++;
    }

    //出栈
    public Integer pop() {
        if(size <= 0) {
            //可以抛出异常，可以返回非法值
            return null;
        }
        int ret = array[size-1];
        size--;
        return ret;
    }

    //取栈顶元素
    public Integer peek() {
        if(size <= 0) {
            //可以抛出异常，可以返回非法值
            return null;
        }
        int ret = array[size-1];
        return ret;
    }
}
