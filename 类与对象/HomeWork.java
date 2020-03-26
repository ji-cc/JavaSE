//编写一个类Calculator,有两个属性num1,num2,这两个数据的值，
// 不能在定义的同时初始化，最后实现加减乘
//除四种运算
public class HomeWork {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        Calculator calculator = new Calculator(a,b);
        System.out.println(calculator.add());
        System.out.println(calculator.sub());
        System.out.println(calculator.mul());
        System.out.println(calculator.dev());
    }
}
class Calculator {
    private int num1;
    private int num2;
    //构造方法  alt + fn +insert  ----->  constructor
    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public int add() {
        return this.num1 + this.num2;
    }
    public int sub() {
        return this.num1 - this.num2;
    }
    public int mul() {
        return this.num1 * this.num2;
    }
    public double dev() {
        return (double)this.num1 / this.num2;
    }

    //alt + fn + insert ----->getter and setter
    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
}