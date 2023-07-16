import java.util.Arrays;

public class summam{
    public static void main(String[] args){
        int i,j,tmp=0,tmp1=0;
         int a[]={1,2,3,4,5};
         for(i=0;i<4;i++){
            tmp=a[i];
            a[i]=a[a.length-1];
            a[a.length-1]=tmp;
            System.out.println(Arrays.toString(a));

        }
    }
}