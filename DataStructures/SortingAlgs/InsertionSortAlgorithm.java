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
public class InsertionSortAlgorithm {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int userInput = scanner.nextInt();

        int[] arr = new int[userInput];
        System.out.println("Enter " + userInput + " numbers:");
        for (int i = 0; i < userInput; i++) 
        {
            arr[i] = scanner.nextInt();
        }

        for (int i=1; i<userInput; i++) 
        {
            int key = arr[i];
            int j = i-1;
            while (j>=0 && arr[j]>key) 
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }

        System.out.println("Here are the Elements in Ascending Order:");
       for (int i=0; i<userInput; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
