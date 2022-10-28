package döngüler;

import java.util.Scanner;

public class çiftVeDördünKatı {

    public static void main(String[] args) {



        /*


        Ödev
        Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
         */


        Scanner scanner = new Scanner(System.in);
        int number;
        int sum = 0;
        do {
            System.out.println("Enter a number: ");
            number = scanner.nextInt();
            if((number%2==0) && (number%4==0)){
                sum+=number;

            }
        }while (number%2==0);

        System.out.println(sum);






    }


}
