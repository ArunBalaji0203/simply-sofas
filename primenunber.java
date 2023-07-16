import java.util.Scanner;

public class primenunber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number starting number : ");
        int st=sc.nextInt();
        System.out.print("enter the ending number : ");
        int en=sc.nextInt();
        int i,j,count=0;
        System.out.print("the prime numbers range from "+st+" to "+en+" is : ");
        int c=0,z=0;
        for(i=en;i>=st;i--){
            count=0;
            for(j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
                c++;
                if(c<=3){
                    z=i;
                     System.out.print(z+" ");
                }
               
               // System.out.print(i+" ");
            }
        }
        
    }
}