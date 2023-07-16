import java.util.Scanner;

public class vowelsprogram{
    public static void main(String[] args){
        vowelsprogram vp=new vowelsprogram();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string : ");
        String s=sc.nextLine();
        vp.vowelcount(s);
        vp.consonant(s);
        vp.slicinglastfourelement(s);
    }

    private void slicinglastfourelement(String s) {
        int num=s.length()-4;
        String s1="";
        for(int i=num;i<s.length();i++){
         s1=s1+s.charAt(i);   
        }
        System.out.println("After slicing last four elements is : "+s1.toString());
    }

    private void consonant(String s) {
        int count=0;
       for(int i=0;i<s.length();i++){
       if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
        continue;
       }else{
        count++;
       }
       }
       System.out.println("The total consonant letters in the string is : "+count);
    }

    private void vowelcount(String s) {
        int count=0;
       for(int i=0;i<s.length();i++){
       if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
        count++;
       }
       }
       System.out.println("The total vowels in the string is : "+count);
    }
}