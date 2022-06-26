package PracLinkedlist;

public class pracll {
    public static Node head;
    class Node {
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
        Node(int data,Node next){
            this.data=data;
            this.next=next;
        }
    }
        public int getSize(Node head){
            Node temp =head;
            int count=0;
            while(temp!=null){
                count++;
                temp=temp.next;
            }
            return count;
        }
        public  void insertfirst(int data){
            Node newnode = new Node(data);
            if(head==null){
                head=newnode;
                return;
            }
            newnode.next=head;
            head=newnode;
        }
        public void insertlast(int data){
            Node newnode = new Node(data);
            if(head==null){
                head=newnode;
            }
            Node temp = head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newnode;
        }
        public int  deletefirst(){
            if(head==null){
                System.out.println("list is empty");
            }
            head=head.next;
            return head.data;
        }
        public int deletelast(){
            Node first=head;
            Node second = head.next;
            while(second.next!=null){
                first=first.next;
                second=second.next;
            }
            first.next=null;
            return second.data;
        }
        public void insertAt(int data,int index){
            if(index==0){
                insertfirst(data);
            }
            if(index==getSize(head)-1){
                insertlast(data);
            }
            Node temp=head;
            for (int i = 1; i <index ; i++) {
               temp=temp.next;
            }
            Node newnode = new Node(data,temp.next);
            temp.next=newnode;
        }
        public int deleteAt(int index){
            if(index==0){
                deletefirst();
            }
            if(index==getSize(head)-1){
                deletelast();
            }
            Node temp =head;
            for (int i = 1; i <index ; i++) {
                temp=temp.next;
            }
            temp.next=temp.next.next;
            return temp.next.data;
        }
        public void display(){
        Node temp =head;
            while(temp!=null){
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
            System.out.println("null");
        }

    public static void main(String[] args) {
            pracll l =new pracll();
            l.insertfirst(10);
            l.insertfirst(20);
            l.insertfirst(30);
            l.insertfirst(40);
            l.insertfirst(50);
            l.display();
            l.insertAt(23,3);
            l.deleteAt(3);
            l.display();
    }
}
