BLOCK 5 â€“ DATA STRUCTURES & ALGORITHMS

Topic: Linked List Basics

Problem â€“ Reverse a Linked List

Example:
1 -> 2 -> 3 -> 4 -> 5
Output:
5 -> 4 -> 3 -> 2 -> 1

Time Complexity: O(n)

Practice Problem

Find middle of linked list

soln:
     public class Main {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }
    public static int findMiddle(Node head){
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        int mid = count / 2;
        temp = head;

        for (int i = 0; i < mid; i++) {
            temp = temp.next;
        }
        return temp.data;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        System.out.println(findMiddle(head));
    }
}