import java.util.*;

class Factorial {
  public static void Factorial(int n)
  {
    int fact = 1;
    for(int i=n;i>=1;i--)
    {
      fact = fact * i;
    }
    System.out.println(fact);
  }
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Factorial(n);
  }
  
}
