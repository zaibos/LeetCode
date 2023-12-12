package LinkList;

class LLNode{
    int data;
    LLNode next;
}
public class CheckPalindrome {

    public LLNode swapLLNode(LLNode head){
        LLNode curr = head;
        LLNode prev = null;
        while(curr != null){
            LLNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

    public boolean checkPalindrome(LLNode head){
        LLNode slow = head;
        LLNode fast = head;
        LLNode entry = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = swapLLNode(slow.next);
        slow = slow.next;

        while(slow!=null){
            if(entry.data != slow.data){
                return false;
            }
            entry = entry.next;
            slow = slow.next;
        }
        return true;
    }
}
