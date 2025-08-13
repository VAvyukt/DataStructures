/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DataStructures.Stacks;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class StackTopExample {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int repeat=1;
        int top=-1;    
        int size=5;
        int array[]=new int[size];
        while(repeat==1)
        {
        System.out.println("Enter Your Choice: ");
        System.out.println("1: Push");
        System.out.println("2: Pop");
        System.out.println("3: Display");
        System.out.println();
        int userInput = scanner.nextInt();
        if (userInput==1)
        {
            top++;
            if(top<=(size-1))
            {
            System.out.println();
            System.out.println("Enter an Element to Push");
            int element = scanner.nextInt();
            array[top]=element;
            System.out.println("Element ("+element+") was added successfully!");
            System.out.println("==============================================================");
            System.out.println();
        }
            else
            {
                System.out.println("The stack is full");
            }
        }
        else if(userInput==2)
        {
            if(top==-1)
            {
                System.out.println();
                System.out.println("The array has no elements to pop.");
                System.out.println("==============================================================");
                System.out.println();
            }
            else
            {
               System.out.println("Element "+array[top]+" has been removed");
               top--;
            }
        }
        else if(userInput==3)
        {
            if(top==-1)
            {
                System.out.println();
                System.out.println("Empty Stack");
                System.out.println("==============================================================");
            }
            else
            {
                System.out.println();
                System.out.println("Here is the current array:");
                for (int i=0;i<=top;i++)
                {
                System.out.print(array[i]+", ");
                System.out.println("==============================================================");
                System.out.println();
                }
            }
        }
        else
        {
            System.out.println("INVALID ENTRY");
        }
        System.out.println("Do you want to perform another action?");
        
        
        System.out.println("1: Yes");
        System.out.println("0: No");
        System.out.println();
        repeat = scanner.nextInt();
        while(repeat!=0 && repeat!=1)
        {
        System.out.println("INVALID ENTRY, Please Provide a Valid Entry");
        System.out.println("1: Yes");
        System.out.println("0: No");
        System.out.println();
        repeat = scanner.nextInt();
        }
    }
}
}