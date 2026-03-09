
class ArrayChecker {

    boolean isSorted(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}

public class Sort {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        ArrayChecker obj = new ArrayChecker();

        if (obj.isSorted(arr)) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }
    }
}
