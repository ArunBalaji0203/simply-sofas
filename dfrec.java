public class dfrec{
    public static void main(String[] args){
        String s2="200";
        int div=1;
       int result= repeat(s2.length(),div);
        System.out.print(result);
    }

    private static int repeat(int length,int div) {
        if(length==0){
            return div;
        }
        div=div*10;
        return repeat(--length,div);
    }
}