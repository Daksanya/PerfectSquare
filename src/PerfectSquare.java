import java.util.Scanner;

public class PerfectSquare {
    public static boolean isPerfectSquare(int n){
        if (n<0){
            return false;
        }
        for (int i=1;i<=n;i++){
            if (i*i==n) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        System.out.println(isPerfectSquare(n));
    }
}
