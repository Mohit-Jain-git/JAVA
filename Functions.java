import java.util.*;

class Functions {
  public static void PrintName(String name)
  {
    System.out.println(name);
    return;
  }
  public static void main(String args[])
  {
    Scanner scan = new Scanner(System.in);
    String name = scan.nextLine();
    PrintName(name);
  }
  
}
