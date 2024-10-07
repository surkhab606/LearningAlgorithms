public class binary_search {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8};
        int target = 8;
        int blast = binary_target(array,target);
        System.out.println("The target is at index: " + blast);
    }

    private static int binary_target(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] == target) {
                return mid;
            }
            else if (array[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
