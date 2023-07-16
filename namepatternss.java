import java.util.Scanner;

public class namepatternss{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
            namepatternss np=new namepatternss();
           // np.pattern1();
           // np.diamond();
          np.diamondline();
        }
    private void diamondline() {
        Scanner sc=new Scanner(System.in);
        int i,j,k,l,len;
        System.out.print("Enter the name : ");
        String s=sc.nextLine();
        len=s.length()-1;
        for(i=0;i<s.length()-1;i++){
            for(j=i;j<s.length();j++){
                System.out.print(" ");
            }
            System.out.print(s.charAt(len-i));
            for(k=0;k<i;k++){
                System.out.print("  ");
            }
            System.out.print(s.charAt(i));  
           System.out.println();
        }
        System.out.print("  ");
        for(l=0;l<s.length();l++){
            System.out.print(s.charAt(l)+" ");
        }
        for(i=0;i<s.length();i++){
            for(j=-1;j<i;j++){
                System.out.print(" ");   
            }if(i>0)
            System.out.print(s.charAt(i));
            for(k=s.length();k>i+1;k--){
                if(i!=0)
                System.out.print("  ");
            }if(i!=0)
            System.out.print(s.charAt(len-i));
            System.out.println();
        }
    }
    public void pattern1(){
        int i,j,len;
        String s="ARUN";
        for(i=0;i<s.length();i++){
            len=s.length()-1;
            for(j=0;j<s.length();j++){
                if(i%2==0){
                    System.out.print(s.charAt(j)+" ");
                }
                 else{
                    System.out.print(s.charAt(len)+" ");
                    len--;
                }
            }
            System.out.println(); 
        }
    }
    public void diamond(){
        Scanner sc=new Scanner(System.in);
      int i,j,inn=7,in,k=0,len;
      in=inn/2;
      System.out.print("Enter the name : ");
        String s=sc.nextLine();
      len=s.length()-1;
      for(i=1;i<=inn;i++){
        for(j=1;j<=inn;j++){
          if(5==i+j||i+in==j){
            System.out.print(s.charAt(len));   
            }
            else if(i-3==j||i+j==inn+4){
                System.out.print(s.charAt(k));   
            }
           else{
            System.out.print(" ");
           }
        }
        if(i>=4)
        k++;
        len--;
        System.out.println();
      }

    }
}