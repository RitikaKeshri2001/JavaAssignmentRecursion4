import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to convert it into binary number");
        int n = sc.nextInt();
        int bin = 0, pow = 1;
        while(n>0) {
            int rem = n%2;
            bin = bin + rem*pow;
            pow = pow * 10;
            n = n/2;
        }
        System.out.println(bin);
    }
}
