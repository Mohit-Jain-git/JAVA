import java.util.*;

public class SearchInArray {
  
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int i;
    int arr[] = new int[size];
    for(i=0;i<size;i++)
    {
      arr[i] = sc.nextInt();
    }
    System.out.println("Enter a number to Search : ");
    int x = sc.nextInt();
    int flag=0;
    for(i=0;i<size;i++)
    {
      if (arr[i] == x) {
        flag = 1;
        break;
      }
    }
    if(flag==1)
      System.out.println("Element found at index " + i);
      else
      System.out.println("Element not present in array.");
  }
}
