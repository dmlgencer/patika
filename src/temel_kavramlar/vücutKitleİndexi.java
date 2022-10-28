package temel_kavramlar;

import java.util.Scanner;

public class vücutKitleİndexi {
    public static void main(String[] args) {

        double kilo, boy;


        Scanner inp= new Scanner(System.in);
        System.out.print( "Kilonuzu Kg Cinsinden Giriniz:");
        kilo=inp.nextDouble();
        System.out.print( "Boyunuzu M Cinsinden Giriniz:");
        boy=inp.nextDouble();
        double index= kilo/(boy*boy);
        System.out.println( "Vücut Kitle İndeksiniz:" + index);
    }
}
