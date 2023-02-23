package Homework_java_3;

public class hw_sl {

    public static void main(String[] args) {
        int[] arrayIn = { 7, 2, 1, 6, 3, 4, 8, 5, 7 };
        mergeSort(arrayIn, arrayIn.length);
        printArr(arrayIn);
    }

    private static void mergeSort(int[] arr, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] leftArr = new int[mid];
        int[] rightArr = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            leftArr[i] = arr[i];
        }
        for (int i = mid; i < n; i++) {
            rightArr[i - mid] = arr[i];
        }
        mergeSort(leftArr, mid);
        mergeSort(rightArr, n - mid);

        merge(arr, leftArr, rightArr, mid, n - mid);
    }

    private static void merge(int[] arr, int[] leftArr, int[] rightArr, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];
            }
        }
        while (i < left) {
            arr[k++] = leftArr[i++];
        }
        while (j < right) {
            arr[k++] = rightArr[j++];
        }
    }

    private static void printArr(int[] arr) {
        System.out.println();
        for (int i : arr) {
            System.out.print(i + ", ");
        }
    }

}
