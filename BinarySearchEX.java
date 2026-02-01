import java.util.Scanner;

public class BinarySearchEX
  {
    public static void main(String args[])
    {
      Scanner obj = new Scanner(System.in);
      System.out.println("Enter a range");
      int UserInput = obj.nextInt();
      int arr[] = new int[UserInput];
      System.out.println("Enter "+UserInput+ " number(s) in order:");
      for(int i=0;i<UserInput;i++)
      {
        arr[i]=obj.nextInt();
      }
      System.out.println("Enter a number to search:");
      int x = obj.nextInt();
      int flag = 0;
      int low = 0;
      int high = (UserInput-1);
      for(int i=0;i<UserInput;i++)
        {
          int mid = (low+high)/2;
          if (x==arr[mid])
          {
            flag=1;
          }
            if (x<arr[mid])
            {
              low = 0;
              high = mid;
            }
              if (x>arr[mid])
              {
                 low = mid;
                 high = UserInput-1;
              }
        }
      if (flag==1)
      {
        System.out.println("Search number is not found within the numbers that you have inputted.");
      }
      else
      {
        System.out.println("Search number not found within the numbers that you have inputted.");
      }
      }
    }