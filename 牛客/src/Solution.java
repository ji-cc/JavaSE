import java.util.Scanner;

//这题应该是用快排的思想：例如找49个元素里面第24大的元素，那么按如下步骤：
//1.进行一次快排（将大的元素放在前半段，小的元素放在后半段）,假设得到的中轴为p
//2.判断 p - low + 1 == k ，如果成立，直接输出a[p]，（因为前半段有k - 1个大于a[p]的元素，故a[p]为第K大
//的元素）
//3.如果 p - low + 1 > k， 则第k大的元素在前半段，此时更新high = p - 1，继续进行步骤1
//4.如果p - low + 1 <  k， 则第k大的元素在后半段， 此时更新low = p + 1, 且 k = k - (p - low + 1)，继续步骤1.
//由于常规快排要得到整体有序的数组，而此方法每次可以去掉“一半”的元素，故实际的复杂度不是o(nlogn), 而
//是o(n)。
public class Solution {
    public static int findKth(int[] a, int n, int K) {
        return findKth(a,0,n-1,K);
    }
    private static int findKth(int[] arr, int left, int right, int k) {
        int index = partition(arr,left,right);  //此时index对应的值为第index+1大的值
        if(k < index+1){
            return findKth(arr,left,index-1,k); // 在左子数组中继续找
        }else if (k > index+1) {
            return findKth(arr,index+1,right,k);  // 在右子数组继续找
        }else {
            return arr[index];
        }
    }
    private static int partition(int[] arr, int left, int right) {
        /*
        从左往右找比基准值小的数，从右往左找比基准值大的数，交换
         */
        // 选取最右边的值为基准值
        // 从大到小快排
        int baseValue = arr[right];
        while (left<right) {
            while (left<right && arr[left]>baseValue) {
                left++;
            }
            while (left<right && arr[right]<baseValue) {
                right--;
            }
            if (left < right) {
                int tmp = arr[left];
                arr[left] = arr[right];
                arr[right] = tmp;
            }
        }
        int tmp = arr[left];
        arr[left] = baseValue;
        baseValue = tmp;
        return left;
    }

    public static void main(String[] args) {
        int[] arr = {9,5,2,7,3,6,4};
        int n = 7;
        int k =3;
        int pos = findKth(arr,n,k);
        System.out.println(pos);
        }
}

