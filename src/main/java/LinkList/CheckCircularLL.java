package LinkList;

public class CheckCircularLL {
    LLNode head;
    Object CLLNode;
    public CheckCircularLL(CircularLinkedList CLLNode, LLNode head) {
        this.CLLNode=CLLNode;
        this.head=head;
    }
    public Boolean DetectLoop(){
        System.out.println("cllnode -> "+CLLNode.toString());
        LLNode slow=head; LLNode fast=head;
        while(slow !=null && fast !=null && fast.getNext() != null){
            slow=slow.getNext(); fast=fast.getNext().getNext();
            if (slow == fast){
                System.out.println("Loop Detected");
                return Boolean.TRUE;
            }
        }
        System.out.println("Loop Not Detected");
        return Boolean.FALSE;
    }
    public static void main(String[] args) {
        LLNode node1 = new LLNode(1);
        LLNode node2 = new LLNode(2);
        LLNode node3 = new LLNode(3);
        LLNode node4 = new LLNode(4);
        CircularLinkedList CLLNode = new CircularLinkedList();
        CLLNode.insertATPeek(node1);
        CLLNode.insertAtEnd(node2);
        CLLNode.insertATPeek(node3);
        CLLNode.insertAtEnd(node4);
        CheckCircularLL obj = new CheckCircularLL(CLLNode,CLLNode.getTail());
        System.out.println("It is circular LL Node = "+obj.DetectLoop());
    }
}
