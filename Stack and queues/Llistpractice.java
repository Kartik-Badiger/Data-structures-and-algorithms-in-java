package kartik;

public class Llistpractice {
    private node head;
    private int size;
    public Llistpractice(){
        this.size=size;
    }

    class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            size++;
        }
        node(int data,node next){
            this.data=data;
            this.next=next;
            size++;
        }
    }
    public void insertfirsst(int data){
        node newnode = new node(data);
        if(head==null){
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
    public void insertlast(int data){
        node newnode = new node(data);
        node temp=head;
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
    }
    public void displaylist(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }

        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public int deletefirst(){
        if(head==null){
            System.out.println("list is empty");
        }
        size--;
        head=head.next;
        return head.data;
    }
    public int deletelast(){
        if(head==null){
            System.out.println("list is empty");
        }
        size--;
        if(head.next==null){
            head=null;
        }
        node last=head.next;
        node secondlast =head;
        while(last.next!=null){
            last=last.next;
            secondlast=secondlast.next;
        }
        secondlast.next=null;
        return last.data;
    }
    public int delete(int data,int index){
        if(index==0){
            return deletefirst();
        }
        if(index==size-1){
            return deletelast();
        }
        node temp =head;
        for(int i =0;i<index;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        size--;
        return temp.data;
    }
    public void insert(int data, int index){
        if(index==0){
             insertfirsst(data);
             return;
        }
        if(index==size-1){
            insertlast(data);
            return;
        }
        node temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        node newnode = new node(data,temp.next);
        temp.next=newnode;
    }
    public static void main(String[] args) {
        ll list = new ll();
        list.insertfirst(50);
        list.insertfirst(40);
        list.insertfirst(30);
        list.insertfirst(20);
        list.insertfirst(10);
        list.insertatindex(34,5);
        list.insertatindex(24,4);
        list.displaylist();

    }
}
