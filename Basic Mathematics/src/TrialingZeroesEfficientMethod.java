import java.util.Scanner;

public class TrialingZeroesEfficientMethod {
    static int countTrialingZeroesEff(int n){
        int res = 0 ;
        for (int i=5; i<=n ; i=i*5){
            res = res + n/i;
        }
        return res;
    }

    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        System.out.println(countTrialingZeroesEff(n));
    }
}
