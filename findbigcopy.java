import java.util.Arrays;
public class findbigcopy{
    public static void main(String[] args){
        int a[]={1,5,3,2,7,8};
        int len=a.length;
        int max=0;
        for(int i=0;i<a.length;i++){
            findnextgreater(i,len,a,max);
          
        }
    }

    private static void findnextgreater(int i, int len, int[] a, int max) {
        //int min=100000;
         if(max<a[i]){
                max=a[i];
            }
            if(a[i]<len){
            for(int j=i+1;j<len;j++){
           System.out.println("j id"+j);
            if(a[i]<a[j]){
                if(max>a[j]){
                    max=a[j];
                    //System.out.println(min);
                }
            }
        }
            }
       System.out.print(max+" ");
    }
}