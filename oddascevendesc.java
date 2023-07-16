import java.util.Arrays;

public class oddascevendesc{
    public static void main(String[] args){
        int a[]={0,1,2,3,4,5};
        int tmp=0,i1=0,j1=0,tmp1=0;
        for(int i=0;i<a.length;i+=2){
            i1=i+1;
            for(int j=i+2;j<a.length;j+=2){
                j1=j+1;
                    if(a[i]<a[j]){
                        tmp=a[i];
                        a[i]=a[j];
                        a[j]=tmp;
                    }
                if(j1<a.length){
                    if(a[i1]>a[j1]){
                        tmp1=a[i1];
                        a[i1]=a[j1];
                        a[j1]=tmp1;
                    }
                }
            j1+=2;
            }
        i1+=2;
        }   
        System.out.println(Arrays.toString(a));
    }
}