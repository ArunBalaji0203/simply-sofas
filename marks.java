import java.util.Scanner;

public class marks{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the mark : ");
        int mark=sc.nextInt();
        if(mark>=90){
            System.out.print("A");
        }
        else if(mark>=80){
            System.out.print("B");
        }
         else if(mark>=60){
            System.out.print("C");
        }
        else if(mark>=35){
            System.out.print("D");
        }
        else{
            System.out.print("FAIL");
        }
        *
    }
}