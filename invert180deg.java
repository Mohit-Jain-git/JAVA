import java.util.*;

class invert180deg {
   public static void main(String args[])
   {
     Scanner scan = new Scanner(System.in);
     int m = scan.nextInt();
     for(int i=1;i<=m;i++)
     {
       for (int j = 1; j <= m - i; j++)
       {
         System.out.print(" ");
       }
       for (int j = 1; j <= i; j++)
       {
         System.out.print("*");
       }
       System.out.println();
     }
   }
}
