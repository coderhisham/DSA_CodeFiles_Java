import java.util.Scanner;
public class Factorial_Recursive {

    static int fact(int n){
        if (n==0){
            return 1;
        }
        return n*fact(n-1);
    }

    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        System.out.println(fact(n));
    }
}
