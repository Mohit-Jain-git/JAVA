import javax.annotation.processing.SupportedSourceVersion;

import java.util.*;

class HollowPattern {

  public static void main(String args[])
  {
    Scanner scan = new Scanner(System.in);
    int m = scan.nextInt();
    int n = scan.nextInt();
    for(int i=1;i<=m;i++)
    {
       for(int j=1;j<=n;j++)
       {
         if (i == 1 || j == 1 || i == m || j == n)
           System.out.print("*");
           else
           System.out.print(" ");
       }
       System.out.println();
    }
  }
}
