// File: Stack.java
// Created Date: June 06, 2013
// Programmer: Ka-Son Chan
// Description: 

public class Stack<I, S> {
  
  private Node<I, S> top;

  public Stack() {
    top = null;
  }

  public Boolean empty() {
    if (top == null)
      return true;
    return false;
  }

  public Node<I, S> push(I newIData, S newSData) {
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

  public Node<I, S> pop() {
    if (!empty()) {
      Node<I, S> tempNode = top;
      top = top.getNext();
      return tempNode;
    } 
    return null;
  }

}