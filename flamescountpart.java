import java.util.Scanner;
import java.util.Arrays;

public class flames{
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
       int count=kudraa-1;
        int i, j, q, z;
        int p ;
        for (i = 1; i <= 5; i++) {
            z = -1;
            q = 0;
            p=0;
            for (j = 0; j <= count; j++) {
                if (q >= s.length()) {
                    
                    z+=1;
                    if(z>=s.length()){
                        z=0;
                    }
                    p = z;


                }
                if (j == count) {
                    s = s.substring(p + 1, s.length()) + s.substring(0, p);
                    // System.out.print(s.substring(0,count));
                  //  System.out.println(s.toString());

                }
                
                p++;
                
                q++;
            }
        }
       // System.out.println(s.toString());
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