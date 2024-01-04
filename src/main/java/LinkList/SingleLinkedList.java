package LinkList;

public class SingleLinkedList {
    private int length = 0;
    public LLNode head;
    public SingleLinkedList(){
        length = 0;
    }
    //Insert Node at Beginning
    public synchronized void insertAtBegin(LLNode node){
        node.setNext(head);
        head = node;
        length ++;
    }

    //Get first node of the link
    public synchronized LLNode getHead(){
        return head;
    }

    //Insert Node at the End
    public synchronized void insertAtEnd(LLNode node){
        if ( head == null ){
            head = node;
        }
        else{
            LLNode temp=head;
            for ( int i =1; i < length;i++){
                temp=temp.getNext();
            }
            temp.setNext(node);
            node.setNext(null);
        }
        length++;
    }

    public String toString(){
        String result = "[";
        if (head == null){
            return result+"]";
        }
        result = result+head.getData();
        LLNode temp = head.getNext();
        while (temp != null){
            result=result+","+temp.getData();
            temp=temp.getNext();
        }
        return result+"]";
    }
}
