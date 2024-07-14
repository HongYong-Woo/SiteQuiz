package m_Collection2_Tree_20240711;

public class BinaryTreeImplement {

  TreeNode head = null;

  public class TreeNode {

    public TreeNode left = null;
    public TreeNode right = null;
    public TreeNode root = null;
    int data;

    public TreeNode(int data) {
      this.data = data;
    }
  }


  public boolean insertNode(int data) {
    if (this.head == null) { //Case 1 : Node가 하나도 없을떄
      this.head = new TreeNode(data);
    } else { //case 2 : Node가 하나 이상 들어가 있을떄
      TreeNode findNode = this.head;
      while (true) {
        if (data < findNode.data) {  //case 2-1 : 현재 Node의 왼쪽에 Node가 들어가야 할떄
          if (findNode.left != null) {
            findNode = findNode.left;
          } else {
            findNode.left = new TreeNode(data);
            findNode.left.root = findNode;
            break;
          }
        } else {  //case 2-2 : 현재 Node의 오른쪽에 Node가 들어가야 할떄
          if (findNode.right != null) {
            findNode = findNode.right;
          } else {
            findNode.right = new TreeNode(data);
            findNode.right.root = findNode;
            break;
          }
        }
      }
    }
    return true;
  }

  public boolean deleteNode(int data) {
    if (this.head == null) //노드가 하나도 없을때
    {
      System.out.println("값이 아무것도 입력되지 않았습니다.");
    } else {
      TreeNode temp = this.head;
      while (true) {


      }
    }
    return true;
  }

  public int searchNode(int data) {
    int result =0;
    if (this.head == null) {
      System.out.println("입력된 값이 없습니다. 0을 반환합니다.");
      return result=0;
    } else {
      TreeNode temp = this.head;
      while (true) {
        if(temp.data == data) {
          result = temp.data;
          break;
        }
        else if (temp.data > data) {
              temp = temp.left;
        } else if (temp.data < data) {
              temp = temp.right;
        }
        if(temp == null) {
          System.out.println("찾는 값이 없습니다.");
          break;
        }
        }
      }
    return result;
  }

  public void printAll() {
    if (this.head == null) {
      System.out.println("값이 아무것도 입력되지 않았습니다.");
    } else {
      TreeNode tempNode = this.head;
      while (true) {

      }
    }
  }
}
