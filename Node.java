/**
 * File: Node.java
 * Created Date: June 06, 2013
 * Programmer: Ka-Son Chan
 * Description: This file contains a class of node implementation.
 */ 

/**
 * The Node class represent the datas stores in a node.
 */
public class Node<I, S> {
   private I iData;
  private S sData;
  private Node<I, S> next;

  /**
   * Constructor
   * Creates empty node.
   */
  public Node() {
    iData = null;
    sData = null;
    next = null;
  }

  /**
   * Constructor
   * @param  newIData item to be stored in the node
   * @param  newSData item to be stored in the node
   */
  public Node(I newIData, S newSData) {
    iData = newIData;
    sData = newSData;
    next = null;
  }

  /**
   * Constructor
   * @param  newIData  item to be stored in the node
   * @param  newSData  item to be stored in the node
   * @param  nextValue item to be stored in the node
   */
  public Node(I newIData, S newSData, Node<I, S> nextValue) {
    iData = newIData;
    sData = newSData;
    next = nextValue;
  }

  /**
   * getIData
   * @return iData item stored in the node
   */
  public I getIData() {
    return iData;
  }

  /**
   * getSData
   * @return sData item stored in the node
   */
  public S getSData() {
    return sData;
  }

  /**
   * getNext
   * @return next item stored in the node
   */
  public Node<I, S> getNext() {
    return next;
  }
}