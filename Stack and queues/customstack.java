package kartik;

public class customstack {
    protected int[] data;
    private static final int default_size=10;
    int ptr=-1;
    public customstack(){
        this(default_size);
    }

    public customstack(int size) {
        this.data = new int[size];
    }

    public boolean push(int item){
        if(isFull()){
            System.out.println("stack is full");
            return false;
        }
        ptr++;
        data[ptr]=item;
        return true;
    }
    public int pop() throws Exception {
        if(isEmpty()){
            throw new Exception("coonot pop from an empty stack");
        }
        int reomoved=data[ptr];
        ptr--;
        return data[ptr--];
    }
    public int peek() throws Exception {
        if(isEmpty()){
            throw new Exception("coonot peek from an empty stack");
        }
        return data[ptr];
    }
    private boolean isFull(){
        return ptr==data.length-1;
    }
    private boolean isEmpty(){
        return ptr==-1;
    }

    public static void main(String[] args) throws Exception {
        customstack cs = new customstack(6);
        cs.push(10);
        cs.push(20);
        cs.push(30);
        cs.push(40);
        cs.push(50);
        cs.push(60);
        System.out.println(cs.pop());

    }
}