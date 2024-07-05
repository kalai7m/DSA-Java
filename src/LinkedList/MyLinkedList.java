package LinkedList;

import java.util.Arrays;
import java.util.Collections;

class MyLinkedList {

    class Node {
        int val;
        Node next;

        Node(int x) {
            this.val = x;
            this.next = null;
        }
    }

    Node head;

    public MyLinkedList() {
        head = null;
    }

    public int get(int index) {
        Node temp = head;
        int c = 0;
        while (temp != null) {
            if (c == index) return temp.val;
            temp = temp.next;
            c++;
        }
        return -1;
    }

    public void addAtHead(int val) {
        Node node = new Node(val);
        if (head != null) {
            node.next = head;
        }
        head = node;
    }

    public void addAtTail(int val) {
        Node node = new Node(val);
        Node temp = head;
        if (temp == null) head = node;
        else {
            while (temp.next != null)
                temp = temp.next;
            temp.next = node;
        }
    }

    public void addAtIndex(int index, int val) {
        int c = 0;
        Node temp = head, prev = null;
        while (temp != null) {
            if (c == index) {
                Node node = new Node(val);
                node.next = temp;
                if (prev == null) head = node;
                else prev.next = node;
            }
            prev = temp;
            temp = temp.next;
            c++;
        }
        if (c == index) {
            Node node = new Node(val);
            node.next = temp;
            if (prev == null) head = node;
            else prev.next = node;
        }
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void deleteAtIndex(int index) {
        Node temp = head, prev = null;
        int c = -1;
        while (temp != null) {
            c++;
            if (c == index) break;
            prev = temp;
            temp = temp.next;
        }
        if (c == index) {
            //single element
            if (temp == head)
                head = temp.next;
            else {
                prev.next = temp.next;
            }
        }
    }

    public void reverse() {
        Node p = null, n = null, c = head;
        while (c != null) {
            n = c.next;
            c.next = p;
            p = c;
            c = n;
        }
        head = p;
//        return p;
    }

    void removeNodes() {
        reverse();
        Node cur = head;
        while (cur != null && cur.next != null) {
            while (cur != null && cur.next != null && cur.val > cur.next.val) {
                cur.next = cur.next.next;
            }
            if (cur != null)
                cur = cur.next;
        }
        reverse();
//        return head;
    }

    public static void main(String[] args) {
//        MyLinkedList list = new MyLinkedList();
//        list.addAtHead(7);
//        list.addAtHead(4);
//        list.addAtHead(6);
//        list.addAtTail(5);
//        list.addAtHead(3);
//        list.addAtHead(1);
//        list.addAtHead(2);
//        list.print();
////        list.oddEvenList();
//        list.reverse();
//        list.print();
//        list.removeNodes();
//        list.print();
        String w1="abc", w2="pqrstuv";
            int i = 0, j = 0, n = w1.length(), m = w2.length();
            int k=0;
            char res[] = new char[n+m];
            while(i<n && j<m){
                if(k%2 == 1){
                    res[k] = w2.charAt(j);
                    j++;
                } else {
                    res[k] = w1.charAt(i);
                    i++;
                }
                k++;
            }
            while(i<n){
                res[k++] = w1.charAt(i);
                i++;
            }
            while(j<m){
                res[k++] = w2.charAt(j);
                j++;
            }
        System.out.println(new String(res));
    }

    public void oddEvenList() {
        Node eStart = null, eEnd = null, oStart = null, oEnd = null, cur = head;
        while (cur != null) {
            if (cur.val % 2 == 0) {
                if (eStart == null) {
                    eStart = cur;
                    eEnd = cur;
                } else {
                    eEnd.next = cur;
                    eEnd = cur;
                }
            } else {
                if (oStart == null) {
                    oStart = cur;
                    oEnd = cur;
                } else {
                    oEnd.next = cur;
                    oEnd = cur;
                }
            }
            cur = cur.next;
        }
        // if(eStart == null && oStart == null) return head;
        eEnd.next = null;
        oEnd.next = null;
        if (head.val % 2 == 0) {
            eEnd.next = oStart;
            head = eStart;
        } else {
            oEnd.next = eStart;
            head = oStart;
        }
//        return head;
    }
}