package if_else;

import java.util.Scanner;

public class burç {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Doğduğunuz günü giriniz.");

        int day=scanner.nextInt();
        int month;
        System.out.println("Doğduğunuz ayı giriniz.");
        month=scanner.nextInt();

        if(month==1)
        {
            if(day>=1&&day<=31)
            {
                if(day<=22)
                {
                    System.out.println("Doğum tarihiniz yılın "+day+".günü ve "+month+".ayıdır.");
                    System.out.println("Burcunuz Oğlaktır. ");
                }
                else
                {
                    System.out.println("Doğum tarihiniz yılın "+day+".günü ve "+month+".ayıdır.");
                    System.out.println("Burcunuz Kovadır.");
                }
            }
            else
            {
                System.out.println("Lütfen 1-12 arası bir ay giriniz! ");
            }
        }
        if(month==2)
        {
            if(day>=1&&day<=28)
            {
                if(day<20)
                {
                    System.out.println("Doğum tarihiniz yılın "+day+".günü ve "+month+".ayıdır.");
                    System.out.println("Burcunuz Kovadır. ");
                }
                else
                {
                    System.out.println("Doğum tarihiniz yılın "+day+".günü ve "+month+".ayıdır.");
                    System.out.println("Burcunuz Balıktır.");
                }
            }
            else
            {
                System.out.println("Lütfen 1-12 arası bir ay giriniz! ");
            }
        }
        if(month==3)
        {
            if(day>=1&&day<=31)
            {
                if(day<=20)
                {
                    System.out.println("Doğum tarihiniz yılın "+day+".günü ve "+month+".ayıdır.");
                    System.out.println("Burcunuz Balıktır. ");
                }
                else
                {
                    System.out.println("Doğum tarihiniz yılın "+day+".günü ve "+month+".ayıdır.");
                    System.out.println("Burcunuz Koçtur.");
                }
            }
            else
            {
                System.out.println("Lütfen 1-12 arası bir ay giriniz! ");
            }
        }
        if(month==4)
        {
            if(day>=1&&day<=30)
            {
                if(day<21)
                {
                    System.out.println("Doğum tarihiniz yılın "+day+".günü ve "+month+".ayıdır.");
                    System.out.println("Burcunuz Koçtur. ");
                }
                else
                {
                    System.out.println("Doğum tarihiniz yılın "+day+".günü ve "+month+".ayıdır.");
                    System.out.println("Burcunuz Boğadır.");
                }
            }
            else
            {
                System.out.println("Lütfen 1-12 arası bir ay giriniz! ");
            }
        }
        if(month==5)
        {
            if(day>=1&&day<=31)
            {
                if(day<22)
                {
                    System.out.println("Doğum tarihiniz yılın "+day+".günü ve "+month+".ayıdır.");
                    System.out.println("Burcunuz Boğadır. ");
                }
                else
                {
                    System.out.println("Doğum tarihiniz yılın "+day+".günü ve "+month+".ayıdır.");
                    System.out.println("Burcunuz İkizlerdir.");
                }
            }
            else
            {
                System.out.println("Lütfen 1-12 arası bir ay giriniz! ");
            }
        }
        if(month==6)
        {
            if(day>=1&&day<=31)
            {
                if(day<23)
                {
                    System.out.println("Doğum tarihiniz yılın "+day+".günü ve "+month+".ayıdır.");
                    System.out.println("Burcunuz İkizlerdir. ");
                }
                else
                {
                    System.out.println("Doğum tarihiniz yılın "+day+".günü ve "+month+".ayıdır.");
                    System.out.println("Burcunuz Yengeçtir.");
                }
            }
            else
            {
                System.out.println("Lütfen 1-12 arası bir ay giriniz! ");
            }
        }
        if(month==7)
        {
            if(day>=1&&day<=31)
            {
                if(day<23)
                {
                    System.out.println("Doğum tarihiniz yılın "+day+".günü ve "+month+".ayıdır.");
                    System.out.println("Burcunuz Yengeçtır. ");
                }
                else
                {
                    System.out.println("Doğum tarihiniz yılın "+day+".günü ve "+month+".ayıdır.");
                    System.out.println("Burcunuz Aslandır.");
                }
            }
            else
            {
                System.out.println("Lütfen 1-12 arası bir ay giriniz! ");
            }
        }
        if(month==8)
        {
            if(day>=1&&day<=31)
            {
                if(day<23)
                {
                    System.out.println("Doğum tarihiniz yılın "+day+".günü ve "+month+".ayıdır.");
                    System.out.println("Burcunuz Aslandır. ");
                }
                else
                {
                    System.out.println("Doğum tarihiniz yılın "+day+".günü ve "+month+".ayıdır.");
                    System.out.println("Burcunuz Başaktır.");
                }
            }
            else
            {
                System.out.println("Lütfen 1-12 arası bir ay giriniz! ");
            }
        }
        if(month==9)
        {
            if(day>=1&&day<=31)
            {
                if(day<23)
                {
                    System.out.println("Doğum tarihiniz yılın "+day+".günü ve "+month+".ayıdır.");
                    System.out.println("Burcunuz Başaktır. ");
                }
                else
                {
                    System.out.println("Doğum tarihiniz yılın "+day+".günü ve "+month+".ayıdır.");
                    System.out.println("Burcunuz Terazidir.");
                }
            }
            else
            {
                System.out.println("Lütfen 1-12 arası bir ay giriniz! ");
            }
        }
        if(month==10)
        {
            if(day>=1&&day<=31)
            {
                if(day<23)
                {
                    System.out.println("Doğum tarihiniz yılın "+day+".günü ve "+month+".ayıdır.");
                    System.out.println("Burcunuz Terazidir. ");
                }
                else
                {
                    System.out.println("Doğum tarihiniz yılın "+day+".günü ve "+month+".ayıdır.");
                    System.out.println("Burcunuz Akreptir.");
                }
            }
            else
            {
                System.out.println("Lütfen 1-12 arası bir ay giriniz! ");
            }
        }
        if(month==11)
        {
            if(day>=1&&day<=31)
            {
                if(day<22)
                {
                    System.out.println("Doğum tarihiniz yılın "+day+".günü ve "+month+".ayıdır.");
                    System.out.println("Burcunuz Akreptir. ");
                }
                else
                {
                    System.out.println("Doğum tarihiniz yılın "+day+".günü ve "+month+".ayıdır.");
                    System.out.println("Burcunuz Yaydır.");
                }
            }
            else
            {

                System.out.println("Lütfen 1-12 arası bir ay giriniz! ");
            }
        }
        if(month==12)
        {
            if(day>=1&&day<=31)
            {
                if(day<22)
                {
                    System.out.println("Doğum tarihiniz yılın "+day+".günü ve "+month+".ayıdır.");
                    System.out.println("Burcunuz Yaydır. ");
                }
                else
                {
                    System.out.println("Doğum tarihiniz yılın "+day+".günü ve "+month+".ayıdır.");
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
