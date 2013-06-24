/**
 * File: DequeDemo.java
 * Status: Completed
 * Created Date: June 24, 2013
 * Last Modified Date: June 24, 2013
 * Programmer: Ka-Son Chan
 * Description: This file is a demo of how to use the functions singly linked 
 * list Deque class and Node class.
 */ 

import Deque.*;
import java.util.Scanner;

public class DequeDemo {
  public static void main(String[] args) {
    String command = null;
    int iInput;
    String sInput;
    int position;
    Scanner keyboard = new Scanner(System.in);

    /**
     * Declares a new Deque called deque
     */
    Deque<Integer, String> deque = new Deque<Integer, String>();
    
    do {
      System.out.print("Command> ");
      command = keyboard.next();
      if (command.equalsIgnoreCase("empty")) {
        
        /**
         * Calls the empty function from the Deque class
         */
        System.out.println(deque.empty());
      }
      else if (command.equalsIgnoreCase("pushFront")) {
        System.out.print("Integer> ");
        iInput = keyboard.nextInt();
        System.out.print("String> ");
        sInput = keyboard.next();        

        /**
         * Calls the pushFront function from the Deque class
         */
        deque.pushFront(iInput, sInput);
      }
      else if (command.equalsIgnoreCase("pushBack")) {
        System.out.print("Integer> ");
        iInput = keyboard.nextInt();
        System.out.print("String> ");
        sInput = keyboard.next();        

        /**
         * Calls the pushBack function from the Deque class
         */
        deque.pushBack(iInput, sInput);
      }
      else if (command.equalsIgnoreCase("popFront")) {
        Node<Integer, String> tempNode = null;
        
        /**
         * Calls the popFront function from the Deque class
         */
        tempNode = deque.popFront();

        if (tempNode != null) {
          
          /**
           * Calls the getIData and getSData functions from the Node class
           */
          System.out.println(tempNode.getIData());
          System.out.println(tempNode.getSData());
        }
        else {
          System.out.println("Deque is empty.");
        }
      }
      else if (command.equalsIgnoreCase("popBack")) {
        Node<Integer, String> tempNode = null;
        
        /**
         * Calls the popBack function from the Deque class
         */
        tempNode = deque.popBack();

        if (tempNode != null) {
          
          /**
           * Calls the getIData and getSData functions from the Node class
           */
          System.out.println(tempNode.getIData());
          System.out.println(tempNode.getSData());
        }
        else {
          System.out.println("Deque is empty.");
        }
      }
      else if (command.equalsIgnoreCase("front")) {
        Node<Integer, String> tempNode = null;
        
        /**
         * Calls the front function from the Deque
         */
        tempNode = deque.front();

        if (tempNode != null) {
          
          /**
           * Calls the getIData and getSData functions from the Node class
           */
          System.out.println(tempNode.getIData());
          System.out.println(tempNode.getSData());
        }
        else {
          System.out.println("Deque is empty.");
        }        
      }
      else if (command.equalsIgnoreCase("back")) {
        Node<Integer, String> tempNode = null;
        
        /**
         * Calls the back function from the Deque
         */
        tempNode = deque.back();

        if (tempNode != null) {
          
          /**
           * Calls the getIData and getSData functions from the Node class
           */
          System.out.println(tempNode.getIData());
          System.out.println(tempNode.getSData());
        }
        else {
          System.out.println("Deque is empty.");
        }        
      }
      else if (command.equalsIgnoreCase("display")) {
        /**
         * Calls the display function from the Deque
         */
        deque.display();
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