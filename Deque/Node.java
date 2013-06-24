/**
 * File: Node.java
 * Status: Completed
 * Created Date: June 08, 2013
 * Last Modified Date: June 24, 2013
 * Programmer: Ka-Son Chan
 * Description: This file contains a class of node implementation.
 */ 

package Deque;

/**
 * The Node class represent the datas stores in a node.
 */
public class Node<I, S> {
  private I iData;
  private S sData;
  private Node<I, S> next;

  /**
   * Constructs empty node.
   */
  public Node() {
    iData = null;
    sData = null;
    next = null;
  }

  /**
   * Constructs a new node with newIData and newSData.
   * @param  newIData item to be stored in the node.
   * @param  newSData item to be stored in the node.
   */
  public Node(I newIData, S newSData) {
    iData = newIData;
    sData = newSData;
    next = null;
  }

  /**
   * Constructs a new node with newIData, newSData and nextValue.
   * @param  newIData  item to be stored in the node.
   * @param  newSData  item to be stored in the node.
   * @param  nextValue item to be stored in the node.
   */
  public Node(I newIData, S newSData, Node<I, S> nextValue) {
    iData = newIData;
    sData = newSData;
    next = nextValue;
  }

  /**
   * Sets the next to nextValue
   * @param nextValue item to be stored in the node.
   */
  public void setNext(Node<I, S> nextValue) {
    this.next = nextValue;
  }

  /**
   * Retrieves iData.
   * @return iData item stored in the node.
   */
  public I getIData() {
    return iData;
  }

  /**
   * Retrieves sData.
   * @return sData item stored in the node.
   */
  public S getSData() {
    return sData;
  }

  /**
   * Retrieves next.
   * @return next item stored in the node.
   */
  public Node<I, S> getNext() {
    return next;
  }
}