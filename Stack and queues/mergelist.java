package kartik;

class Solution {
    static ListNode head;
    static int size;
    static class ListNode{
        int val;
        ListNode next;
        public ListNode(int val, ListNode next){
            this.val=val;
            this.next=next;
            size++;
        }
        public ListNode (int val){
            this.val=val;
            size++;
        }

        public ListNode() {

        }
    }
    public ListNode sortList(ListNode head) {
        if(head==null&&head.next==null){
            return head;
        }
        ListNode slow=head;
        ListNode fast=head;
        ListNode temp=head;
        while(fast!=null&&fast.next!=null){
            temp=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        temp.next=null;
        ListNode left=sortList(head);
        ListNode right=sortList(slow);
        return merge(left,right);
    }
    public static void displaylist(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        ListNode temp=head;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.println("end");
    }
    public static void insertatindex(int data,int index){
        if(index==0){
            insertfirst(data);
            return;
        }
        if(index==size){
            insertlast(data);
            return;
        }
        ListNode temp = head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        ListNode newnode = new ListNode(data,temp.next);
        temp.next=newnode;
        newnode.next=temp.next.next;
    }
    public static void insertfirst(int val){
        ListNode newnode = new ListNode(val);
        if(head==null){
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
    public static void insertlast(int val){
        ListNode newnode = new ListNode(val);
        if(head==null){
            head=newnode;
        }
        ListNode currnode=head;
        while(currnode.next!=null){
            currnode=currnode.next;
        }
        currnode.next=newnode;
    }
    public static ListNode merge(ListNode first, ListNode second){
        ListNode merged = new ListNode(0);
        ListNode curr =merged;
        while(first!=null&&second!=null){
            if(first.val<second.val){
                curr.next=first;
                first=first.next;
            }
            else{
                curr.next=second;
                second=second.next;
            }
            curr=curr.next;
        }
        while(first!=null){
            curr.next=first;
            first=first.next;
            curr=curr.next;
        }
        while(second!=null){
            curr.next=second;
            second=second.next;
            curr=curr.next;
        }
        return merged.next;
    }
    public static void main(String[] args) {
      ListNode list1 = new ListNode();

    }
}
