public class subarray{
    public static void main(String[] args){
        int a[]={1,3,-1,-4,4},max=0,count;
        String s="",s1="";
        for(int k=0;k<a.length;k++){
            for(int i=k;i<a.length;i++){
                count=0;
                s="";
                for(int j=k;j<=i;j++){
                    count=count+a[j];
                    s=s+a[j]; 
                }
                if(max<count){
                    max=count;
                    s1=s;
                    }
            }
        }System.out.println("The maximum subarray is : "+s1);
    }
}