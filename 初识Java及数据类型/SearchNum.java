public class SearchNum {
	//给定三个int变量，求其中的最大值与最小值
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		int max = a;
		int min = c;
		if (b > a && b > c) {
			max = b;
			if (c > a){
				min = a;
			}
		}
		if (a > b && a > c) {
			if(c > b) {
				min = b;
			}
		}
		if(c > a && c > b) {
			max = c;
			if (a > b) {
				min = b;
			}else {
				min = a;
			}
		}
		System.out.println("max = " + max);
		System.out.println("min = " + min);
	}
}