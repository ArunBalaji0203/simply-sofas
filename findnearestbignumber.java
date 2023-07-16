import java.util.Arrays;

public class findnearestbignumber{
    public static void main(String[] arg){
         int a[]={1,5,3,2,7,8};
         int b[]=new int[a.length];
         int s=0,tmp=0;
        // System.out.print(a[0]+" ");
         for(int i=0;i<a.length;i++){
            s=0;
            for(int j=i+1;j<a.length;j++){
                if(a[i]<a[j]){
                    b[s]=a[j];
                    s++;
                }
            }
            for(int k=0;k<s;k++){
                for(int l=k+1;l<s;l++){
                    if(b[k]>b[l]){
                        tmp=b[k];
                        b[k]=b[l];
                        b[l]=tmp;
                    }
                }
            }
             System.out.print(b[0]+" ");
        }
         
    }
}