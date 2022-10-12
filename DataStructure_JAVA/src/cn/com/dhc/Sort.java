package cn.com.dhc;

/**
 * @Auther: Evin_D
 * @Date: 2022/10/12 - 下午8:43
 * @Description: cn.com.dhc
 * @version: 1.0
 */
public class Sort {
    public static void selectSort(int[] arr) {
        final int N = arr.length;
        if (arr == null || N < 2)
            return;
        for(int i = 0; i < N; i++) {
            int minValueIndex = i;
            for (int j = i + 1; j < N; j++) {
                minValueIndex = arr[j] < arr[minValueIndex] ? j : minValueIndex;
            }
            swap(arr, i, minValueIndex);
        }
    }
    public static void bubbleSort(int[] arr) {
        int N = arr.length;
        if(arr == null || N < 2)
            return;
        for(int end = N -1; end >=0; end--) {
            for (int second = 1; second <= end; second++) {
                if (arr[second - 1] > arr[second])
                    swap(arr, second - 1, second);
            }
        }
    }
    public static void insertSort1(int arr[]) {
        int N = arr.length;
        if(arr == null || N < 2)
            return;
        for(int end = 1; end < N; end++) {
            int newNumberIndex = end;
            while (newNumberIndex - 1 >= 0 && arr[newNumberIndex - 1] > arr[newNumberIndex]) {
                swap(arr, newNumberIndex -1, newNumberIndex);
                newNumberIndex--;
            }
        }
    }
    public static void insertSort2(int[] arr) {
        int N = arr.length;
        if (arr == null || N < 2)
            return;
        for (int end = 1; end < N; end++) {
            for (int pre = end - 1; pre >=0 && arr[pre] > arr[pre + 1]; pre--) {
                swap(arr, pre, pre + 1);
            }
        }
    }
    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
    public static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {7, 1, 3, 4, 1, 6, 8, 1, 3, 5, 7, 5, 6};
        printArray(arr);
//        selectSort(arr);
//        bubbleSort(arr);
        insertSort1(arr);
        insertSort2(arr);
        printArray(arr);

    }
}
