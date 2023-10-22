import java.util.Scanner;

public class GreatestCommonDivisorEuclideanOptimized {
    static int greatestCommonDivisorEuclideanoptimized(int a ,int b){
        if (b==0){
            return a;
        }
        else {
            return greatestCommonDivisorEuclideanoptimized(b,a%b);
        }
    }

    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int a = read.nextInt();
        int b = read.nextInt();
        System.out.println(greatestCommonDivisorEuclideanoptimized(a,b));
    }
}
