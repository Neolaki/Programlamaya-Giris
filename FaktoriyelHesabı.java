import java.util.Scanner;


public class JavaApplication7 {
  public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int n,c,fak=1;
        System.out.println("Lütfen bir sayı girin");
        n = s.nextInt();
        
        if(n<0)
        System.out.println("Yanlış aralıkta bir sayı girdiniz");
        else
        {
        for(c=2;c<=n;c++)
        fak*=c;
        System.out.println(fak);
        }
        
  }
}
