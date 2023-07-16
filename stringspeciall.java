import java.util.Scanner;

public class stringspeciall{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string : ");
        String s=sc.nextLine();
        int i=0,num=0;
        String s1="";
        for(i=0;i<s.length();i++){
            if(s.charAt(i)<='9'&&s.charAt(i)>='0'){
                num=(num*10)+s.charAt(i)-48;
            }else{
                s1=s1+s.charAt(i);
            }
            for(int j=1;j<=num;j++){
                System.out.print(s1);
                if(j==num){
                    s1="";
                }
            }
            num=0;
        }
    }
}