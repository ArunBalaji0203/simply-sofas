import java.util.Scanner;

public class vowels{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int i,j,count=0,max=0,start=0,end=0,count1=0,st=0;
        System.out.print("enter the string : ");
        String s=sc.nextLine();
        for(i=0;i<s.length();i++){
            count=0;
        if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
            ++count1;
            st=i;
            for(j=i+1;j<s.length();j++){
              if(s.charAt(j)=='a'||s.charAt(j)=='e'||s.charAt(j)=='i'||s.charAt(j)=='o'||s.charAt(j)=='u'){
                    count++;
                }
                else{
                    break;
                }
                if(max<count){
                    start=i;
                    end=j;
                    max=count;
                }
            }
        }
    }
    if(max!=0){
        System.out.print("The longest vowel between the string is : ");
    for(int k=start;k<=end;k++){
        System.out.print(s.charAt(k));
    }}
    else if(count1>=0){
        System.out.print("The longest vowel between the string is : "+s.charAt(st));
    }
    else{
        System.out.print("no vowels");
    }
}
}