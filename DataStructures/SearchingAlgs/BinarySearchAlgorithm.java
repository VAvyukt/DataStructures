/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DataStructures.SearchingAlgs;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class BinarySearchAlgorithm {
    public static void main (String args[]) 
    {
        Scanner ArrayKeyElements =new Scanner(System.in);
        System.out.println("Enter a range");      
        int userInput=ArrayKeyElements.nextInt();
        int array[]=new int[userInput];
        System.out.println("Enter "+userInput+" Eelement(s) from lowest to highest");  
        for (int i=0;i<userInput;i++)
        {
            array[i]=ArrayKeyElements.nextInt();
        }
        System.out.println("Enter a Key Element:");
        int keyElement=ArrayKeyElements.nextInt();
        
        int low=0;
        int high=(userInput-1);
        int flag=0;
        for(int i=0; i<userInput; i++)
        {
            int mid=((low+high)/2);
            if(array[mid]==keyElement)
        {
            flag=1;
        }
        
        else if((array[mid])>keyElement)
        {
            low=0;
            high=mid;
        }
        else
        {
            low=mid;
            high=userInput;
        }
        }
        if(flag==1)
        {
            System.out.println("The Key Element is Found");
        }
        else
        {
            System.out.println("The Key Element is not Found Within the Range");
        }
    }
}