package kartik;

public class dynamic_stack extends customstack{
   dynamic_stack(){
        super();
    }
    public dynamic_stack(int size){
        super(size);

    }
    private boolean isFull(){
        return ptr==data.length-1;
    }
    public boolean push(int item){
       if(this.isFull()){
           //double the array size
           int[] temp = new int[data.length*2];

           //copy all previous items in new data
            for (int  i =0; i<data.length;i++){
                temp[i]=data[i];

            }
            data=temp;

            //at this point we know that array is not full
           //insert item
       }
           return super.push(item);
    }
    public int pop() throws Exception {
        if(isEmpty()){
            throw new Exception("coonot pop from an empty stack");
        }
        int reomoved=data[ptr];
        ptr--;
        return data[ptr--];
    }
    private boolean isEmpty(){
        return ptr==-1;
    }

    public static void main(String[] args) throws Exception {
        customstack cs = new dynamic_stack();
        cs.push(10);
        cs.push(20);
        cs.push(30);
        cs.push(40);
        cs.push(50);
        cs.push(60);
        System.out.println(cs.pop());

    }
}
