package döngüler;

import java.util.Scanner;

public class H3 {

    public static void main(String[] args) {

        /*


        Ödev
        Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        for (int i=0; i<number+1; i++){
            if (i%4==0){
                System.out.println(i);
            }
            if(i%5==0){
                System.out.println(i);
            }
        }




    }




}
