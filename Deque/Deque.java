/**
 * File: Deque.java
 * Status: Completed
 * Created Date: June 24, 2013
 * Last Modified Date: June 24, 2013
 * Programmer: Ka-Son Chan
 * Description: This file contains a class of singly linked list deque 
 * implementation. 
 */ 

package Deque;

/**
 * The Deque class, which is abbreviation for double-ended queue, is a 
 * sequential container that functions like a queue (or a stack) at both ends. 
 */
public class Deque<I, S> {  
  private Node<I, S> front;
  private Node<I, S> back;

  /**
   * Constructs an empty Deque.
   */
  public Deque() {
    front = null;
    back = null;
  }

  /**
   * Checks if the deque is empty.
   * @return true if and only if this deque contains no items; false otherwise.
   */
  public Boolean empty() {
    if ((front == null) || (back == null))
      return true;
    return false;
  }

  /**
   * Add an element at the front of the deque.
   * @param  newIData item to be pushed onto the deque.
   * @param  newSData item to be pushed onto the deque.
   * @return newNode.
   */
  public Node<I, S> pushFront(final I newIData, final S newSData) {
    if (empty()) {
      Node<I, S> newNode = new Node<I, S>(newIData, newSData);
      front = newNode;
      back = newNode;
      return newNode;
    }
    else {
      Node<I, S> newNode = new Node<I, S>(newIData, newSData, front);
      front = newNode;
      return newNode;
    }
  }

  /**
   * Add an element at the back of the deque.
   * @param  newIData item to be pushed onto the deque.
   * @param  newSData item to be pushed onto the deque.
   * @return newNode.
   */
  public Node<I, S> pushBack(final I newIData, final S newSData) {
    if (empty()) {
      Node<I, S> newNode = new Node<I, S>(newIData, newSData);
      front = newNode;
      back = newNode;
      return newNode;
    }
    else {
      Node<I, S> currNode = front;
      
      while ((currNode.getNext() != null) && (currNode.getNext() != back)) {
        currNode = currNode.getNext();
      }

      Node<I, S> newNode = new Node<I, S>(newIData, newSData);
      back.setNext(newNode);
      back = newNode;
      return newNode;
    }
  }

  /**
   * Retrieves the element at the front of the deque without removing it.
   * @return front if the deque is not empty; null otherwise.
   */
  public Node<I, S> front() {
    if (!empty()) {
      return front;
    } 
    return null;    
  }

  /**
   * Retrieves the element at the back of the deque without removing it.
   * @return back if the deque is not empty; null otherwise.
   */
  public Node<I, S> back() {
    if (!empty()) {
      return back;
    } 
    return null;    
  }

  /**
   * Removes the element at the front of the deque and returns that object as 
   * the value of this function.
   * @return tempNode.
   */
  public Node<I, S> popFront() {
    if (!empty()) {
      Node<I, S> tempNode = front;
      front = front.getNext();
      return tempNode;
    } 
    return null;
  }

  /**
   * Removes the element at the back of the deque and returns that object as 
   * the value of this function.
   * @return tempNode.
   */
  public Node<I, S> popBack() {
    if (!empty()) {
      Node<I, S> tempNode = back;
      Node<I, S> currNode = front;

      if (front == back) {
        front = null;
        back = null;
        return tempNode;
      }

      while (currNode.getNext() != back) {
        currNode = currNode.getNext();
      }

      back = currNode;
      back.setNext(null);
      return tempNode;
    } 
    return null;
  }

  /**
   * Prints all the elements of the deque from the front to back.
   */
  public void display() {
    if (empty()) {
      System.out.println("Deque is empty.");
    }
    else {
      Node<I, S> tempNode = front;

      do {
        System.out.println(tempNode.getIData() + " " + tempNode.getSData());
        tempNode = tempNode.getNext();
      } while (tempNode != null);
    }
  }
}
