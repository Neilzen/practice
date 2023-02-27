package org.example.medium.addtwonumbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddTwoNumbersTest {

    @Test
    void addTwoNumbers() {
        // Example usage:
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode l3 = new ListNode(0);
        ListNode l4 = new ListNode(0);

        ListNode l5 = new ListNode(9);
        l5.next = new ListNode(9);
        l5.next.next = new ListNode(9);
        l5.next.next.next = new ListNode(9);
        l5.next.next.next.next = new ListNode(9);
        l5.next.next.next.next.next = new ListNode(9);
        l5.next.next.next.next.next.next = new ListNode(9);

        ListNode l6 = new ListNode(9);
        l6.next = new ListNode(9);
        l6.next.next = new ListNode(9);
        l6.next.next.next = new ListNode(9);

        assertEquals("7,0,8", AddTwoNumbers.parse(AddTwoNumbers.execute(l1, l2)));
        assertEquals("0", AddTwoNumbers.parse(AddTwoNumbers.execute(l3, l4)));
        assertEquals("8,9,9,9,0,0,0,1", AddTwoNumbers.parse(AddTwoNumbers.execute(l5, l6)));
    }

}