package m_Collection1_List_20240710.doubleLinkedList;

public class Node <T>{

  T data = null;
  Node<T> next = null;
  Node<T> before = null;

  public Node(T data) {
    this.data = data;
  }
}
