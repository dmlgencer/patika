package homeworks;

import java.util.Scanner;

public class H1 {

    /*
        Not Ortalaması Hesaplayan Program
        Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.

        Ödev
        Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.

        Not : If ve Else kullanılmayacak...
     */

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Matematik Notunuzu giriniz:");
        int math = scanner.nextInt();
        System.out.println("Fizik Notunuzu giriniz:");
        int fizik = scanner.nextInt();
        System.out.println("Kimya Notunuzu giriniz:");
        int kimya = scanner.nextInt();
        System.out.println("türkçe Notunuzu giriniz:");
        int türkçe = scanner.nextInt();
        System.out.println("tarih Notunuzu giriniz:");
        int tarih = scanner.nextInt();
        System.out.println("müzik Notunuzu giriniz:");
        int müzik = scanner.nextInt();

        int ortalama = (math + fizik + kimya + müzik + tarih + türkçe)/6;

        System.out.println(ortalama);
        boolean durum = ortalama >= 60;
        System.out.println(durum ? "Sınıfı Geçti." : "Sınıfta Kaldı.");








    }





}
