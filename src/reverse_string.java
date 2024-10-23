public class reverse_string {

    public static void main(String[] args) {
        String userString = "surkhab";
        String reversed = reverse_mode(userString);
        System.out.println("The string reversed is: " + reversed);
    }

    private static String reverse_mode(String userString) {
        String result = "";
        for (int i = userString.length() - 1; i >= 0; i--) {
            result = result + userString.charAt(i);
        }
        return result.toLowerCase();
    }
}
