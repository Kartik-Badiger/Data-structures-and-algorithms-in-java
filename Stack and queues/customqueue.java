package kartik;

public class customqueue {
    private int[] data;
    private static final int default_size=10;
    int end=0;
    public customqueue(){
        this(default_size);
    }
    public customqueue(int size){
        this.data= new int[size];
    }

    public boolean isFull(){
        return end==data.length;
    }
    public boolean isEmpty(){
        return end==0;
    }
    public boolean insert(int item){
        if(isFull()){
            return false;
        }
        data[end]=item;
        end++;
        return true;
    }
    public int remove()throws Exception{
        if(isEmpty()){
            throw new Exception("queue is empty");
        }
        int removed = data[0];
        for(int i=1;i<end;i++){
            data[i-1]=data[i];
        }
        end--;
        return removed;
    }
    public int front()throws Exception{
        if(isEmpty()){
            throw new Exception("queue is empty");
        }
        return data[0];
    }
    public void display(){
        for(int i=0;i< data.length;i++){
            System.out.print(data[i]+" <-");
        }
        System.out.println("end");
    }
    public static void main(String[] args) throws Exception {
        customqueue cq = new customqueue(5);
        cq.insert(10);
        cq.insert(20);
        cq.insert(30);
        cq.insert(40);
        cq.insert(50);
        cq.display();
        cq.remove();
        cq.remove();
        cq.remove();
        cq.display();
    }
}