/**
 * File: StackDemo.java
 * Created Date: June 06, 2013
 * Programmer: Ka-Son Chan
 * Description: This file is a demo of how to use the functions linked list 
 * stack Stack class and Node class.
 */ 

import java.util.Scanner;

public class StackDemo {
  public static void main(String[] args) {
    String command = null;
    int iInput;
    String sInput;
    int position;
    Scanner keyboard = new Scanner(System.in);

    /**
     * Declares a new Stack called stackList
     */
    Stack<Integer, String> stackList = new Stack<Integer, String>();
    
    do {
      System.out.print("Command> ");
      command = keyboard.next();
      if (command.equalsIgnoreCase("empty")) {
        
        /**
         * Calls the empty function from the Stack class
         */
        System.out.println(stackList.empty());
      }
      else if (command.equalsIgnoreCase("push")) {
        System.out.print("Integer> ");
        iInput = keyboard.nextInt();
        System.out.print("String> ");
        sInput = keyboard.next();        

        /**
         * Calls the push function from the Stack class
         */
        stackList.push(iInput, sInput);
      }
      else if (command.equalsIgnoreCase("pop")) {
        Node<Integer, String> tempNode = null;
        
        /**
         * Calls the pop function from the Stack class
         */
        tempNode = stackList.pop();

        if (tempNode != null) {
          
          /**
           * Calls the getIData and getSData functions from the Node class
           */
          System.out.println(tempNode.getIData());
          System.out.println(tempNode.getSData());
        }
        else {
          System.out.println("Stack is empty.");
        }
      }
      else if (command.equalsIgnoreCase("top")) {
        Node<Integer, String> tempNode = null;
        
        /**
         * Calls the top function from the Stack
         */
        tempNode = stackList.top();

        if (tempNode != null) {
          
          /**
           * Calls the getIData and getSData functions from the Node class
           */
          System.out.println(tempNode.getIData());
          System.out.println(tempNode.getSData());
        }
        else {
          System.out.println("Stack is empty.");
        }        
      }
      else if (command.equalsIgnoreCase("searchi")) {
        System.out.print("Integer> ");
        iInput = keyboard.nextInt();      

        /**
         * Call the searchI function from the Stack
         */
        System.out.println(stackList.searchI(iInput));
      }
      else if (command.equalsIgnoreCase("searchs")) {
        System.out.print("String> ");
        sInput = keyboard.next();      

        /**
         * Call the searchS function from the Stack
         */
        System.out.println(stackList.searchS(sInput));
      }
      else if (command.equalsIgnoreCase("search")) {
        System.out.print("Integer> ");
        iInput = keyboard.nextInt();      
        System.out.print("String> ");
        sInput = keyboard.next();      

        /**
         * Call the search function from the Stack
         */
        System.out.println(stackList.search(iInput, sInput));
      }
      else if (command.equalsIgnoreCase("exit")) {
        System.exit(0);
      }
      else {
        System.out.println("Error. Invalid command.");
      }
    } while (!command.equalsIgnoreCase("exit"));
  }
}