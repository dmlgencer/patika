package metotlar;

import java.util.Scanner;

public class Fibonacci {


    static int fibonacci(int n){

        if (n == 1 || n == 2 ) {
            return 1 ;

        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the n : ");
        int n = input.nextInt();
        fibonacci(n);
        System.out.println(fibonacci(n));
    }
}
