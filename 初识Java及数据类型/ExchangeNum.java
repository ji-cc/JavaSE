public class ExchangeNum {
	//给定两个int值，交换两个变量的值
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		int c = a;
		a = b;
		b = c;
		System.out.println("After exchanging numbers");
		System.out.println("a = " + a);
		System.out.println("b = " + b);	
	}
}