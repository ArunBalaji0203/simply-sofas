public class parenthesis{
    public static void main(String[] args){
        int l=0,i=1,len;
        String s="{[()[(0)]]}",s2="";
        for(int j=0;j<s.length();j++){
            if(isparenthesis(s,j)){
                s2=s2+s.charAt(j);
            }
        }
        len=s2.length()*2;
        System.out.print("The Given Parenthesis "+s.toString()+" is : ");
        while(s2.length()!=0 && i<=len){
              if(l>=s2.length()){
                l=0;
              }  
                if(ispaired(s2,l)){
                    s2=s2.substring(0,l)+s2.substring(l+1+1,s2.length());
                }
                    l++;  
                    i++;
                }
        if(s2.length()==0){
            System.out.print("BALANCED");
        }else{
            System.out.print("UNBALANCED");
        }
    }

    private static boolean isparenthesis(String s, int j) {
        return s.charAt(j)=='{'||s.charAt(j)=='}'||s.charAt(j)=='['||s.charAt(j)==']'||s.charAt(j)=='('||s.charAt(j)==')';
    }

    private static boolean ispaired(String s2,int l) {
        return s2.charAt(l)=='{'&&s2.charAt(l+1)=='}'||s2.charAt(l)=='('&&s2.charAt(l+1)==')'||s2.charAt(l)=='['&&s2.charAt(l+1)==']';
    }
}