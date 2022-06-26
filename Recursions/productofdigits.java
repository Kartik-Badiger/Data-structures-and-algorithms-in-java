package recursion;

public class productofdigits {
    public static void main(String[] args) {
        int ans = proc(532);
        System.out.println(ans);
    }

    static int proc(int n){
        if(n%10==n){
            return n;
        }
        return n%10 *proc(n/10);
    }
}
