
class Second {

    public static void main(String[] args) {
        int arr[] = {2, 3, 54, 12, 90};
        int max = arr[0];
        int secondmax = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > secondmax && arr[j] < max) {
                secondmax = arr[j];
            }
        }

        System.err.println("second largest number is:" + secondmax);
    }
}
