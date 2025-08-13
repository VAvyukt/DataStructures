/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DataStructures.SearchingAlgs;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class LinearSearchAlgorithmExample {
    public static void main (String args[]) 
    {
        Scanner ArrayKeyElements =new Scanner(System.in);
        System.out.println("Enter a range");      
        int userInput=ArrayKeyElements.nextInt();
        int array[]=new int[userInput];
        System.out.println("Enter "+userInput+" Eelement(s)");  
        for (int i=0;i<userInput;i++)
        {
            array[i]=ArrayKeyElements.nextInt();
        }
        System.out.println("Enter a Key Element:");
        int keyElement=ArrayKeyElements.nextInt();
        int flag=0;
        int position=0;
        int repeat=0;
        for (int i=0;i<userInput;i++)  
        {
            
            if (keyElement==array[i])
            {
                flag=1;
                position=i+1;
                repeat=repeat+1;
            } 
            
        }
        if (flag==1)
            {
                System.out.println("Key Element is found");
                System.out.println("The Key Element is in #"+position+" position.");
        System.out.println("The Key Element is repeated "+repeat+" time(s)");
            }
        else
        {
            System.out.println("Key Element is not found!");
        }
        
    }
    }  
