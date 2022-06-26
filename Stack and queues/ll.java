package kartik;

/* code written by Kartik Badiger
SDMCET,Dharwad
@2sd19cs045
 */
public class ll{
    private node head;
    private int size;

    public ll() {
        this.size = size;
    }
    private class node{
        private int data;
        private node next;
        public node(int data) {
            this.data = data;
            size++;
        }
        public node(int data, node next) {
            this.data = data;
            this.next = next;
            size++;
        }
    }
    public void insertfirst(int data){
        node newnode = new  node(data);
        if(head==null){
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
    public void insertlast(int data){
        node newnode = new node(data);
        if(head==null){
            head=newnode;
        }
        node currnode=head;
        while(currnode.next!=null){
            currnode=currnode.next;
        }
        currnode.next=newnode;
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
        System.out.println("end");
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
        node secondlast = head;
        while (last.next!=null){
            last=last.next;
            secondlast=secondlast.next;
        }
        secondlast.next=null;
        return last.data;
    }
    public int deletefirst(){
        if(head==null){
            System.out.println("list is empty");
        }
        size--;
        head=head.next;
        return head.data;
    }
    public void insertatindex(int data,int index){
        if(index==0){
            insertfirst(data);
            return;
        }
        if(index==size-1){
            insertlast(data);
            return;
        }
        node temp = head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        node newnode = new node(data,temp.next);
        temp.next=newnode;
       // newnode.next=temp.next.next;
    }
    public int delete(int index) {
        if(index==0){
            return deletefirst();
        }
        if(index==size-1){
            return deletelast();
        }
        node newnode= head;
        for (int i = 1; i < index; i++) {
            newnode= newnode.next;
        }
        newnode.next = newnode.next.next;
        size--;
        return newnode.next.data;
    }
    public static void main(String[] args) {
        ll list = new ll();
        list.insertlast(10);
        list.insertlast(20);
        list.insertlast(30);
        list.insertlast(40);
        list.insertlast(50);
        list.displaylist();
    }
}


