package m_Collection1_List_20240710.doubleLinkedList;

public class DoubleLinkedList<T> {

  Node<T> head = null;
  Node<T> tail = null;

  /**
   * 값을 뒤쪽에 추가하기
   * @param data
   */
  public void addNode(T data) {
    if (this.head == null) {
      this.head = new Node<T>(data);
    } else {
      Node<T> temp = this.head;
      while (temp.next != null) {
        temp = temp.next;
      }
      temp.next = new Node<T>(data);
      temp.next.before = temp;
    }
  }

  /**
   * 전체 출력
   */
  public void printAll() {
    if (this.head == null) {
      System.out.println("입력된 값이 없음");
    } else {
      Node<T> temp = this.head;
      int index = 0;
      System.out.println(index++ + "번째 값 출력 : " + temp.data);
      while (temp.next != null) {
        temp = temp.next;
        System.out.println(index++ + "번째 값 출력 : " + temp.data);
      }
    }
  }

  /**
   * 검색
   * @찾고싶은_값 data
   */
  public Node<T> searchNode(T data) {
    if (this.head == null) {
      return null;
    } else {
      Node<T> temp = this.head;
      while (temp.next != null) {
        if (temp.data.equals(data)) {
          return temp;
        } else {
          temp = temp.next;
        }
      }
      return null;
    }

  }

  /**
   * 값 삭제
   * @삭제할_값 data
   */
  public boolean deleteNode(T data) {
    if (this.head == null) {
      return false;
    } else {
      Node<T> temp = this.head;
      while (temp.next != null) {
        if (temp.data.equals(data)) {
          temp.before.next = temp.next;
          temp.next.before = temp.before;
          break;
        } else {
          temp = temp.next;
        }
      }
      return true;
    }
  }

  /**
   * 중간에 값 추가
   * @다음에_추가할_위치값 oldData
   * @추가할_값 nextData
   */
  public void insertNode(T oldData, T nextData) {
    if (this.head == null) {
      this.head = new Node<>(nextData);
    } else {
      Node<T> temp = this.head;
      while (temp.next != null) {
        if (temp.data.equals(oldData)) {
          Node<T> newNode = new Node<>(nextData);
          newNode.before = temp;
          newNode.next = temp.next;
          temp.next.before = newNode;
          temp.next = newNode;
          break;
        } else {
          temp = temp.next;
        }
      }
    }
  }

  /**
   * 중간에 값 추가
   *
   * @삭제할_index(0부터) index
   * @추가할_값 data
   */
  public void insertNode(int index, T data) {
    int idx = 0;
    if (idx == index) {
      if (this.head == null) {
        System.out.println("값이 아무것도 입력되지 않은 상태입니다.");
      } else {
        Node<T> node = new Node<>(data);
        node.next = this.head;
        this.head.before = node;
        this.head = node;
      }
    } else {
      Node<T> temp = this.head;
      idx = 1;
      while (temp.next != null) {
        if (idx == index) {
          Node<T> newNode = new Node<>(data);
          newNode.before = temp;
          newNode.next = temp.next;
          temp.next.before = newNode;
          temp.next = newNode;
          break;
        } else {
          temp = temp.next;
          idx++;
        }
      }
      if (idx == index && temp.next == null) {
        Node<T> newNode = new Node<>(data);
        temp.next = newNode;
        newNode.before = temp;
      }
    }


  }

  /**
   * 값 삭제
   *
   * @삭제할_index(0부터) index
   */
  public void deleteNode(int index) {
    int idx = 0;
    if (idx == index) {
      if (this.head == null) {
        System.out.println("값이 아무것도 입력되지 않은 상태입니다.");
      } else {
        this.head = this.head.next;
        this.head.before = null;
      }
    } else {
      Node<T> temp = this.head.next;
      idx = 1;
      while (temp.next != null) {
        if (idx == index) {
          temp.next.before = temp.before;
          temp.before.next = temp.next;
          break;
        } else {
          temp = temp.next;
          idx++;
        }
      }
      if (idx == index && temp.next == null) {
        temp.before.next = null;
      }
    }
  }

  /** List의 마지막 노드 저장 */
  public void setTail() {
    if (this.head != null) {
      Node<T> temp = this.head;
      while (temp.next != null) {
        temp = temp.next;
      }
      this.tail = temp;
    } else {
      System.out.println("값이 아무것도 입력되지 않은 상태입니다.");
    }

  }
}
