
import java.util.Scanner;

public class NewClass {



public static void main (String[]args){ 
   
   Scanner s = new Scanner (System.in);

   System.out.println("üç tam sayı giriniz");
   
   int a = s.nextInt();
   int b = s.nextInt();
   int c = s.nextInt();
  
          if ((a<b || a==b) && (b<c || b==c))
                System.out.println("a<=b<=c");
          if ((a<c || a==c) && (c<b || b==c))
                System.out.println("a<=c<=b");
          if ((b<a || a==b) && (c<b || c==b))
                System.out.println("c<=b<=a");
          if ((a<b || a==b) && (a<c || a==c))
                System.out.println("c<=a<=b");  
          if ((a<c || a==c) && (b<c || a==c))
                System.out.println("b<=a<=c");
          if ((c<a || a==c) && (b<c || a==c))
                System.out.println("b<=c<=a");
          if ( a==c && b==c)
                System.out.println("b=c=a");
