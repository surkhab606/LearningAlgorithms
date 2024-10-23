public class linear_search {
    public static void main(String[] args) {
        int target = 6;
        int[] arr = {1, 2, 3, 4, 5, 6};
        int result = linear(arr, target);
        System.out.println(result);
    }

    public static int linear(int[] array, int number) {
        for (int x = 0; x < array.length; x++) {
            if (number == array[x]) {
                return number;
            }

        }
        return -1;
    }
}