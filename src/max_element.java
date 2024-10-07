public class max_element {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,100};
        int max = max_array(array);
        System.out.println("The maximum element is: " + max);
    }

    private static int max_array(int[] array) {
        int max_value = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max_value) {
                max_value = array[i];
            }
        }
        return max_value;

    }
}
