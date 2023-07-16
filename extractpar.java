public class extractpar{
    public static void main(String[] args){
        String s="{(a*b)+(a+b)}",s1="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='{'||s.charAt(i)=='}'||s.charAt(i)=='['||s.charAt(i)==']'||s.charAt(i)=='('||s.charAt(i)==')'){
                s1=s1+s.charAt(i);
            }
        }
        System.out.print(s1);
    }
}