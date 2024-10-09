public class sum_array {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int sum = total_sum(array);
        System.out.println("The sum of the array is: " + sum);
    }

    private static int total_sum(int[] array) {
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        return total;
    }
}
