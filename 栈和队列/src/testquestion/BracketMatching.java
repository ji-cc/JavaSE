package testquestion;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

//括号匹配问题
//注意空字符串可被认为是有效字符串
//创建一个栈，遍历字串，遇到左括号则入栈
// 遇到右括号，看栈顶元素是否与该左括号匹配，若匹配，栈顶元素出栈
//最后，栈为空，则字符串合法
public class BracketMatching {
    public static boolean isValisd(String s) {
        //空字符串是合法字符串
        if(s.isEmpty()) {
            return true;
        }
        //创建一个HashMap:给定key,能够找到value
        Map<Character,Character> map = new HashMap<>();
        //put(K key, V value);
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');

        //1.创建一个栈
        Stack<Character> stack = new Stack<>();
        //遍历字符串，看是左括号还是有括号
        for(int i = 0; i<s.length(); i++) {
            char c = s.charAt(i); //取到字符串
            //如果是左括号，直接入栈
            //map.get(c):c存在，返回对应的value,不存在则返回null
            if(map.get(c) != null) {    //get(Object key);
                stack.push(c);
                continue;
            }
            //如果是右括号，取栈顶元素，看是否与当前括号匹配
            if(stack.empty()) {  //如果此时栈为空，肯定是不合法字符串
                return false;
            }
            Character top = stack.pop();  //为一个左括号
            //map.get(top)得到对应的右括号
            if(map.get(top).equals(c)) {
                continue;
            }
            //若前面的合法情况都没有，则只剩下非法情况
            return false;
        }
        //循环完毕，栈为空，则为合法字符串
        if(stack.empty()) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        String s = "()";
        System.out.println(isValisd(s));
    }
}
