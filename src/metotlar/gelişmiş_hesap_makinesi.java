package metotlar;

import java.util.Scanner;

public class gelişmiş_hesap_makinesi {

    static void sum() {
        Scanner input = new Scanner(System.in);
        double number, result = 0.0;
        while (true) {
            System.out.println("Sayiyi giriniz(Çıkmak için 0'a basınız):");
            number = input.nextDouble();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Sonuc:" + result);
    }

    static void minus() {
        Scanner input = new Scanner(System.in);
        double number, result = 0.0;
        while (true) {
            System.out.println("Sayiyi giriniz");
            number = input.nextDouble();
            if (number == 0) {
                break;
            }
            result -= number;
        }
        System.out.println("Sonuc:" + result);
    }

    static void product() {
        Scanner input = new Scanner(System.in);
        double number, result = 0.0;
        while (true) {
            System.out.println("Sayiyi giriniz(Çıkmak için 0'a basınız):");
            number = input.nextDouble();
            if (number == 0) {
                break;
            }
            result *= number;
        }
        System.out.println("Sonuc:" + result);
    }

    static void over() {
        Scanner input = new Scanner(System.in);
        System.out.println("Kac adet sayi gireceksiniz:");
        int sayac = input.nextInt();
        double number, result = 0.0;
        for (int i = 1; i <= sayac; i++) {
            System.out.println(i + ". sayi:");
            number = input.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Bolen 0 olamaz!");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;

            }
            result /= number;

        }

    }

    static void exponentialNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        int base = scan.nextInt();
        System.out.print("Üs değeri giriniz :");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        System.out.println("Sonuc : " + result);

    }

    static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Sonuç : " + result);

    }

    static void mod() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Modu alınacak Sayıyı giriniz :");
        int moduAlinan = sc.nextInt();
        System.out.print("Mod sayısını giriniz :");
        int modSayisi = sc.nextInt();
        int sonuc = moduAlinan % modSayisi;
        System.out.println("Sonuç : " + sonuc);

    }

    static void rectangularAreaAndPerimiterCalculation() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Birinci kenar uzunluğunun giriniz :");
        int kenar1 = sc.nextInt();
        System.out.print("İkinci kenar uzunluğunun giriniz :");
        int kenar2 = sc.nextInt();
        int alan, cevre;
        cevre = 2 * (kenar1 + kenar2);
        alan = kenar1 * kenar2;
        System.out.println("Dikdörtgenin çevresi: " + cevre);
        System.out.println("Dikdörtgenin alanı: " + alan);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        System.out.println("Sum:1\nMinus:2\nProduct:3\nOver:4\nExponential Number:5\nFactorial:6\nMod:7\nRectangular area and perimeter calculation:8");
        System.out.print("Select number for calculate:");
        a = input.nextInt();
        switch (a) {
            case 1:
                sum();
                break;
            case 2:
                minus();
                break;
            case 3:
                product();
                break;
            case 4:
                over();
                break;
            case 5:
                exponentialNumber();
                break;
            case 6:
                factorial();
                break;
            case 7:
                mod();
                break;
            case 8:
                rectangularAreaAndPerimiterCalculation();
                break;
            case 0:
                break;

        }//and of the switch
    }
}
