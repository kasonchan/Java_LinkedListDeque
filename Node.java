// File: Node.java
// Created Date: June 06, 2013 
// Programmer: Ka-Son Chan
// Description: 

public class Node<I, S> {
  private I iData;
  private S sData;
  private Node<I, S> next;

  public Node() {
    iData = null;
    sData = null;
    next = null;
  }

  public Node(I newIData, S newSData) {
    iData = newIData;
    sData = newSData;
    next = null;
  }

  public Node(I newIData, S newSData, Node<I, S> nextValue) {
    iData = newIData;
    sData = newSData;
    next = nextValue;
  }

  public I getIData() {
    return iData;
  }

  public S getSData() {
    return sData;
  }

  public Node<I, S> getNext() {
    return next;
  }
}