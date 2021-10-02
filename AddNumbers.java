import java.util.*;

class AddNumbers {
  public static int AddNumbers(int a,int b)
  {
    return a + b;
  }
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int sum = AddNumbers(a, b);
    System.out.println(sum);
  }
  
}
