package sortingAlgoritms;

public class QuickSortArray {
    static int partition(int[] arr, int l, int r) {
        int i = l-1;
        int j, temp;
        int pivot = arr[r];
        for (j = l; j < r; j++) {
            if (arr[j] < pivot) {
                i++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        temp = arr[i+1];
        arr[i+1] = pivot;
        arr[r] = temp;
        return i+1;
    }

    static void sort(int[] arr, int l, int r) {
        if (l <= r) {
            int m = partition(arr, l, r);
            sort(arr, l, m-1);
            sort(arr, m+1, r);
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,5,6,7,8,9,3,4,1};
        sort(arr, 0, arr.length-1);
        for (int temp: arr) System.out.print(temp);
    }
}
