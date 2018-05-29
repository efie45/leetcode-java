package ctci.arraysAndStrings;

/**
 *
 */

public class MyQueue<Type> {

  private Node<Type> head, tail;

  private class Node<Type>{
    private Node next;
    private Type data;

    public Node(){
      this.data = null;
      this.next = null;
    }
    public Node(Type data){
      this.data = data;
      this.next = null;
    }
  }

  public MyQueue(){
    this.head = null;
    this.tail = null;
  }

  public MyQueue(Type data){
    Node<Type> newNode = new Node<>(data);
    this.head = newNode;
    this.tail = newNode;
  }

  private void enqueue(Type data){
    Node<Type> newNode = new Node<>(data);

  }

}
