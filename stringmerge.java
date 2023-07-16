import java.util.Arrays;

public class stringmerge{
    public static void main(String[] args){
        int a[]={1,3,5};
        int k=a.length;
        int b[]={1,3,6,8,9};
        int c[]=new int[a.length+b.length];
        int count=0;
        for(int i=0;i<a.length;i++){
            c[i]=a[i];
        }
        for(int i=0;i<b.length;i++){
            c[k]=b[i];
            k++;
        }
        for(int i=0;i<c.length;i++){
            count=0;
            for(int j=i+1;j<c.length;j++){
                if(c[i]==c[j]){
                    count++;
                }
                }
                if(count==0){
                    System.out.print(c[i]+" ");
                
                 }
        }
    }
}