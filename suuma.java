import java.net.Socket;
import java.util.Scanner;

public class suuma
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the name : ");
        int i,j,quo,end,cen;
        String s=sc.nextLine();
        quo=s.length()/2;
        end=s.length()-quo-1;
        cen=quo+1;
        for(i=1;i<=3;i++)
        {
            for(j=1;j<=quo;j++)
            {
                if(j==1){
                    System.out.print(s.charAt(i-1)+" ");
                }else if(j==quo)
                {
                    System.out.print(s.charAt(end+1)+" ");
                    end++;
                }else if(i==2){
                    System.out.print(s.charAt(cen-1)+" ");
                    cen++;
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}