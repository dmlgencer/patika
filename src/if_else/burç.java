package if_else;

import java.util.Scanner;

public class burç {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Doğduğunuz günü giriniz.");

        int gun=scanner.nextInt();
        int ay;
        System.out.println("Doğduğunuz ayı giriniz.");
        ay=scanner.nextInt();

        if(ay==1)
        {
            if(gun>=1&&gun<=31)
            {
                if(gun<=22)
                {
                    System.out.println("Doğum tarihiniz yılın "+gun+".günü ve "+ay+".ayıdır.");
                    System.out.println("Burcunuz Oğlaktır. ");
                }
                else
                {
                    System.out.println("Doğum tarihiniz yılın "+gun+".günü ve "+ay+".ayıdır.");
                    System.out.println("Burcunuz Kovadır.");
                }
            }
            else
            {
                System.out.println("Lütfen 1-12 arası bir ay giriniz! ");
            }
        }
        if(ay==2)
        {
            if(gun>=1&&gun<=28)
            {
                if(gun<20)
                {
                    System.out.println("Doğum tarihiniz yılın "+gun+".günü ve "+ay+".ayıdır.");
                    System.out.println("Burcunuz Kovadır. ");
                }
                else
                {
                    System.out.println("Doğum tarihiniz yılın "+gun+".günü ve "+ay+".ayıdır.");
                    System.out.println("Burcunuz Balıktır.");
                }
            }
            else
            {
                System.out.println("Lütfen 1-12 arası bir ay giriniz! ");
            }
        }
        if(ay==3)
        {
            if(gun>=1&&gun<=31)
            {
                if(gun<=20)
                {
                    System.out.println("Doğum tarihiniz yılın "+gun+".günü ve "+ay+".ayıdır.");
                    System.out.println("Burcunuz Balıktır. ");
                }
                else
                {
                    System.out.println("Doğum tarihiniz yılın "+gun+".günü ve "+ay+".ayıdır.");
                    System.out.println("Burcunuz Koçtur.");
                }
            }
            else
            {
                System.out.println("Lütfen 1-12 arası bir ay giriniz! ");
            }
        }
        if(ay==4)
        {
            if(gun>=1&&gun<=30)
            {
                if(gun<21)
                {
                    System.out.println("Doğum tarihiniz yılın "+gun+".günü ve "+ay+".ayıdır.");
                    System.out.println("Burcunuz Koçtur. ");
                }
                else
                {
                    System.out.println("Doğum tarihiniz yılın "+gun+".günü ve "+ay+".ayıdır.");
                    System.out.println("Burcunuz Boğadır.");
                }
            }
            else
            {
                System.out.println("Lütfen 1-12 arası bir ay giriniz! ");
            }
        }
        if(ay==5)
        {
            if(gun>=1&&gun<=31)
            {
                if(gun<22)
                {
                    System.out.println("Doğum tarihiniz yılın "+gun+".günü ve "+ay+".ayıdır.");
                    System.out.println("Burcunuz Boğadır. ");
                }
                else
                {
                    System.out.println("Doğum tarihiniz yılın "+gun+".günü ve "+ay+".ayıdır.");
                    System.out.println("Burcunuz İkizlerdir.");
                }
            }
            else
            {
                System.out.println("Lütfen 1-12 arası bir ay giriniz! ");
            }
        }
        if(ay==6)
        {
            if(gun>=1&&gun<=31)
            {
                if(gun<23)
                {
                    System.out.println("Doğum tarihiniz yılın "+gun+".günü ve "+ay+".ayıdır.");
                    System.out.println("Burcunuz İkizlerdir. ");
                }
                else
                {
                    System.out.println("Doğum tarihiniz yılın "+gun+".günü ve "+ay+".ayıdır.");
                    System.out.println("Burcunuz Yengeçtir.");
                }
            }
            else
            {
                System.out.println("Lütfen 1-12 arası bir ay giriniz! ");
            }
        }
        if(ay==7)
        {
            if(gun>=1&&gun<=31)
            {
                if(gun<23)
                {
                    System.out.println("Doğum tarihiniz yılın "+gun+".günü ve "+ay+".ayıdır.");
                    System.out.println("Burcunuz Yengeçtır. ");
                }
                else
                {
                    System.out.println("Doğum tarihiniz yılın "+gun+".günü ve "+ay+".ayıdır.");
                    System.out.println("Burcunuz Aslandır.");
                }
            }
            else
            {
                System.out.println("Lütfen 1-12 arası bir ay giriniz! ");
            }
        }
        if(ay==8)
        {
            if(gun>=1&&gun<=31)
            {
                if(gun<23)
                {
                    System.out.println("Doğum tarihiniz yılın "+gun+".günü ve "+ay+".ayıdır.");
                    System.out.println("Burcunuz Aslandır. ");
                }
                else
                {
                    System.out.println("Doğum tarihiniz yılın "+gun+".günü ve "+ay+".ayıdır.");
                    System.out.println("Burcunuz Başaktır.");
                }
            }
            else
            {
                System.out.println("Lütfen 1-12 arası bir ay giriniz! ");
            }
        }
        if(ay==9)
        {
            if(gun>=1&&gun<=31)
            {
                if(gun<23)
                {
                    System.out.println("Doğum tarihiniz yılın "+gun+".günü ve "+ay+".ayıdır.");
                    System.out.println("Burcunuz Başaktır. ");
                }
                else
                {
                    System.out.println("Doğum tarihiniz yılın "+gun+".günü ve "+ay+".ayıdır.");
                    System.out.println("Burcunuz Terazidir.");
                }
            }
            else
            {
                System.out.println("Lütfen 1-12 arası bir ay giriniz! ");
            }
        }
        if(ay==10)
        {
            if(gun>=1&&gun<=31)
            {
                if(gun<23)
                {
                    System.out.println("Doğum tarihiniz yılın "+gun+".günü ve "+ay+".ayıdır.");
                    System.out.println("Burcunuz Terazidir. ");
                }
                else
                {
                    System.out.println("Doğum tarihiniz yılın "+gun+".günü ve "+ay+".ayıdır.");
                    System.out.println("Burcunuz Akreptir.");
                }
            }
            else
            {
                System.out.println("Lütfen 1-12 arası bir ay giriniz! ");
            }
        }
        if(ay==11)
        {
            if(gun>=1&&gun<=31)
            {
                if(gun<22)
                {
                    System.out.println("Doğum tarihiniz yılın "+gun+".günü ve "+ay+".ayıdır.");
                    System.out.println("Burcunuz Akreptir. ");
                }
                else
                {
                    System.out.println("Doğum tarihiniz yılın "+gun+".günü ve "+ay+".ayıdır.");
                    System.out.println("Burcunuz Yaydır.");
                }
            }
            else
            {

                System.out.println("Lütfen 1-12 arası bir ay giriniz! ");
            }
        }
        if(ay==12)
        {
            if(gun>=1&&gun<=31)
            {
                if(gun<22)
                {
                    System.out.println("Doğum tarihiniz yılın "+gun+".günü ve "+ay+".ayıdır.");
                    System.out.println("Burcunuz Yaydır. ");
                }
                else
                {
                    System.out.println("Doğum tarihiniz yılın "+gun+".günü ve "+ay+".ayıdır.");
                    System.out.println("Burcunuz Oğlaktır.");
                }
            }
            else
            {
                System.out.println("Lütfen 1-12 arası bir ay giriniz! ");
            }
        }
    }
}
