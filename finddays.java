import java.util.Scanner;

public class finddays{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the date : ");
        String s=sc.nextLine();//01/06/1980
        System.out.print("enter the second date : ");
        String s1=sc.nextLine();//10/07/2022
        String s2="",s3="",s4="";
        for(int i=0;i<s.length();i++){
            if(i<=1){
                s2=s2+s.charAt(i);
            }else if(i==2||i==3){
                s3=s3+s.charAt(i);
            }else{
                s4=s4+s.charAt(i);
            }
        }
        int day=Integer.parseInt(s2);
        int mon=Integer.parseInt(s3);
        int year=Integer.parseInt(s4);
        s2="";
        s3="";
        s4="";
        for(int i=0;i<s1.length();i++){
            if(i<=1){
                s2=s2+s1.charAt(i);
            }else if(i==2||i==3){
                s3=s3+s1.charAt(i);
            }else{
                s4=s4+s1.charAt(i);
            }
        }
        int leap=0,years=0,months=0,days=0;
        int day1=Integer.parseInt(s2);
        int mon1=Integer.parseInt(s3);
        int year1=Integer.parseInt(s4);
        years=year1-year;
        if(mon<=mon1){
            months=mon1-mon;
        }else{
            months=(mon1-mon+12);
        }
        if(mon>=mon1){
            years-=1;
        }
        for(int i=year;i<year1;i++){
            if(i%4==0){
                leap++;
            }
        }
         if(day<=day1){
            days=day1-day;
        }else{
           days=(day1-day+30);
        }
        if(days>=30){
            months--;
        }
        if(mon1<=2)
            leap--;
        if(mon<=2)
            leap--;
        System.out.print((days+leap)+" days, "+months+" months, "+years+" years");
    }
}