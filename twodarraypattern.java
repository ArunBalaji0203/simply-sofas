public class twodarraypattern{
    public static void main(String[] args){
        int end,sise,n=3,start=0,i,j;
        sise=n*2-1;
        end=sise-1;
        int a[][]=new int[sise][sise];
        while(n!=0){
         for(i=start;i<=end;i++){
            for(j=start;j<=end;j++){
                if(i==start||i==end||j==start||j==end){
                    a[i][j]=n;
                }
            }
        }start++;
        end--;
        n--;
    }
        for(i=0;i<sise;i++){
            for(j=0;j<sise;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}