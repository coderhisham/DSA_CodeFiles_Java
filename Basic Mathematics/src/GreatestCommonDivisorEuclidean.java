import java.util.Scanner;

public class GreatestCommonDivisorEuclidean {
    static int greatestCommonDivisorEuclidean(int a , int b){
        while(a!=b){
            if(a>b){
                a = a-b;
            }
            else {
                b = b-a;
            }
        }
        return a;
    }

    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int a = read.nextInt();
        int b = read.nextInt();
        System.out.println(greatestCommonDivisorEuclidean(a,b));
    }
}
