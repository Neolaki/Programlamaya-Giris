import java.util.Scanner;

public class NewClass {



public static void main (String[]args){ 
   
   Scanner s = new Scanner (System.in);

   System.out.println("İki tam sayı giriniz");
   
   int a = s.nextInt();
   int b = s.nextInt();
   //Klavye girdisi alma 
   
   if (a<b)
       System.out.println("a<b");
      // a tam sayısı b den küçükse komutu
   if (a>b)
       System.out.println("a>b");
      // a tam sayısı b den büyükse komutu
   if (a==b)
       System.out.println("a==b"); 
      // a ve b tam sayıları eşitse komutu
   if (a<=b)
       System.out.println("a<=b");
       b tam sayısı a ya büyük eşitse komutu
   if (a>=b)
       System.out.println("a=>b");
      //a tam sayısı b ye büyük eşitse komutu
   if (a!=b)
       System.out.println("a!=b");
      //a ve b tam sayıları faklıysa komutu   
