/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DataStructures.Recursion;

/**
 *
 * @author Nikhil.Agrawal
 */
import java.util.Scanner;
public class FactorialFuncWithArgsReturn {
    public static void main (String args[]) 
    {
        Scanner Factorials=new Scanner(System.in);
        System.out.println("Enter a number");
        int userInput=Factorials.nextInt();
        int facNum=factorial(userInput);
        System.out.println("Here is the Factorial of "+userInput);
       System.out.println(facNum);
            
    }     
    public static int factorial(int x)
    {
        int facNum=1;
            for(int a=1;a<=x;a++) 
        {
            facNum=facNum*a;
                    
        }  
        return facNum;
    }
}