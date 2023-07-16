public class stringspacee{
    public static void main(String[] args){
        String s="first second third",s2="";
        String s1[]=new String[5];
        int k=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                 k++;
                 s2="";
                continue;      
            }else{
               s2=s2+s.charAt(i);
               s1[k]=s2;
            }
        }
        for(int i=k;i>=0;i--){
            System.out.print(s1[i]+" ");
        }
    }
}
