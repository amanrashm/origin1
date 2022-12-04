import java.util.Scanner;
class Palindrome_Number{
    public static void main(String[] args) {
        System.out.println("Give a number for reversal");
        Scanner x = new Scanner(System.in);
        int A = x.nextInt();
        int sum =0;
        int b =A;
        while(b!=0){
            int d= b%10;
            sum = sum*10+d;
            b =b/10;
        }if(A==sum)
            System.out.println("this number is palindrome ");
        else
            System.out.println("this number is not a palidrome ");
    }
}