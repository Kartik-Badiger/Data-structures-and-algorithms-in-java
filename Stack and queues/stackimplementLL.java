package stack;

public class stackimplementLL {
    public static Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }
   static class stack {
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
           int top = head.data;
           head=head.next;
           return top;
       }
       public static int peek(){
           if(isEmpty()){
               return -1;
           }
           return head.data;
       }

       private static boolean isEmpty() {
           return head==null;
       }
   }

    public static void main(String[] args) {
       // stackimplementLL st = new stackimplementLL();
        stack st = new stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        while (!st.isEmpty()) {
            System.out.println(st.peek());
            st.pop();
        }
//
    }
}
