package org.example;

import org.example.model.ListNode;

class SwapLinkedList {

    public static ListNode swapPairs(ListNode head) {
        ListNode tempHead=null;
        ListNode nextPairsHead=null;
        if(head !=null || head.next!=null) {
            tempHead = head;
            head = head.next;
            nextPairsHead = head.next;
            head.next = nextPairsHead;
        }
        nextPairsHead.next = nextPairsHead;
        if(nextPairsHead !=null && nextPairsHead.next !=null){
            nextPairsHead.next=nextPairsHead.next;
        }
        swapPairs(nextPairsHead);
        return head;
    }

    public static void main(String[] args) {
        ListNode node1= new ListNode(1);
        ListNode node2= new ListNode(2);
        ListNode node3= new ListNode(3);
        ListNode node4= new ListNode(4);

        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        ListNode head = swapPairs(node1);
        System.out.println(head.val);
    }

}