/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DataStructures.Recursion;

import static DataStructures.Recursion.FactorialFuncWithArgsReturn.factorial;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class FactorialWithRecursion {
    public static void main(String args[])
    { 
      Scanner Factorials=new Scanner(System.in);
      System.out.println("Enter a number");
      int userInput=Factorials.nextInt();
      int facNum=factorial(userInput);
      int result=factorial(facNum);
       System.out.println("Here is the Factorial of "+userInput);
       System.out.println(facNum);
}
    public static int factorial(int x)
    {
        int facNum=1;
        if(x==0 || x==1)
        {
            return facNum;
        }
        else
        {
            facNum=x*factorial(x-1); //you can also type return x*factorial(x-1) you don't need an extra variable to store this.
            return facNum;
        }
    }
}
