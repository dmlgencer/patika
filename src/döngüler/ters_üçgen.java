package döngüler;

import java.util.Scanner;

public class ters_üçgen {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Basamak Sayısı Giriniz:");
        int number=sc.nextInt();

        for (int i=number; i >0 ; i--){

            for (int k=number-i; k>0; k--){
                System.out.print(" ");
            }

            for (int j=(2*i)-1; j>0; j--){
                System.out.print("*");
            }

            System.out.println(" ");
        }
    }
}
