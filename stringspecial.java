import java.util.Scanner;

public class stringspecial{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string : ");
        String s=sc.nextLine();
        int i=0,j,num=0;
       // char letter;
        String s1="";
        for(i=0;i<s.length();i++)
        {                            // not equal (s.charAt(i)<='9'&&s.charAt(i)>='0')(break)
        if(s.charAt(i)<='9'&&s.charAt(i)>='0')
            {
                
              //letter=s.charAt(i-1);
              //  while(s.charAt(i)<='9'&&s.charAt(i)>='0')
              //{
                    num=(num*10)+s.charAt(i)-48;
                  //  i++;
                   /*  if(i==s.length()){
                        break;
                    } */
                //}
                if(s.charAt(i)<='9'&&s.charAt(i)>='0'){
                }else{
                        s1=s1+s.charAt(i);
                        System.out.print(s1+" ");
                }
                for(j=0;j<num;j++)
                {
                  //  System.out.print(s1);
                }
            }
            num=0; 
        }
       // System.out.print(s1+" ");
    }
}