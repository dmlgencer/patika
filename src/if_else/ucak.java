package if_else;

import java.util.Scanner;

public class ucak {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int select, age, distance;
        double perDist = 0.10; // Gittiği mesafe başına 0,10 tl belirlenmiştir.
        double ageDiscount, normalPrice, discountedPrice, roundTrip, totalPrice;

        System.out.println("Mesafeyi km cinsinden giriniz: ");
        distance = scan.nextInt();
        System.out.println("Yaşınızı giriniz: ");
        age = scan.nextInt();
        System.out.println("Yolculuk tipini giriniz: (1=>Tek yönlü gidiş , 2=>Gidiş-Dönüş bileti): ");
        select = scan.nextInt();
        if (select == 1 || select == 2 && distance > 0 && age > 0) //Kullanıcının yanlış veri girmesi engellenir.
        {
            if (select == 1) {
                if (age < 12)//Kullanıcı 12 yaşından küçükse %50 indirim yapılır
                {
                    normalPrice = distance * perDist;
                    ageDiscount = normalPrice * 0.50;
                    totalPrice = normalPrice - ageDiscount;
                    System.out.println("Ödeyeceğiniz tutar: " + totalPrice);
                } else if (age < 24 && age > 12)//Kullanıcı 12 yaş veya 24 aralığındaysa %10 indirim yapılır
                {
                    normalPrice = distance * perDist;
                    ageDiscount = normalPrice * 0.10;
                    totalPrice = normalPrice - ageDiscount;
                    System.out.println("Ödeyeceğiniz tutar: " + totalPrice);
                } else if (age > 65)//Kullanıcı 65 yaşından büyükse %30 indirim yapılır
                {
                    normalPrice = distance * perDist;
                    ageDiscount = normalPrice * 0.30;
                    totalPrice = normalPrice - ageDiscount;
                    System.out.println("Ödeyeceğiniz tutar: " + totalPrice);
                } else if(age>24 &&age<65) //Bu aralıkta bir indirim yoktur!
                {
                    totalPrice = distance * perDist;
                    System.out.println("Ödeyeceğiniz tutar: " + totalPrice);

                }
                else {
                    System.out.println("Hatalı Veri girdiniz! ");
                }


            }
            if (select == 2) //Gidiş Dönüş durumu
            {
                if (age < 12) //Kullanıcı gidiş-dönüş aldıysa %20 indirim daha alır.
                {
                    normalPrice = distance * perDist;
                    ageDiscount = normalPrice * 0.50;
                    discountedPrice = normalPrice - ageDiscount;
                    roundTrip = discountedPrice * 0.20;
                    totalPrice = (discountedPrice - roundTrip) * 2;
                    System.out.println("Ödeyeceğiniz tutar: " + totalPrice);

                } else if (age < 24 && age > 12)
                {
                    normalPrice = distance * perDist;
                    ageDiscount = normalPrice * 0.10;
                    discountedPrice = normalPrice - ageDiscount;
                    roundTrip = discountedPrice * 0.20;
                    totalPrice = (discountedPrice - roundTrip) * 2;
                    System.out.println("Ödeyeceğiniz tutar: " + totalPrice);

                } else if (age > 65)
                {
                    normalPrice = distance * perDist;
                    ageDiscount = normalPrice * 0.30;
                    discountedPrice = normalPrice - ageDiscount;
                    roundTrip = discountedPrice * 0.20;
                    totalPrice = (discountedPrice - roundTrip) * 2;
                    System.out.println("Ödeyeceğiniz tutar: " + totalPrice);

                }else if(age>24 &&age<65) //Bu aralıkta bir indirim yoktur!
                {
                    totalPrice = distance * perDist*2;
                    System.out.println("Ödeyeceğiniz tutar: " + totalPrice);

                }
                else {
                    System.out.println("Hatalı Veri girdiniz! ");
                }
            }
        } else {
            System.out.println("Hatalı Veri girdiniz! ");
        }
    }
}
