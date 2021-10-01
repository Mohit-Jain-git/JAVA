import java.util.*;

class floydsTriangle {
 
  public static void main(String args[])
  {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int number = 1;
    for(int i=1;i<=n;i++)
    {
       for(int j=1;j<=i;j++)
       {
         System.out.print(number + " ");
         number++;
       }
       System.out.println();
    }
   }
}
