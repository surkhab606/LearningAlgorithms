public class linear_fibonacci {

    public static void main(String[] args) {
        int k = 10;
        int fibo = linear_fibo(k);
        System.out.println("The number is: " + fibo);
    }

    private static int linear_fibo(int number) {
        if (number == 0) {
            return 0;
        }

        else if(number == 1) {
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
