package recursion;

public class sumofdigits {
    public static void main(String[] args) {
        int ans = sumofdigits(12345);
        System.out.println(ans);
    }
    static int sumofdigits(int n){
        if(n==0){
            return 0;
        }
        return sumofdigits(n/10)+(n%10);
    }
}
