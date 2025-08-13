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
import java.util.Stack;
public class StackExample {
    public static void main(String args[])
    {
        Stack<Integer> stack=new Stack<>(); //Generic class
        System.out.println("The Stack "+stack);
        System.out.println("This shows an empty array, which is the stack");
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("The stack after all of the pushes "+stack);
        System.out.println("This shows an array with the values that we pushed, which is the stack");
        stack.pop();
        System.out.println("Here is the stack after one pop, notice the last element that we pushed is popped first. "+stack);
        stack.pop();
        System.out.println("Here is the stack after two pops. "+stack);
        stack.pop();
        System.out.println("Here is the stack after three pops. "+stack);
        
        
    }
}
