package myqueue;

public class SequeueQueue {
    //基于顺序表实现队列
    //0号元素为对首,队尾tail指向size处位置
    private int[] array = new int[100];
    //[head,tail) 初始情况下队列没有元素
    private int head = 0;
    private int tail = 0;
    private int size = 0;

    //入队列
    //插入失败，返回false;插入成功，返回true
    public boolean offer(int value) {
        if(size == array.length) {
            //数组位置已经满了
            return false;
        }
        array[tail] = value;
        tail++;
        size++;
        return true;
    }

    //出队
    public Integer poll() {
        if(size == 0) {
            //队列为空，出队失败
            return null;
        }
        //队列非空，返回head位置的元素，同时head++,删除该元素
        int ret = array[head];
        head++;
        size--;
        return ret;
    }

    //取对首元素
    public Integer peek() {
        if(size == 0) {
            return null;
        }
        return array[head];
    }
}
