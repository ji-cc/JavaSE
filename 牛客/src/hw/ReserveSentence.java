package hw;

import java.util.Scanner;
import java.util.Stack;

/*
将一个英文语句以单词为单位逆序排放。例如“I am a boy”，逆序排放后为“boy a am I”
所有单词之间用一个空格隔开，语句中除了英文字母外，不再包含其他字符
 */
public class ReserveSentence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Stack<String> stack = new Stack<>();
        String[] sen = str.split(" ");
        for (String word: sen
             ) {
            stack.push(word);
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
