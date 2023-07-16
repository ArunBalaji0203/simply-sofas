public class pattern{
    public static void main(String[] args){
        int i,j,count=0;
        String s="aaaaaaaaaaaabbbbbccc";
        char ch[]=new char[s.length()];
        for(i=0;i<s.length();i++){
            for(j=0;j<s.length();j++){
             if(i==j){
              ch[i]=s.charAt(i);
             } 
             if(ch[i]==s.charAt(j)){
              count++;
             }
            }
        }
    }

}