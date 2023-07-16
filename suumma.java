import java.util.Arrays;
import java.util.Scanner;

public class suumma
{
   public void add(){
    int a=2,b=3;
    a+=b;
    System.out.println("the add is : "+a);
   } 
   public void sub(){
    int a=4,b=3;
    a-=b;
    System.out.println("the sub is : "+a);
   }
   public void multiply(){
    int a=4,b=3;
    a*=b;
    System.out.println("the multiply is : "+a);
   }
   public void divide(){
    int a=4,b=3;
    a/=b;
    System.out.println("the divide is : "+a);
   }
}

/*  Scanner sc=new Scanner(System.in);
        System.out.print("enter the num : ");
        int n=sc.nextInt();
        String s="1";
        String s1="";
        char c[]=new char[s.length()];
        int count[]=new int[s.length()];
        int i,j,k=0,x=1;
        while(x<=n){
            k=0;
            i=0;
            j=0;
        for(i=0;i<s.length();i++){
            for(j=0;j<k;j++){
                if(s.charAt(i)==c[j]){
                    count[j]++;
                    break;
                }
            }
            if(j==k){
                System.out.println(k+""+i+""+j);
                c[k]=s.charAt(i);
                count[k]=1;
                k++;
            }            
        }
        for(int p=0;p<k;p++){
           // System.out.println(c[p]+""+count[p]);
         //  System.out.println(s.toString());
            s1=s1+c[p];
            s1=s1+count[p];
            s=s1;
        }
        x++;
    }      */ 