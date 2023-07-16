public class findcopy{
    public static void main(String[] args){
        int a[]={1,5,3,2,7,8};
        int len=a.length;
        for(int i=0;i<a.length;i++){
            findnextgreater(i,len,a);
        }
    }

    private static void findnextgreater(int i, int len, int[] a) {
       
        int min=a[i];
        for(int j=i+1;j<len;j++){
            if(a[i]<a[j]){
                if(min!=a[i] && min>a[j]) {
                    min=a[j];
                    //System.out.println(min);
                }
            }
        }
        System.out.print(min+" ");
    }
}