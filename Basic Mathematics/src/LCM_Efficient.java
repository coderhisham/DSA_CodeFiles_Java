import java.util.Scanner;

public class LCM_Efficient {
    static int gcdEfficient(int a, int b){
        if(b==0){
            return a;
        }
        return gcdEfficient(b, a%b );

    }
    static int lcmEfficient(int a, int b,int gcd){
        return (a*b)/gcd;

    }
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int a = read.nextInt();
        int b = read.nextInt();
        int gcd = gcdEfficient(a,b);
        System.out.println(lcmEfficient(a,b,gcd));
    }
}
