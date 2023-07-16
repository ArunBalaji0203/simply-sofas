import java.util.Arrays;

public class oddposition{
    public static void main(String[] args){
        int a[]={1,5,3,2,7,8};
        System.out.print("odd position elements : ");
        for(int i=0;i<a.length;i++){
            if(i%2!=0){
           System.out.print(a[i]+" ");
            }
        }
        System.out.println();
        System.out.print("even position elements : ");
        for(int i=0;i<a.length;i++){
            if(i%2==0){
           System.out.print(a[i]+" ");
            }
        }
    }
}