package org.example.medium.addtwonumbers;

public class ListNode {
    int val;
    ListNode next;

    public ListNode() {

    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public boolean hasNext() {
        return next != null;
    }
}
