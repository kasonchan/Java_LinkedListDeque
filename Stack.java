/**
 * File: Stack.java
 * Created Date: June 06, 2013
 * Programmer: Ka-Son Chan
 * Description: This file contains a class of linked list stack implementation. 
 */ 

/**
 * The Stack class represents a last-in-first-out (LIFO) stack of objects. 
 * The usual push and pop operations are provided, as well as a method to peek 
 * at the top item on the stack, a method to test for whether the stack is 
 * empty, and a method to search the stack for an item and discover how far it 
 * is from the top. When a stack is first created, it contains no items.
 */
public class Stack<I, S> {
  
  private Node<I, S> top;

  /**
   * Constructor
   * Creates an empty Stack.
   */
  public Stack() {
    top = null;
  }

  /**
   * empty
   * Tests if this stack is empty.
   * @return true if and only if this stack contains no items; false otherwise.
   */
  public Boolean empty() {
    if (top == null)
      return true;
    return false;
  }

  /**
   * push
   * Pushes an item onto the top of this stack.
   * @param  newIData item to be pushed onto the stack.
   * @param  newSData item to be pushed onto the stack.
   * @return newNode.
   */
  public Node<I, S> push(final I newIData, final S newSData) {
    if (empty()) {
      Node<I, S> newNode = new Node<I, S>(newIData, newSData);
      top = newNode;
      return newNode;
    }
    else {
      Node<I, S> newNode = new Node<I, S>(newIData, newSData, top);
      top = newNode;
      return newNode;
    }
  }

  /**
   * pop
   * Removes the object at the top of this stack and returns that object as 
   * the value of this function.
   * @return tempNode.
   */
  public Node<I, S> pop() {
    if (!empty()) {
      Node<I, S> tempNode = top;
      top = top.getNext();
      return tempNode;
    } 
    return null;
  }

  /**
   * top
   * Looks at the object at the top of this stack without removing it from the 
   * stack.
   * @return top if the stack is not empty; null otherwise.
   */
  public Node<I, S> top() {
    if (!empty()) {
      return top;
    } 
    return null;    
  }

  /**
   * searchI
   * Returns the 1-based position where an object is on this stack. If the 
   * object o occurs as an item in this stack, this method returns the distance 
   * from the top of the stack of the occurrence nearest the top of the stack; 
   * the topmost item on the stack is considered to be at distance 0. The equals 
   * method is used to compare o to the items in this stack.
   * @param  searchIData item to be searched from the stack
   * @return the 1-based position from the top of the stack where the object is 
   * located; the return value -1 indicates that the object is not on the stack.
   */
  public int searchI(final I searchIData) {
    int position = 0;
    Node<I, S> tempNode = top;

    if (!empty()) {
      do {
        if (searchIData == tempNode.getIData()) {
          return position;
        }
        else {
          position = position + 1;
          tempNode = tempNode.getNext();
        }
      } while (tempNode != null);
    } 
    return -1;
  }

  /**
   * searchS
   * Returns the 1-based position where an object is on this stack. If the 
   * object o occurs as an item in this stack, this method returns the distance 
   * from the top of the stack of the occurrence nearest the top of the stack; 
   * the topmost item on the stack is considered to be at distance 0. The equals 
   * method is used to compare o to the items in this stack.
   * @param  searchSData item to be searched from the stack
   * @return the 1-based position from the top of the stack where the object is 
   * located; the return value -1 indicates that the object is not on the stack.
   */
  public int searchS(final S searchSData) {
    int position = 0;
    Node<I, S> tempNode = top;

    if (!empty()) {
      do {
        if (searchSData.equals(tempNode.getSData())) {
          return position;
        }
        else {
          position = position + 1;
          tempNode = tempNode.getNext();
        }
      } while (tempNode != null);
    }

    return -1;
  }

  /**
   * search
   * Returns the 1-based position where an object is on this stack. If the 
   * object o occurs as an item in this stack, this method returns the distance 
   * from the top of the stack of the occurrence nearest the top of the stack; 
   * the topmost item on the stack is considered to be at distance 0. The equals 
   * method is used to compare o to the items in this stack.
   * @param  searchIData item to be searched from the stack
   * @param  searchSData item to be searched from the stack
   * @return the 1-based position from the top of the stack where the object is 
   * located; the return value -1 indicates that the object is not on the stack.
   */
  public int search(final I searchIData, final S searchSData) {
    int position = 0;
    Node<I, S> tempNode = top;

    if (!empty()) {
      do {
        if ((searchIData == tempNode.getIData()) && (searchSData.equals(tempNode.getSData()))) {
          return position;
        }
        else {
          position = position + 1;
          tempNode = tempNode.getNext();
        }
      } while (tempNode != null);
    }

    return -1;
  }
}