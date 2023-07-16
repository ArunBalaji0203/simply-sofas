import java.util.Scanner;
import java.util.Arrays;
public class flames{
    public static void main(String[] args){
        int x,y,count1=0,i, j, p ;
        String s="flames";
        Scanner sc=new Scanner(System.in);
        System.out.print("enter your name : ");
        String a=sc.nextLine();
        System.out.print("enter your partner name : ");
        String b=sc.nextLine();
        String c=a+b;
        char d[]=new char[c.length()];
        for(int q1=0;q1<d.length;q1++){
            d[q1]=c.charAt(q1);
        }
        for(x=0;x<d.length;x++){
            for(y=x+1;y<d.length;y++){
                if(d[x]==d[y]){
                    d[x]='[';
                    d[y]='[';
                }
            }
        }
        for(int l=0;l<d.length;l++){
            if(d[l]!='['){
                count1+=1;
            }
        }//count value...
        if(count1==0){
            System.out.println("the names are same TRY AGAIN");
        }
        for(i=1;i<=5;i++){
            p=0;
            for(j=1;j<=count1;j++){
            if(p==s.length()){
                p=0;
            }
        if (j == count1) {
         s = s.substring(p + 1, s.length()) + s.substring(0, p);
            }
            p++;
        }  
    }
        switch(s.toString()){
            case "f":
            System.out.println("The Relation is--> FRIEND");
            break;
            case "l":
            System.out.println("The Relation is--> LOVE");
            break;
            case "a":
            System.out.println("The Relation is--> AFFECTION");
            break;
            case "m":
            System.out.println("The Relation is--> MARRY");
            break;
            case "e":
            System.out.println("The Relation is--> ENEMY");
            break;
            case "s":
            System.out.println("The Relation is--> SISTER");
            break;

        }
    }
}