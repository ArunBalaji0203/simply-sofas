import java.util.Scanner;

public class hours{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the years : ");
        int yr=sc.nextInt();
        System.out.print("enter the month : ");
        int mon=sc.nextInt();
        System.out.print("enter the day : ");
        int day=sc.nextInt();
        System.out.print("the total number of hours for "+yr+" year, "+mon+" month and "+day+" day is : ");
        int hr=0;
        yr=yr*365;
        mon=mon*30;
        day=day+yr+mon;
        hr=day*24;
        System.out.print(hr+" hours ");
    }
}