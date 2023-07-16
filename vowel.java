import java.util.Scanner;

public class vowel{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the string : ");
        int i,count=0,max=0,start=0,end=0;
        String s=sc.nextLine();//arun
        for(i=0;i<s.length();i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                count++;
            }else{
                count=0;
            }
            if(max<count){
                end=i;
                start=end-max;
                max=count;
            }
        }
        for(int k=start;k<=end;k++){
            System.out.print(s.charAt(k));
        }
    }
}