package if_else;

import java.util.Scanner;

public class cinZodyagı {

    public static void main(String[] args) {

        Scanner imp = new Scanner(System.in);
        int yil;
        System.out.print("Doğum yılınızı giriniz:");
        yil = imp.nextInt();
        if(yil%12 == 0){
            System.out.print("Çin Zodyağı Burcunuz: Maymun");
        }else if(yil%12 == 1){
            System.out.print("Çin Zodyağı Burcunuz: Horoz");
        }else if(yil%12 == 2){
            System.out.print("Çin Zodyağı Burcunuz: Köpek");
        }else if(yil%12 == 3){
            System.out.print("Çin Zodyağı Burcunuz: Domuz");
        }else if(yil%12 == 4){
            System.out.print("Çin Zodyağı Burcunuz: Fare");
        }else if(yil%12 == 5){
            System.out.print("Çin Zodyağı Burcunuz: Öküz");
        }else if(yil%12 == 6){
            System.out.print("Çin Zodyağı Burcunuz: Kaplan");
        }else if(yil%12 == 7){
            System.out.print("Çin Zodyağı Burcunuz: Tavşan");
        }else if(yil%12 == 8){
            System.out.print("Çin Zodyağı Burcunuz: Ejderha");
        }else if(yil%12 == 9){
            System.out.print("Çin Zodyağı Burcunuz: Yılan");
        }else if(yil%12 == 10){
            System.out.print("Çin Zodyağı Burcunuz: At");
        }else if(yil%12 == 11){
            System.out.print("Çin Zodyağı Burcunuz: Koyun");
        }else{
            System.out.print("Hatalı bir değer girdiniz");
        }
    }
}
