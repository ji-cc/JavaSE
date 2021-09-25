//public class Main {
//    public static void main(String[] args) {
//        System.out.println(replaceSpace("We Are Happy"));
//    }
//    public static String replaceSpace (String s) {
//        // write code here
//        if(s == null) {
//            return null;
//        }
//        StringBuffer str = new StringBuffer();
//        for (int i = 0; i < s.length(); i++) {
//            if (' '== (s.charAt(i))) {
//                str.append("%20");
//            } else {
//                str.append(s.charAt(i));
//            }
//        }
//        return str.toString();
//    }
//}



//import java.util.ArrayList;
//import java.util.Stack;
//
//class ListNode {
//    int val;
//    ListNode next = null;
//
//    ListNode(int val) {
//        this.val = val;
//    }
//}
//public class Main {
//
//    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
//        ArrayList<Integer> list = new ArrayList<>();
//        Stack<ListNode> stack = new Stack<>();
//        while (listNode != null) {
//            stack.push(listNode);
//            listNode = listNode.next;
//        }
//        while (stack != null) {
//            list.add(stack.pop().val);
//        }
//        return list;
//    }
//}

//
//public class Main {
//    static int max = 0;
//    public static void main(String[] args) {
//        fact(5);
//        System.out.println(max);
//    }
//    static int fact(int n) {
//        if (n <= 0) {
//            return 1;
//        }else {
//            max += 1;
//            return n * fact(n-1);
//        }
//    }
//}


//public class Main{
//    public static void main(String[] args) {
//        System.out.println(Power(2.0000,-3));
//    }
//    public static double Power(double base, int exponent) {
//        if (exponent == 0) {
//            return 1.00000;
//        }
//        if (equal(base,0)) {
//            return 0;
//        }
//        if (exponent > 0) {
//            return mul(base,exponent);
//        }else {
//            return mul(1/base,-exponent);
//        }
//
//    }
//    public static boolean equal(double a,double b) {
//        if (a-b>0.00001 && a-b<-0.00001) {
//            return true;
//        }
//        return false;
//    }
//    public static double mul(double base,double exponent) {
//        double sum = 1;
//        while (exponent>0) {
//            sum *= base;
//            exponent--;
//        }
//        return sum;
//    }
//}


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 public class TreeNode {
 int val = 0;
 TreeNode left = null;
 TreeNode right = null;

 public TreeNode(int val) {
 this.val = val;

 }

 }
 */
//public class Solution {
//    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
//        boolean res = false;
//        if(root1 != null && root2 != null) {
//            if (root1.val == root2.val) {
//                res = isEqualTree(root1,root2);
//            } else {
//                res = HasSubtree(root1.left,root2) || HasSubtree(root1.right,root2);
//            }
//        }
//        return res;
//
//    }
//    public boolean isEqualTree(TreeNode root1,TreeNode root2) {
//        if (root2 == null) {
//            return true;
//        }
//        if (root1 == null) {
//            return false;
//        }
//        if (root1.val != root2.val) {
//            return false;
//        }
//        return isEqualTree(root1.left,root2.left) && isEqualTree(root1.right,root2.right);
//    }
//}


//public class Main {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        ArrayList<Integer> list = new ArrayList<>();
//        int n = scan.nextInt();
//        for(int i=1;i<=n;i++){
//            if(isPrime(i)){
//                list.add(i);
//            }
//        }
//        System.out.println(list.toString());
//    }
//    public static boolean isPrime(int a) {
//        boolean flag = true;
//        if (a < 2) {
//            return false;
//        } else {
//            for (int i = 2; i <= Math.sqrt(a); i++) {
//                if (a % i == 0) {
//                    flag = false;
//                    break;
//                }
//            }
//        }
//        return flag;
//    }
//}




//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String str = scanner.nextLine();
//        StringBuffer stringBuffer = new StringBuffer(str);
//        StringBuffer stringNew = stringBuffer.reverse();
//        System.out.println(stringNew);
//    }
//
//}



//public class Main {
//    public static void main(String[] args) {
//        int[] arr1 = new int[]{1,2,3,4};
//        int[] arr2 = new int[]{6,8};
//        System.out.println(isCoin(arr1,arr2));;
//    }
//
//    private static boolean isCoin(int[] arr1, int[] arr2) {
//        Map<Integer,Integer> map = new HashMap<>();
//        for (int i: arr1
//             ) {
//            map.put(i,1);
//        }
//        for (int i: arr2
//             ) {
//           if (map.get(i) == null) {
//               map.put(i,1);
//           }else {
//               map.put(i,map.get(i)+1);
//           }
//        }
//        for (Integer i:map.keySet()
//             ) {
//            if (map.get(i) >1) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//
//}
//
//
//



public class Main {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1,2,3,4};
        int n = 3;
        ArrayList<ArrayList<Integer>> list = divi(arr1,n);
        System.out.println(list.toString());
    }


    private static ArrayList<ArrayList<Integer>> divi(int[] arr1, int n) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int i = 0;
        int count = arr1.length%n;
        while (i <arr1.length-count) {
            ArrayList<Integer> subSet = new ArrayList<>();

            while (i <arr1.length-count && (n > 0)) {
                subSet.add(arr1[i++]);
                n--;
            }
            list.add(subSet);
            i+=n;
        }
        ArrayList<Integer> subSet = new ArrayList<>();
        for (int j = i; j < arr1.length; j++) {
            subSet.add(arr1[j]);
        }
        list.add(subSet);
        return list;
    }

}






















