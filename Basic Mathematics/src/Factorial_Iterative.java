import java.util.Scanner;

public class Factorial_Iterative {
    static int factorial(int n){
        int res = 1;
        for(int i=2 ; i<=n ; i++){
            res = res * i;
        }
        return res;
    }

    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        System.out.println(factorial(n));
    }
}
