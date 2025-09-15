
public class Array2 {

    public static void main(String[] args) {
        int arr[] = {16, 2, 24, 14, 5};
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.err.println("sorted array is:" + arr[n - 2]);
    }
}
