public class max_element {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 100, 1000};
        int max = maximum_element(array);
        System.out.println("The max element in the array is: " + max);
    }

    private static int maximum_element(int[] array) {
        int max = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
