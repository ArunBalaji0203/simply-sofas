import java.util.Arrays;
import java.util.Scanner;

public class suma {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] array = {5, 10, 15, 20, 25};
        double average = findAverage(array);
        System.out.println("The average value is: " + average);
    }
    
    public static double findAverage(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length;
    }
}

/*  Scanner sc=new Scanner(System.in);
      System.out.print("enter the number : ");
      int num=sc.nextInt();
      char c=(char)num;
      System.out.println("The ASCII value of "+num+" is "+c);*/
 /*   Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string or number : ");
        String s=sc.nextLine();
        String s1="";
        int i;
        for(i=s.length()-1;i>=0;i--){
            s1=s1+s.charAt(i);
        }
        if(s.equals(s1))
            System.out.println("palindrome");       
        else
            System.out.println("not palindrome"); */
 /* if(count==s.length()){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }*/
      /* if(c[k]==s.charAt(k)){
                count++;
            } */ 
                   // System.out.println(Arrays.toString(c));
