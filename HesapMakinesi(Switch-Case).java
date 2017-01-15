package javaapplication7;

import java.util.Scanner;

public class JavaApplication7 {

    public static void main(String[] args) {

   
              Scanner s=new Scanner(System.in);
             
               System.out.println("Lütfen bir işlem seçin");
               System.out.println("1-Çarpma\n2-Toplama\n3-Bölme\n4-Çıkarma\n4-Çıkış");
               
              int choose=s.nextInt();
              // İşlem seçimi için ekrandan sayı alan kod 
              System.out.println("Lütfen iki sayı seçin");
                 
              float a =s.nextFloat();
              float b =s.nextFloat();
              //Ekrandan değişken alan kod 
        switch (choose) {//İşlem yaptıracak döngü kodu
            case 1:
                System.out.println(a*b);
                break;
            case 2:
                System.out.println(a+b);
                break;
            case 3:
                System.out.println(a/b);
                break;
            case 4:
                System.out.println(a-b);
                break;
            case 5:
                System.out.println("hesap makinesini kullandığınız için teşekkür ederiz");
                break;
            default:
                System.out.println("Böyle bir seçenek yok ");
                break;
          }    
        }
      }
