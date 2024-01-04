package LinkList;

public class CircularLinkedList {
    public int length;
    public LLNode tail;
    public CircularLinkedList(){length = 0;}
    //get tail
    public LLNode getTail(){return tail;}
    //Insert at peek
    public synchronized void insertATPeek(LLNode node){
        if (tail == null){
            tail=node;
            tail.setNext(tail);
            System.out.println("Node inserted at peek = "+tail.getData());
        }
        else{
            LLNode temp = tail.getNext();
            node.setNext(temp);
            tail.setNext(node);
            System.out.println("Node inserted at peek = "+tail.getData());
        }
        length++;
    }

    //Insert node at end
    public synchronized void insertAtEnd(LLNode node){
        if (tail==null){
            tail=node;
            tail.setNext(tail);
            System.out.println("Node inserted at end = "+tail.getData());
        }
        else{
            LLNode temp = tail.getNext();
            LLNode temp2 = tail.getNext();
            for (int i=1; i<length;i++){
                temp=temp.getNext();
            }
            tail.setNext(node);
            tail=node;
            tail.setNext(temp2);
            System.out.println("Node Inserted at end = "+tail.getData());
        }
        length++;
    }

    //Insert at position
    public synchronized void insertAtPosition(int data,int position){

        if (position < 0 ){position = 0;}
        if (position >= length){position = length;}
        if (tail == null){
            LLNode newNode = new LLNode(data);
            tail=newNode;
            tail.setNext(tail);
            length++;
        }
        else if (position == 0){
            LLNode newNode = new LLNode(data);
            insertATPeek(newNode);
        }
        else{
            LLNode temp = tail.getNext();
            for (int i=1;i < position;i++){
                temp=temp.getNext();
            }
            LLNode newNode = new LLNode(data);
            newNode.setNext(temp.getNext());
            temp.setNext(newNode);
            if (temp==tail){
                tail=newNode;
            }
            length++;
        }
    }

    //Remove from End
    public synchronized void removeFromEnd(){
        if (tail == null){return;}
        else{
            LLNode temp = tail;
            for(int i=1;i<length;i++){
                temp=temp.getNext();
            }
            LLNode firstNode = tail.getNext();
            temp.setNext(firstNode);
            tail=temp;
        }
        length--;
    }

    //Remove from peek
    public synchronized void removeFromPeek(){
        if (tail == null){return;}
        else{
            //LLNode temp = tail;
            LLNode second=tail.getNext().getNext();
            tail.setNext(second);
        }
        length--;
    }

    //Remove from position
    public synchronized void removeMatched(int data){
        if (tail.getData() == data){removeFromEnd();}
        else{
            LLNode temp = tail;
            LLNode firstNode = tail.getNext();
            for(int i=0;i<length-1;i++){
                if(firstNode.getData() == data ){
                    temp.setNext(firstNode.getNext());
                    length--;
                    return;
                }
                firstNode=firstNode.getNext();
                temp=temp.getNext();
            }
        }
    }

    //Represent collection in String
    public String toString(){
        String result = "[";
        if (tail == null){
            return result+"]";
        }
        result = result+tail.getNext().getData();
        LLNode temp = tail.getNext();
        while (temp != tail){
            result=result+","+temp.getNext().getData();
            temp=temp.getNext();
        }
        return result+"]";
    }
}