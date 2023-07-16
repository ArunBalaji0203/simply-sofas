import java.util.Scanner;

public class testcase{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the string : ");
        String s=sc.nextLine();
        String s1=" ";
        int count;
        for(int i=0;i<s.length();i++){
            count=0;
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    count++;
                }
            }
            if(count==0){
                s1=s1+s.charAt(i);
            }
        }
        System.out.println(s1.length()-1);
    }
} 