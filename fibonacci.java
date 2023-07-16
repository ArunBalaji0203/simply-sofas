public class fibonacci{
    public static void main(String[] args){
        int f=0,s=1,t=0,i;
        for(i=0;i<10;i++){
            System.out.print(f+" ");
            t=f+s;
            f=s;
            s=t;
        }
    }
}