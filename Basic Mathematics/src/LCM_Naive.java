import java.util.Scanner;

public class LCM_Naive {
    static int lcmNaive(int a,int b){
        int res = Math.max(a,b);
        while(true) {
            if (res % a == 0 && res % b == 0) {
                return res;
            }
            res++;
        }
    }

    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int a = read.nextInt();
        int b = read.nextInt();
        System.out.println(lcmNaive(a,b));
    }
}
