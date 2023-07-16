import java.util.Scanner;

public class stringequalornot{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter first name : ");
        String a=sc.nextLine();
        System.out.print("enter second name : ");
        String b=sc.nextLine();
        a=a+b;
        char c[]=new char[a.length()];
        for(int i=0;i<a.length();i++){
            c[i]=a.charAt(i);
        }
        for(int i=0;i<c.length;i++){
            for(int j=i+1;j<c.length;j++){
                if(c[i]==c[j]){
                    c[i]='*';
                }
            }
        }
        int count=0;
        for(int i=0;i<c.length;i++){
            if(c[i]=='*'){
                count++;
            }
        }
        if(count==0){
            System.out.print("EQUAL");
        }else{
            System.out.print("UNEQUAL");
        }
    }
}