import java.util.Scanner;

//Q2. Product of two number using recursion
public class ProductUsingRecursion {

    public static int product(int n, int m) {
        if(n < m) {
            int temp = n;
            n = m;
            m = temp;
        }
        if(m == 0) {
            return 0;
        }
        if(n < m) {
            int temp = n;
            n = m;
            m = temp;
        }
        return n + product(n, m-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number");
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(product(n, m));
    }
}
