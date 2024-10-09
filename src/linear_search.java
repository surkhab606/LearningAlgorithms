public class linear_search {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8};
        int k = 7;
        int execute = target_hunt(array, k);
    }

    private static int target_hunt(int[] array, int target) {
        for(int i = 0; i < array.length; i++) {
            if(array[i] == target) {
                return array[i];
            }
        }
        return -1;
    }
}
