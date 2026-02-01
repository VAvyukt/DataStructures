import java.util.Scanner;

public class SearchingShortingEX
  {
    public static void main(String args[])
    {
      Scanner obj = new Scanner(System.in);
      System.out.println("Enter a range");
      int UserInput = obj.nextInt();
      int arr[] = new int[UserInput];
      System.out.println("Enter "+UserInput+ " number(s)");
      for(int i=0;i<UserInput;i++)
      {
        arr[i]=obj.nextInt();
      }
      System.out.println("Enter a number to search");
      int x = obj.nextInt();
      int flag=0;
      for(int i=0;i<UserInput;i++)
      {
        if(arr[i]==x)
        {
          flag=1;
          break;
        }
      }
      if(flag==1)
        System.out.println("Number found");
      else
        System.out.println("Number not found");
    }
  }