import java.util.Scanner;

public class GreatestCommonDivisor {
    static int greatestCommonDivisor(int a , int b){
        int res = Math.min(a,b);
        while(res>0){
            if(a%res ==0 && b%res==0){
                break;
            }
            res --;
        }
        return res;
    }

    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int a = read.nextInt();
        int b = read.nextInt();
        System.out.println(greatestCommonDivisor(a,b));
    }
}
