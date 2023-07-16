import java.util.Scanner;
import java.util.Arrays;

public class stringsort{
    public static void main(String[] args){
        int x,y,count1=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the first string : ");
        String a=sc.nextLine();
        System.out.print("enter the second string : ");
        String b=sc.nextLine();
        String c=a+b;
        char d[]=new char[c.length()];
        for(int q=0;q<d.length;q++){
            d[q]=c.charAt(q);
        }
        for(x=0;x<d.length;x++){
            for(y=i+1;y<d.length;y++){
                if(d[x]==d[y]){
                    d[x]='[';
                    d[y]='[';
                }
            }
        }
        for(int l=0;l<d.length;l++){
            if(d[l]!='['){
                count++;
            }
        }
        if(count==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        //System.out.println(count);
    }
}