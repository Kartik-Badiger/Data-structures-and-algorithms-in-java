package kartik;

public class DLL {
    node head;
    private int size;
    class node{
        int data;
        node next;
        node prev;
        public node(int data) {
            this.data = data;
            size++;
        }
        public node(int data, node next) {
            this.data = data;
            this.next = next;
            size++;
        }
        public node(int data, node next, node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
            size++;
        }
    }
    public void addfirst(int data){
        node newnode = new node(data);
        if(head==null){
            head=newnode;
            return;
        }
        newnode.prev=null;
        newnode.next=head;
        head.prev=newnode;
        head=newnode;
    }
    public void addlast(int data){
        node newnode = new node(data);
        if(head==null){
            newnode.prev=null;
            head=newnode;
            return;
        }
        node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        newnode.next=null;
        temp.next=newnode;
        newnode.prev=temp;
    }
    public void display(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        node temp = head;
        node last = null;
        System.out.print("null<->");
        while(temp!=null){
            last=temp;
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("null");
        System.out.println("print in reverse");
        while(last!=null){
            System.out.print(last.data+"->");
            last=last.prev;
        }
        System.out.println("start");
    }
    public int deletefirst(){
        if(head==null){
            System.out.println("list is empty");
        }
        head=head.next;
        size--;
        return head.data;
    }
    public int deletelast(){
        node last=head.next;
        node secondlast=head;
        while(last.next!=null){
            last=last.next;
            secondlast=secondlast.next;
        }
        secondlast.next=null;
        size--;
        return last.data;
    }
    public int delete(int index){
        if(index==0){
            return deletefirst();
        }
        if(index==size-1){
            return deletelast();
        }
        node temp = head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        temp.next.next.prev=temp;
        return temp.data;
    }
    public static void main(String[] args) {
        DLL list = new DLL();
       list.addfirst(10);
       list.addfirst(20);
       list.addlast(30);
       list.addlast(40);
       list.addlast(50);
       list.addlast(70);
       list.display();



    }
}
