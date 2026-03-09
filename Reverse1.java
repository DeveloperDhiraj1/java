
public class Reverse1 {

    public static void main(String[] args) {
        int[] arr = {987, 323, 434, 232, 12, 11, 23};
        int n = arr.length;
        int i = 0;
        int j = n - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for (int element : arr) {
            System.out.print(element + " ");
        }

    }
}
