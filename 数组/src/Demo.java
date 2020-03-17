/*import java.util.Arrays;
public class Demo {
    public static void revese(int[] arr) {
       int lift = 0;
       int right = arr.length-1;
       while (lift < right) {
           int tmp = arr[lift];
           arr[lift] = arr[right];
           arr[right] = tmp;
           lift++;
           right--;
       }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        revese(arr);
        System.out.println(Arrays.toString(arr));

    }

}*/







/*
import java.util.Arrays;
    //二分法
public class Demo {
    public static int binarySearch(int[] arr, int key) {
        int lift = 0;
        int right = arr.length - 1;
        while (lift <= right) {
            int mid = (right + lift) / 2;
            if (key > arr[mid]) {
                lift = mid;
            }
            if (key < arr[mid]) {
                right = mid;
            }
            if (key == arr[mid]) {
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int key = 3;
        int find = binarySearch(arr,key);
        System.out.println(Arrays.toString(arr));
        System.out.println(find);
    }

}
*/







/*import java.util.Arrays;
import java.util.Scanner;
public class Demo {
    //创建一个 int 类型的数组, 元素个数为 100, 并把每个元素依次设置为 1 - 100
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        arr = scanfArray(n) ;
        System.out.println(Arrays.toString(arr));
    }
    public static int[] scanfArray(int n) {
        int[] ret = new int[n];
        for (int i = 0; i < n; i++) {
            ret[i] = i+1;
        }
        return ret;
    }
}*/






/*
import java.util.Arrays;
import java.util.Scanner;
public class Demo {
    //实现一个方法 printArray, 以数组为参数, 循环访问数组中的每个元素, 打印每个元素的值.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        arr = scanfArray(n) ;
        printArray(arr);
    }
    public static int[] scanfArray(int n) {
        int[] ret = new int[n];
        for (int i = 0; i < n; i++) {
            Scanner scan = new Scanner(System.in);
            ret[i] = scan.nextInt();
        }
        return ret;
    }
    public static void  printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if(i < arr.length-1) {
                System.out.print(",");
            }
        }
        System.out.print("]");
    }
}




 */










/*
import java.util.Arrays;
import java.util.Scanner;
public class Demo {
    //实现一个方法 transform, 以数组为参数, 循环将数组中的每个元素 乘以 2
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        arr = printArray(n) ;
        int[] arr2 = new int[n];
        arr2 = transArray(arr);
        System.out.println(Arrays.toString(arr2));
    }
    public static int[] printArray(int n) {
        int[] ret = new int[n];
        for (int i = 0; i < n; i++) {
            Scanner scan = new Scanner(System.in);
            ret[i] = scan.nextInt();
        }
        return ret;
    }
    public static int[]  transArray(int[] arr) {
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++ ) {
            arr2[i] = arr[i]*2;
        }
        return arr2;
    }
}

 */













/*
import java.util.Scanner;
public class Demo {
    //实现一个方法 sum, 以数组为参数, 求数组所有元素之和.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        arr = printArray(n) ;
        int sum = sumArray(arr);
        System.out.println(sum);
    }
    public static int[] printArray(int n) {
        int[] ret = new int[n];
        for (int i = 0; i < n; i++) {
            Scanner scan = new Scanner(System.in);
            ret[i] = scan.nextInt();
        }
        return ret;
    }
    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum +=arr[i];
        }
        return sum;
    }
}


 */






/*
import java.util.Scanner;
public class Demo {
    //实现一个方法 avg, 以数组为参数, 求数组中所有元素的平均值
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        arr = printArray(n) ;
        int aver = avg(arr);
        System.out.println(aver);
    }
    public static int[] printArray(int n) {
        int[] ret = new int[n];
        for (int i = 0; i < n; i++) {
            Scanner scan = new Scanner(System.in);
            ret[i] = scan.nextInt();
        }
        return ret;
    }
    public static int avg(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum +=arr[i];
        }
        int aver = sum/arr.length;
        return aver;
    }
}
 */




/*import java.util.Arrays;
public class Demo {
    //实现一个方法 toString, 把一个整型数组转换成字符串. 例如数组 {1, 2, 3} ,
    // 返回的字符串为 "[1, 2, 3]", 注意 逗号 的位置和数量.
    public static void toString(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++){
            if (i == arr.length -1) {
                System.out.print(arr[i]);
            }else {
                System.out.print(arr[i] + ",");
            }
        }
        System.out.print("]");
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        toString(arr);
    }
}*/









/*
import java.util.Arrays;
public class Demo {
    //实现一个方法 copyOf, 对一个整型数组进行拷贝, 得到一个新的数组.
    public static int[] copyOf(int[] arr) {
       int[] ret = new int[arr.length];
       for (int i = 0; i < arr.length; i++) {
           ret[i] = arr[i];
       }
       return ret;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] ret = new int[arr.length];
        ret = copyOf(arr);
        System.out.println(Arrays.toString(ret));
    }
}
*/




/*
public class Demo {
    //给定一个有序整型数组, 实现二分查找
    public static int BinarySearch(int[] arr,int key) {
       int left = 0;
       int right = arr.length-1;
       while (left <= right) {
           int mid = (left + right)/2;
           if(key > arr[mid]) {
               left = mid;
           }
           if (key < arr[mid]) {
               right = mid;
           }
           if (key == arr[mid]) {
               return mid;
           }
       }
       return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int key = 3;
        int k = BinarySearch(arr,key);
        System.out.println(k);
    }
}

 */










/*
public class Demo {
    //给定一个整型数组, 判定数组是否有序（递增）
    public static void ifSort(int[] arr) {
       for (int i = 1; i < arr.length; i++) {
           if (arr[i-1] > arr[i]) {
               System.out.println("无序");
               break;
           }else {
               System.out.println("有序");
               break;
           }
       }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        ifSort(arr);
    }
}

 */






/*

import java.util.Arrays;
public class Demo {
    //给定一个整型数组, 实现冒泡排序(升序排序)
    public static void maopaoSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {4,2,6,8,3,1};
        maopaoSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
 */