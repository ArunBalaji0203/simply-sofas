import java.util.Arrays;

public class oddposinasc{
    public static void main(String[] args){
        int a[]={1,5,3,2,7,8};
        int b[]=new int[a.length];
        int c[]=new int[a.length];
        int k=0;
        for(int i=0;i<a.length;i++){
            if(i%2!=0){
                b[k]=a[i];
                k++;

            }
        }
        k=0;
        for(int i=0;i<a.length;i++){
            if(i%2==0){
                c[k]=a[i];
                k++;
            }
        }
        Arrays.sort(b);
        int tmp=0;
        for(int i=0;i<c.length;i++){
            for(int j=i+1;j<c.length;j++){
                if((c[i]<c[j])){
                    tmp=c[i];
                    c[i]=c[j];
                    c[j]=tmp;
                }
            }
        }
        for(int i=0;i<b.length;i++){
            if(c[i]!=0){
                System.out.print(c[i]+" ");
            }
            if(b[i]!=0){
                System.out.print(b[i]+" ");
            }
        }
    }
}