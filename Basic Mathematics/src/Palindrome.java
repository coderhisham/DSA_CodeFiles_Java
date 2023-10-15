import java.util.Scanner;

public class Palindrome {
    static boolean palindrome(long n){
        long rev = 0;
        long temp = n;
        long rem;
        while(temp != 0){
            rem = temp%10;
            rev = rev*10 + rem;
            temp = temp/10;
        }
        return (rev == n);
    }

    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        long n = read.nextLong();
        System.out.println(palindrome(n));
    }

}
