import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[] a = new int[] {14,3,6,5,7};
        if (a.length > 0) {
            quickSort(a,0,a.length-1);
        }
        System.out.println(Arrays.toString(a));
    }

    private static void quickSort(int[] a, int low, int high) {
        if (low < high) {
            int mid = getMiddle(a,low,high);
            quickSort(a,low,mid-1);
            quickSort(a,mid+1,high);
        }
    }

    private static int getMiddle(int[] a, int low, int high) {
        int tmp = a[low];
        while (low < high) {
            while (low < high && a[high] > tmp) {
                high--;
            }
            while (low<high && a[low] < tmp) {
                low++;
            }
            if (low < high) {
                int t = a[low];
                a[low] = a[high];
                a[high] = t;
            }
        }
        a[low] = tmp;
        return low;
    }
}
