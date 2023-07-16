import java.util.Scanner;

public class palindrome{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string or number : ");
        String s=sc.nextLine();
        String s1="";
        int i;
        for(i=s.length()-1;i>=0;i--){
            s1=s1+s.charAt(i);
        }
        if(s.equals(s1)){
            System.out.println("palindrome");
        }
        else{
            System.out.print("not palindrome");
        }
    } 
}
/*   for(int k=0;k<s.length();k++){
            if(c[k]==s.charAt(k)){
                count++;
            }
        }
        if(count==s.length()){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }*/