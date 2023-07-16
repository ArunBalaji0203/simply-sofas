public class findleastdifference{
    public static void main(String[] args){
        int a[]={4,3,7,15,23};
        int i1=0,mindiff=a[0],diff=0,start=0,end=0;
        for(int i=0;i<a.length;i++){
            i1=i+1;
            //comparing and finding differences
            if(i1<a.length){
                if(a[i]<=a[i1]){
                    diff=a[i1]-a[i];
            }else{
                    diff=a[i]-a[i1];
                }
            }else{
                break;
            }
            //finding minimum difference and its combo's
            if(diff<=mindiff){
                mindiff=diff;
                start=a[i];end=a[i1];
            }
        }
        System.out.print("The least difference combo is : ["+start+", "+end+"]");
    }
}