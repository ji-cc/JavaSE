//package xiecheng;
//
//public class Main {
//    public static void main(String[] args) {
//        String str = "ascgjju";
//        int len = str.length();
//        String newStr = "";
//        for (int i = len-1; i >= 0 ; i--) {
//            newStr += str.charAt(i);
//        }
//        System.out.println(newStr);
//    }
//}
//alter table 表名  modify column 字段名  数据类型（修改后的长度）
//a  id 岗位 工资
//b  id 姓名 岗位
//
//
//select name from b where job = (select job from a order by salary desc limit 3);
