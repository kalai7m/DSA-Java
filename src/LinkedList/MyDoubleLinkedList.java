package LinkedList;

public class MyDoubleLinkedList {
    class Node {
        int val;
        Node next;
        Node prev;

        Node(int x) {
            this.val = x;
            this.next = this.prev = null;
        }
    }

    Node head;
    int length;

    public MyDoubleLinkedList() {
        head = null;
        length = 0;
    }

    //    public int get(int index) {
//
//    }
    public void addAtHead(int val) {
        Node node = new Node(val);
        if (head != null) {
            node.next = head;
            head.prev = node;
        }
        head = node;
        length++;
    }

    public void addAtTail(int val) {
        Node node = new Node(val);
        length++;
        if (head == null) {
            head=node;
            return;
        }
        Node cur = head;
        while(cur.next != null){
            cur = cur.next;
        }
        cur.next = node;
        node.prev = cur;
    }

    public void addAtIndex(int index, int val){
        Node node = new Node(val);
        if(length-1 < index) return;

    }

    public void print() {
        Node cur = head;
        while (cur.next != null) {
            System.out.print(cur.val + "->");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MyLinkedList li = new MyLinkedList();
        li.addAtTail(4);
        li.addAtHead(2);
        li.addAtHead(1);
        li.addAtTail(3);
        li.print();
    }
}
