import java.util.Scanner;

// Q3.Given a number check whether it is prime or not using Recursion.
public class PrimeUsingRecursion {

    public static boolean isPrime(int n, int i) {
        if(n == 1) return false;
        if(n == 2) return true;
        if(i*i > n) {
            return true;    
        }
        if(n%i == 0) return false;
        return isPrime(n, i+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check whether it is a prime or not.");
        int n = sc.nextInt();
        if(n <= 0) {
            System.out.println("Please enter valid number.");
        } else{
            System.out.println(isPrime(n, 2));
        }
    }
}
