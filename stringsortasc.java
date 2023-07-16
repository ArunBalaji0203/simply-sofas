import java.util.Arrays;

public class stringsortasc{
    public static void main(String[] args){
        int a[]={1,5,3,2,7,8};
        int tmp=0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(isascending(a[i],a[j])){
                    tmp=a[i];
                    a[i]=a[j];
                    a[j]=tmp;
                }
            }
        }
        System.out.println("in descending order : "+Arrays.toString(a));
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(isdesending(a[i],a[j])){
                    tmp=a[i];
                    a[i]=a[j];
                    a[j]=tmp;
                }
            }
        }
        System.out.println("in ascen: "+Arrays.toString(a));
    }
    private static boolean isascending(int a,int b) {
        return a<b;
    }
    private static boolean isdesending(int a,int b) {
        return a>b;
        
    }
}