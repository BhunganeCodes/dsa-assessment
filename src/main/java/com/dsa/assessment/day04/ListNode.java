package com.dsa.assessment.day04;

/**
 * Singly Linked List Node
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {}

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    /**
     * Helper method to create linked list from array
     */
    public static ListNode fromArray(int[] values) {
        if (values == null || values.length == 0) return null;
        ListNode head = new ListNode(values[0]);
        ListNode current = head;
        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }
        return head;
    }

    /**
     * Helper method to convert linked list to array
     */
    public int[] toArray() {
        int size = 0;
        ListNode current = this;
        while (current != null) {
            size++;
            current = current.next;
        }
        int[] result = new int[size];
        current = this;
        int index = 0;
        while (current != null) {
            result[index++] = current.val;
            current = current.next;
        }
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        ListNode current = this;
        while (current != null) {
            sb.append(current.val);
            if (current.next != null) sb.append(" -> ");
            current = current.next;
        }
        return sb.toString();
    }
}
