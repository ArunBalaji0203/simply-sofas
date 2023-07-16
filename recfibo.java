public class recfibo{
    public static void main(String[] args){
        int n=7;
        System.out.println(fib(n)); 
    }

    private static int fib(int n) {
        if(n==1)
        return 0;
        if(n==2)
        return 1;
        int result =  fib(n-1)+fib(n-2);
        return result;
    }
}