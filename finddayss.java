import java.util.Scanner;

public class finddayss{
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
        int startday=Integer.parseInt(s2);
        int startmonth=Integer.parseInt(s3);
        int startyear=Integer.parseInt(s4);
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
        int endday=Integer.parseInt(s2);
        int endmonth=Integer.parseInt(s3);
        int endyear=Integer.parseInt(s4);
        years=endyear-startyear;
        for(int i=startyear;i<endyear;i++){
            if(i%4==0){

            leap++;
            }
        }
         months= getdifferenceofdayandmonth(months,startmonth,endmonth,12,years);
         if(endmonth<=2){
            leap--;
         }
        if(startmonth<=2){
            leap--;
        }
         days= getdifferenceofdayandmonth(days,startday,endday,30,months);
        if(days==0){
            leap=0;
        }
        System.out.print((days+leap)+" days, "+months+" months, "+years+" years");
    }

    private static int getdifferenceofdayandmonth(int total, int start, int end, int i, int yearormonth) {
        if(start<=end){
          total=end-start;
        }else{
            total=end-start+i;
            yearormonth--;
        }
        return total;
    }
}