import java.util.Scanner;

public class numbersadd{
    public static void main(String[] args){
        int a[]={1,5,7,3,2};
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number : ");
        int num=sc.nextInt();
        int i,j,k;
        for(i=0;i<a.length;i++){
            for(j=i+1;j<a.length;j++){
                for(k=j+1;k<a.length;k++)
                if(a[i]==num){
                    System.out.print("("+a[i]+")");
                    break;
                }
            else if(a[i]+a[j]==num){
                System.out.print("("+a[i]+", "+a[j]+")");
            }
            else if(a[i]+a[j]+a[k]==num){
                System.out.print("("+a[i]+", "+a[j]+", "+a[k]+")");
            }
        }
        }
    }
}