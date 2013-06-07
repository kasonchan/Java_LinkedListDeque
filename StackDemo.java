// File: StackDemo.java
// Created Date: June 06, 2013 
// Programmer: Ka-Son Chan
// Description: 

// import java.util.Stack;
import java.util.Scanner;

public class StackDemo {
  public static void main(String[] args) {
    String command = null;
    Scanner keyboard = new Scanner(System.in);

    Stack<Integer, String> stackList = new Stack<Integer, String>();
    
    do {
      System.out.print("Command> ");
      command = keyboard.next();
      if (command.equalsIgnoreCase("empty")) {
        System.out.println(stackList.empty());
      }
      else if (command.equalsIgnoreCase("push")) {
        stackList.push(1, "Kason");
      }
      else if (command.equalsIgnoreCase("pop")) {
        Node<Integer, String> tempNode = null;
        tempNode = stackList.pop();
        System.out.println(tempNode.getIData() + " " + tempNode.getSData());
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