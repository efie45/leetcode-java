package ctci.arraysAndStrings;

import java.util.*;
/**
 * Linked list questions are extremely common. These can range from simple (delete a node in a linked list) to much
 * more challenging. Either way, we advise you to be extremely comfortable with the easiest questions. Being able to
 * easily manipulate a linked list in the simplest ways will make the tougher linked list questions much less tricky.
 * With that said, we present some “must know” code about linked list manipulation. You should be able to easily
 * write this code yourself prior to your interview.
 *
 */

//todo remove duplicates without using buffer such as hashmap or hashtable


public class MyLinkedList<Type> {

  private Node head;

  public static void main(String[] args) {
    MyLinkedList<String> myList = new MyLinkedList<>();
    myList.appendToTail("apple");
    myList.appendToTail("banana");
    myList.appendToTail("cabbage");
    myList.appendToTail("banana");
    myList.appendToTail("pizza");
    myList.appendToTail("cabbage");
    myList.printList();
    myList.removeDuplicateNodes();
    myList.printList();
  }

  private class Node<Type> {
    private Node<Type> next;
    private Type data;

    public Node(Type data) {
      this.data = data;
      this.next = null;
    }

    public Node() {
      this.data = null;
      this.next = null;
    }

    public Type getData() {
      return data;
    }

    public void setData(Type data) {
      this.data = data;
    }

    public Node<Type> getNext() {
      return next;
    }

    public void setNext(Node<Type> next) {
      this.next = next;
    }
  }

  public MyLinkedList() {
    this.head = new Node<>();
  }

  public MyLinkedList(Type data) {
    this.head = new Node<>(data);
  }

  private void appendToTail(Type d){
    Node<Type> newNode = new Node<>(d);
    Node current = this.head;
    if (this.head.getData() == null){
      this.head = newNode;
      return;
    }
    while (current.next != null) {
      current = current.getNext();
    }
    current.setNext(newNode);
  }

  private void removeDuplicateNodes() {
    Node current = this.head;
    Node previous = null;
    HashMap duplicateMap = new HashMap();
    while (current != null) {
      if(duplicateMap.containsKey(current.getData())) previous.setNext(current.getNext());
      else {
        duplicateMap.put(current.getData(),true);
        previous = current;
      }
      current = current.getNext();
    }

  }

  private void printList() {
    Node current = this.head;
    System.out.print("[");
    while (current !=  null){
      System.out.print(current.getData().toString());
      System.out.print(",");
      current = current.getNext();
    }
    System.out.print("]");
    System.out.println("");
  }

}
