package ctci.arraysAndStrings;

import java.util.*;

/**
 * Whether you are asked to implement a simple stack / queue, or you are asked to implement a modified version of
 * one, you will have a big leg up on other candidates if you can flawlessly work with stacks and queues. Practice
 * makes perfect! Here is some skeleton code for a Stack and Queue class.
 */
public class MyStack<Type> {
  private Node<Type> top;

  public static void main(String[] args){
    MyStack<String> myStack = new MyStack<>();
    myStack.push("pizza1");
    myStack.push("pizza2");
    myStack.push("pizza3");
    System.out.println(myStack.pop());
    System.out.println(myStack.pop());
    System.out.println(myStack.pop());
    System.out.println(myStack.pop());
  }

  public MyStack() {
    this.top = null;
  }

  public MyStack(Type data) {
    this.top = new Node<Type>(data);
  }

  private class Node<Type> {
    Node next;
    Type data;

    private Node(Type data) {
      this.next = null;
      this.data = data;
    }

    private Node() {
      this.next = null;
      this.data = null;
    }

    private Type getData() {
      return this.data;
    }

    private void setData(Type newData) {
      this.data = newData;
    }

    private Node<Type> getNext() {
      return this.next;
    }

    private void setNext(Node<Type> newNext) {
      this.next = newNext;
    }
  }

  private void push(Type data){
    Node<Type> newNode = new Node<>(data);
    newNode.setNext(this.top);
    this.top = newNode;
  }

  private Type pop(){
    if(this.top == null){
      return null;
    }
    Node<Type> temp = this.top;
    this.top = this.top.getNext();
    return temp.getData();
  }

  private Type peek() {
    return this.top.getData();
  }

}
