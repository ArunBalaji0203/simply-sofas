import java.util.Arrays;
import java.util.Scanner;

public class zohotasks{
    public static void main(String[] args){
        zohotasks zt=new zohotasks();
       // zt.pattern1();
      //  zt.pattern2();
       // zt.sum();
       // zt.arithmetic();
        //zt.geometric();
      zt.pattern11();
      // zt.rotate();
    }

    private void rotate() {
         Scanner sc=new Scanner(System.in);
        System.out.print("enter the number : ");
        int n=sc.nextInt();
        int a[]={1,2,3,4,5};
        int i,j,tmp=0,tmp1=0;
        for(i=0;i<n;i++){
            tmp=a[i];
            a[i]=a[a.length-1];
            for(j=0;j<a.length;j++){
                tmp1=a[j];
                a[j]=tmp;
                tmp=tmp1;
            }
            System.out.println(Arrays.toString(a));
        }
    }

    private void pattern11() {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number : ");
        int n=sc.nextInt();
        int i,j,num2;
        for(i=1;i<=n;i++){
            num2=i;
            for(j=1;j<=i;j++){
                System.out.print(num2+" ");
                num2+=n-j;//5-1, 5-2, 5-3
            }
            System.out.println();
        }
    }

    private void geometric() {
         Scanner sc=new Scanner(System.in);
        System.out.print("enter the number : ");
        int n=sc.nextInt();
        System.out.print("enter the difference : ");
        int d=sc.nextInt();
        System.out.print("enter the starting value : ");
        int strt=sc.nextInt();
        int i,num=strt;
        System.out.print("G.P is : ");
        for(i=1;i<=n;i++){
            System.out.print(num+" ");
            num=num*d;
        }

    }

    private void arithmetic() {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number : ");
        int n=sc.nextInt();
        System.out.print("enter the difference : ");
        int d=sc.nextInt();
        System.out.print("enter the starting value : ");
        int strt=sc.nextInt();
        int i,num=strt;
        System.out.print("A.P is : ");
        for(i=1;i<=n;i++){
            System.out.print(num+" ");
            num=num+d;
        }

    }


    private void sum() {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number : ");
        int n=sc.nextInt();
        int i,j,num=0,strt=1,num1;
        for(i=strt;i<=n;i++){
            num=num+i;
        }
        System.out.println("The sum of numbers using loop from "+strt+" to "+n+" is "+num);
        num1=n*(n+1)/2;
        System.out.println("The sum of numbers using formula is : "+num1);
        if(num==num1){
            System.out.println("two outputs are same");
        }else{
            System.out.println("two outputs are not same");
        }
    }

    private void pattern2() {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number : ");
        int n=sc.nextInt();
        int i,j,s,k;
        for(i=1;i<=n;i++){
            for(s=n;s>=i;s--){
                System.out.print("  ");
            }
            for(j=i;j>=1;j--){
                System.out.print(j+" ");
            }
            for(k=2;k<=i;k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }

    private void pattern1() {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number : ");
        int n=sc.nextInt();
        int i,j,num=1;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}