/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DataStructures.SortingAlgs;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class SelectionSortAlgorithm {
    public static void main(String args[])
    {
        Scanner ArrayKeyElements =new Scanner(System.in);
        System.out.println("Enter a range");      
        int userInput=ArrayKeyElements.nextInt();
        int array[]=new int[userInput];
        System.out.println("Enter "+userInput+" Unique Element(s)");  
        for (int i=0;i<userInput;i++)
        {
            array[i]=ArrayKeyElements.nextInt();
        }
        for(int i=0; i<(userInput-1);i++)
        {
            int min=i;
            for(int j=i+1; j<(userInput); j++)
            {
                if(array[j]<array[min])
                {
                    min=j;
                }
               
            }
          
                int temp=array[i];
                array[i]=array[min];
                array[min]=temp;
            
        }
        System.out.println("Here are the Elements in Ascending Order:");
        for (int i=0; i<userInput; i++)
        {
            System.out.println(array[i]);
        }
    }
}
