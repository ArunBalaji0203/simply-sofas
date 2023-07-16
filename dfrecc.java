public class dfrecc{
    public static void main(String[] args){
        int num=153,div=1000;
        int g = gcd(num,div);
        System.out.println(num/g+" "+div/g);
    }

    private static int gcd(int num, int div) {
        if(num%div==0)
        return div;
        return gcd(div,num%div);
    }
}