import java.util.Scanner;

public class namepatternsinloop{
    public static void main(String[] args){
        int i,j,k,l,count=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the name : ");
        String s=sc.nextLine();
        for(i=0;i<s.length();i++){
            for(j=i;j<s.length();j++){
                System.out.print("  ");
            }
            for(k=0;k<=i;k++){
                if(count==0){
                    System.out.print(" ");
                }
                System.out.print(s.charAt(k)+" ");
            }
            for(l=i;l>=0;l--){
                if(count==0){
                    continue;
                }
                System.out.print(s.charAt(l)+" ");
            }
        
            count=1;
            System.out.println();
        }
    }
}