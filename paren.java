public class paren{
    public static void main(String[] args){
        String s="{[()())]}";
       char[] c=new char[s.length()];
        int index=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='{'||s.charAt(i)=='['||s.charAt(i)=='(')
            {
                c[index]=s.charAt(i);
                index++;
            }
            else{ 
                if(s.charAt(i)==')'&&c[index-1]=='('||s.charAt(i)==']'&&c[index-1]=='['||s.charAt(i)=='}'&&c[index-1]=='{')
                {
                index-=1;
                }
                else
                {
                System.out.print("UNBALANCED");
                return;
                }
            }
        }
        if(index==0){
            System.out.print("BALANCED");
        }
    }
}
 