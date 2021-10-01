import java.util.*;

class invertPattern {
  public static void main(String args[])
  {
    Scanner scan = new Scanner(System.in);
    int m = scan.nextInt();
    for(int i=1;i<=m;i++)
    {
       for(int j=i;j<=m;j++)
       {
         System.out.print("*");
       }
       System.out.println();
    }
   }
  
}
