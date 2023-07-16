import java.util.Arrays;

public class summa{
    public static void main(String[] args){
        int last, sise,n=5,front=0,i,j;
        sise=n*2-1;
        last=sise-1;
        int a[]=new int[sise];
        while(n!=0){
        for(i=front;i<=last;i++){
            for(j=front;j<=last;j++){
                if(i==front||i==last||j==front||j==last){
                    a[i]=n;
                    a[j]=n;
                }
            }
        }front++;
        last--;
        n--;
    }
    for(int z=0;z<sise;z++){
        for(int z1=0;z1<sise;z1++){
            System.out.print(z1);
        }
        System.out.println();
    }
}
}

/*  for(i=0;i<s.length();i++){
            if(s.charAt(i)=='{'||s.charAt(i)=='['||s.charAt(i)=='('){
                count++;
            }else if(s.charAt(i)=='}'||s.charAt(i)==']'||s.charAt(i)==')'){
                count1++;
            }
        }
        if(count==count1){
            System.out.print("balanced");
        }else{
            System.out.println("unbalanced");
        }*/
         //  System.out.println(l);
                       //System.out.println(s.substring(0,l)+s.substring(l+1+1,s.length()));
                       // System.out.println(l);
                       //System.out.println(s.substring(0,l)+s.substring(l+1+1,s.length()));
                         //System.out.println(l);
                     //System.out.println(s.substring(0,l)+s.substring(l+1+1,s.length()));
                     /*else if(s.charAt(l)=='('&&s.charAt(l+1)==')'){
                        s=s.substring(0,l)+s.substring(l+1+1,s.length());
                    }else if(s.charAt(l)=='['&&s.charAt(l+1)==']'){
                      s=s.substring(0,l)+s.substring(l+1+1,s.length());
                    } */