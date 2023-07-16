import java.util.Scanner;

public class stringdiagonal{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a string : ");
        String s=sc.nextLine();
        int len=s.length()-1;
        if(s.length()%2!=0){
        for(int i=0;i<s.length();i++){
            for(int j=0;j<s.length();j++){
                if(i==j||i+j==len){
                    System.out.print(s.charAt(j));
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }else{
        System.out.print("enter valid string");
    }
    }
}