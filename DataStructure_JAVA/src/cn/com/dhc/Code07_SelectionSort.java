package cn.com.dhc;

/**
 * @Auther: Evin_D
 * @Date: 2022/10/11 - 下午9:46
 * @Description: cn.com.dhc
 * @version: 1.0
 */
public class Code07_SelectionSort {
    public static void selectSort(int[] arr) {

    }
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {7, 1, 3, 4, 1, 6, 8, 1, 3, 5, 7, 5, 6};
        printArray(arr);
        selectSort(arr);
        printArray(arr);
    }
}
