public class Q26_1 {
    public static void main(String[] args) {
        String input = "sat23h6y7a8";
        int sum = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isDigit(ch)) {
                sum = sum + Integer.parseInt(String.valueOf(ch));
            }
        }
        System.out.println(sum);
    }
}