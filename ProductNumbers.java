import java.util.*;

class ProductNumbers {
  public static int ProductNumbers(int a,int b)
  {
    return a * b;
  }
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int p = ProductNumbers(a, b);
    System.out.println(p);
  }  
}
