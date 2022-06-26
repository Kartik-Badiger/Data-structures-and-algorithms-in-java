package kartik2;

public  class stackclass {
   // private static boolean head;
    public static Node head;
    static class Node{
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
    public static boolean isEmpty(){
        return head==null;
    }
    public static void push(int data){
        Node newnode = new Node(data);
        if(isEmpty()){
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
    public static int pop(){
        if(isEmpty()){
            return -1;
        }
        int top=head.data;
        head=head.next;
        return top;
    }
    public static int peek(){
        if(isEmpty()){
            return -1;
        }
        int top = head.data;
        return head.data;
    }
    public static void main(String[] args) {
        stackclass st = new stackclass();
        stackclass.push(10);
        stackclass.push(20);
        stackclass.push(30);
        stackclass.push(40);
        while (!st.isEmpty()){
            System.out.println(stackclass.peek());
            stackclass.pop();
        }
    }
}
