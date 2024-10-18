public class linear_fibonacci {
    public static void main(String[] args) {
        int target = 20;
        int hawkTuah = result(target);
        System.out.println("The 20th number in the sequence is: " + hawkTuah);
    }

    private static int result(int number) {
        if (number == 0) {
            return 0;
        }

        else if (number == 1) {
            return 1;
        }

        int a = 0;
        int b = 1;

        for(int i = 2; i <= number; i++) {
            int next = a + b;
            a = b;
            b = next;
        }

        return b;
    }
}
