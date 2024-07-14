package m_Collection2_Tree_20240711;

public class BTtestmain {

  public static void main(String[] args) {
    BinaryTreeImplement bt = new BinaryTreeImplement();
    bt.insertNode(5);
    bt.insertNode(4);
    bt.insertNode(9);
    bt.insertNode(15);
    bt.insertNode(3);
    bt.insertNode(7);
    bt.insertNode(6);

    bt.deleteNode(3);
    System.out.println("찾으려는 값 : " + bt.searchNode(3));

  }
}
