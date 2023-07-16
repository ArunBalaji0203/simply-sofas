public class repeatfun{
    public static void main(String[] args){
        int n=5;
        System.out.print(recursive(n));
    }
    private static int recursive(int n) {
        if(n>1)
         return n*recursive(n-1);
        return 1;
       
    }
    // 54321
}