import java.util.Scanner;

public class inheritance{
    public void add(int i, int j){
        System.out.println(i+j);
    }
    public void subtract(int i, int j){
        System.out.println(i-j);
    }
    public void multiply(int i, int j){
        System.out.println(i*j);
    }
    public void divide(int i, int j){
        System.out.println(i/j);
    }
}
 class pulla extends inheritance{
    public static void main(String[] args){
        pulla pu=new pulla();
    Scanner sb = new Scanner(System.in) ;
            System.out.print("how many times do you want : ");
            int len=sb.nextInt();
            for(int z=1;z<=len;z++){
         Scanner sc = new Scanner(System.in);
                System.out.print("Enter your function choice like(add) : ");
                String s=sc.nextLine();
                System.out.print("enter the first num : ");
                int i=sc.nextInt();
                System.out.print("enter the second num : ");
                int j=sc.nextInt();
                switch(s.charAt(0)){
                    case 'a':
                        pu.add(i, j);
                        break;
                    case 's':
                        pu.subtract(i, j);
                        break;
                    case 'm':
                        pu.multiply(i, j);
                        break;
                    case 'd':
                        pu.divide(i, j);
                        break;    
                    default :
                        System.out.println("Try again");
                        break;
                    }
            }
            }
        }  