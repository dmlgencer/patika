package döngüler;

import java.util.Scanner;

public class armstrong {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Bir Sayı Girin: ");


        int num = sc.nextInt();

        int counter = 0,sum=0;

        while(num != 0)
        {
            sum +=  (num%10);
            num /= 10;
            ++counter;
        }
        System.out.println("basamak sayısı : " + counter);
        System.out.println("basamak toplamı: " + sum);
    }
}

