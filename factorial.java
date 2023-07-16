import java.util.Scanner;

public class factorial{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number : ");
        int n=sc.nextInt();
        int i,num=1;
        for(i=1;i<=n;i++){
            num=num*i;
        }
        System.out.println("The factorial of the given number is : "+num);
    }
}