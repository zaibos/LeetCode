package LinkList;

public class MiddleNodeOfLinkedList {
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

        LLNode head = singleLL.head;
        LLNode tail = singleLL.head;
        while(tail.next != null && tail.next.next != null){
            head = head.next;
            tail = tail.next.next;
        }

        System.out.println("middle element -> "+head.getData());
    }
}
