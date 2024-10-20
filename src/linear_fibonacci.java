public class linear_fibonacci {

    public static void main(String[] args) {
        int target = 10;
        int result = linear(target);
        System.out.println("The 10th number in the sequence is " + result);
    }

    public static int linear(int number) {
        if (number == 0) {
            return 0;
        }

        if (number == 1) {
            return 1;
        }

        int a = 0;
        int b = 1;

        for(int i = 2; i < number; i++) {
            int next = a + b;
            a = b;
            b = next;

            return next;
        }

    }
}
