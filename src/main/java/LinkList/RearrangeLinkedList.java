package LinkList;

public class RearrangeLinkedList {
    public static void main(String[] args) {
        SingleLinkedList singleLL = new SingleLinkedList();
        LLNode node1 = new LLNode(1);
        LLNode node2 = new LLNode(2);
        LLNode node3 = new LLNode(3);
        LLNode node4 = new LLNode(4);
        LLNode node5 = new LLNode(5);
        singleLL.insertAtBegin(node1);
        singleLL.insertAtEnd(node2);
        singleLL.insertAtEnd(node3);
        singleLL.insertAtEnd(node4);
        singleLL.insertAtEnd(node5);
        System.out.println("single linked list -> "+singleLL.toString());

        LLNode slow = singleLL.head;
        LLNode fast = singleLL.head;
        LLNode entry = singleLL.head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        LLNode prev = null;
        LLNode curr = slow.next;
        while(curr != null){
            LLNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        SingleLinkedList rearrange = new SingleLinkedList();
        rearrange.insertAtEnd(new LLNode(entry.data));
        while(prev != null){
            System.out.println("Entry = "+entry.getData());
            LLNode tempFor = null;
            LLNode tempPrev = null;
            tempFor = entry.next;
            tempPrev = prev.next;

            entry.next = prev;
            LLNode tempNode0 = new LLNode(prev.data);
            rearrange.insertAtEnd(tempNode0);

            prev.next = tempFor;
            LLNode tempNode1 = new LLNode(tempFor.data);
            rearrange.insertAtEnd(tempNode1);

            entry = tempFor;
            prev = tempPrev;
        }

        System.out.println("Rearrange linked list = "+rearrange.toString());

    }
}
