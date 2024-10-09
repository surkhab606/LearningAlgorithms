import java.util.Scanner;
public class linear_search {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int k = scanner.nextInt();
        int execute = target_hunt(array, k);
        System.out.println("The target is: " + execute);
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
