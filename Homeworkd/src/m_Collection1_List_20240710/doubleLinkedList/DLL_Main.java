package m_Collection1_List_20240710.doubleLinkedList;


import java.util.LinkedList;

public class DLL_Main {

  public static void main(String[] args) {
    DoubleLinkedList<String> linkedList = new DoubleLinkedList<>();
    linkedList.printAll();
    linkedList.addNode("First");
    linkedList.addNode("Second");
    linkedList.addNode("Third");
    System.out.println("==========전부 출력==========");
    linkedList.printAll();

    System.out.println("==========검색==========");
    Node<String> node = linkedList.searchNode("Second");
    System.out.println(node.data);

    System.out.println("==========삭제==========");
    //linkedList.deleteNode("Second");
    linkedList.deleteNode(2);
    linkedList.printAll();

    System.out.println("==========중간 추가==========");
    //linkedList.insertNode("First", "Fourth");
    linkedList.insertNode(2, "Fourth");
    linkedList.printAll();


  }
}
