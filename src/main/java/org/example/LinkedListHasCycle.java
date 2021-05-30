package org.example;

import org.example.model.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class LinkedListHasCycle {

    public boolean hasCycle(ListNode head) {
        boolean hasCycle = false;
        if (head.next == null) {
            return false;
        }
        Set<ListNode> nodes = new HashSet<>();
        while (null != head.next) {
            if(!nodes.contains(head.next)){
                nodes.add(head);
            }else{
                hasCycle=true;
            }
            head = head.next;
        }
        return hasCycle;
    }

}
