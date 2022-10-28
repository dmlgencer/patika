package temel_kavramlar;

import java.util.Scanner;

public class daireninAlanıVeÇevresi {
    public static void main(String[] args) {
        int r;
        Scanner input = new Scanner(System .in);
        System.out.println("Dairenin Yarı Çapını Giriniz");
        r = input.nextInt();


        double alan,cevre , 𝜋=3.14,a;
        alan = 𝜋*r*r;
        cevre=2*𝜋*r;


        System.out.println("Dairenin Alanı " +alan);
        System.out.println("Dairenin Çevresi " +cevre);
    }
}
