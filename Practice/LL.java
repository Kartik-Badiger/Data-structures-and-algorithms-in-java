package practice;

public class LL {
    node head;
    static int size;
    LL(){
        this.size=size;
    }
    class node{
        int value;
        node next;
        node(int value){
            this.value=value;
            size++;
        }
        node(int value,node next){
            this.value=value;
            this.next=next;
            size++;
        }
    }
    public void insertfirst(int value){
        node newnode = new node(value);
        if(head==null){
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
    public void insertlast(int value){
        node newnode= new node(value);
        node temp=head;
        if(head==null){
            head=newnode;
        }
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
    }
    public void insetAtindex(int value,int index){
        if(index==0) {
            insertfirst(value);
            return;
        }
        if(index==size){
            insertlast(value);
            return;
        }
        node temp=head;
        for(int i =1;i<index;i++){
            temp=temp.next;
        }
        node newnode = new node(value,temp.next);
        temp.next=newnode;
       // newnode.next=temp.next.next;
    }
    public int deletefirst(){
        if(head==null){
            System.out.println("list is empty");
        }
        head=head.next;
        size--;
        return head.value;
    }
    public int deletelast(){
        if(head==null){
            System.out.println("list is empty");
        }
        if(head.next==null){
            head=null;
        }
        node last=head.next;
        node secondlast=head;
        while(last.next!=null){
            last=last.next;
            secondlast=secondlast.next;
        }
        secondlast.next=null;
        size--;
        return last.value;
    }
    public  int delete(int index){
        if(index==0){
          return  deletefirst();
        }
        if(index==size-1){
            return deletelast();
        }
        node temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        size--;
        return temp.next.value;
    }
    public int find(int value){
        node temp=head;
        while (temp!=null){
            if(temp.value==value){
                return 1;
            }
           temp=temp.next;
        }
        return -1;
    }
    public void display(){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        LL list = new LL();
        list.insertfirst(10);
        list.insertfirst(20);
        list.insertfirst(30);
        list.insertfirst(40);
        list.insertfirst(50);
        list.insertlast(5);
        list.display();
        list.delete(4);
        list.display();
        list.insetAtindex(80,2);
        list.display();
        System.out.println(list.size);
        System.out.println(list.find(30));
    }
}
