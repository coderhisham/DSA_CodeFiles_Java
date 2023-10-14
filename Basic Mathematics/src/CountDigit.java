import java.util.Scanner;
public class CountDigit {
    static int countd(long x){
        int res = 0;
        while (x>0){
            x = x/10;
            res = res +1;
        }
        return res;
    }

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        long x = read.nextLong();
        System.out.println(countd(x));
    }
}