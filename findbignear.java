public class findbignear{
    public static void main(String[] args){
        int a[]={5,6,9,3,2};
        int len=a.length;
        for(int i=0;i<a.length;i++){
            findnextgreater(i,len,a);
        }
    }

    private static void findnextgreater(int i, int len, int[] a) {
        int min=a[i];
        for(int j=i+1;j<len;j++){
            if(a[i]<=a[j]){
                if(a[i]!=min){
                if(min>a[j]){
                    min=a[j];
                }
                }else{
                    min=a[j];
                }
            }
        }
        System.out.print(min+" ");
    }
}