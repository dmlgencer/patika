package döngüler;

import java.util.Scanner;

public class girilenSayıyaKadarOlanÇiftSayılar {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        for (int i=0; i<number+1; i+=2){
            System.out.println(i);



        }




    }




}
