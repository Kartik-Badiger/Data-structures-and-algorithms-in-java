package algorithms;

public class pracll {
    node head;
    int size;
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
    void insertfirst(int data){
        node newnode = new node(data);
        if(head==null){
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }

    void display(){
        node temp =head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }


    public static void main(String[] args) {
        pracll list = new pracll();
        list.insertfirst(10);
        list.insertfirst(20);

        list.display();
    }

}
