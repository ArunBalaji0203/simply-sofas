public class findhowmanytym{
    public static void main(String[] args){
        int a[]={0,1,2,2,3,4,5,5,7};
        int count;
        System.out.println("values count");
        for(int i=0;i<a.length;i++){
            count=1;
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    count++;
                    a[j]=-1;
                }
            }
            if(a[i]!=-1)
            System.out.println(a[i]+"-"+count);
        }
    }
}