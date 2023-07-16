import java.net.SocketTimeoutException;

public class summa1{
    public static void main(String[] args){
        int n1,n=3,n2,i,j,strt=1,k=0,s=0;
        n1=n*2-1;
        n2=n1*n1;
        int a[]=new int[n2];
        while(n>=1){
            for(i=strt;i<=n1;i++){
                for(j=strt;j<=n1;j++){
                    if(i==strt||j==strt||i==n1||j==n1){
                         System.out.print(n);
                 }
                 else{
                    System.out.print("");
                 }
            }
            //System.out.print();
            } 
            strt++;
            n1--;
            n--;
        }
    }
}
/*//for (i = 1; i <= 5; i++) {
            if(count==0){
                break;
            }
            z = -1;
            q = 0;
            p=0;
            for (j = 0; j <= count; j++) {
                if (q >= s.length()) {
                    
                    z+=1;
                    if(z>=s.length()){
                        z=0;
                    }
                    p = z;
                }
                if (j == count) {
                    s = s.substring(p + 1, s.length()) + s.substring(0, p);
                    // System.out.print(s.substring(0,count));
                  //  System.out.println(s.toString());

                }
                
                p++;
                
                q++;
            }
        }*/
       // System.out.println(s.toString());