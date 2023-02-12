import java.util.Scanner;

public class Armstrong {

    public static int pow(int a, int b) {
        if(b == 0) return 1;
        int s = pow(a, b/2);
        if(b%2 == 0) {
            return s*s;
        }
        return a*s*s;
    }
    public static int isArmstrong(int n, int digits) {
        if(n == 0) {
            return 0;
        }
        return pow(n%10, digits) + isArmstrong(n/10, digits);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number n: ");
        int n = sc.nextInt();
        int digits = 0;
        int temp = n;
        while(temp > 0){
            digits++;
            temp/=10;
        }
        if(n == isArmstrong(n , digits)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }   
        //System.out.println(pow(4,3));
    }
}
