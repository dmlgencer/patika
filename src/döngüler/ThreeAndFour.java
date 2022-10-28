package döngüler;

import java.util.Scanner;

public class ThreeAndFour {

/*


    Ödev
    Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
 */
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        int counter = 0;
        int average;
        int total = 0;
        for (int i=0; i<number+1; i++){

            if ((i%3==0) && (i%4==0)) { //24 ==> 12, 14
                total += i;
                counter++; // 2

            }



        }

        average = total/(counter-1); //12+24 = 36/2
        System.out.println(average);//18






    }


}
