public class stringequal{
    public static void main(String[] args){
        String s="runa";
        String s1="arun";
        int count=0;
        int len=s.length()+s1.length();
        for(int i=0;i<s.length();i++){
            for(int j=0;j<s1.length();j++){
                if(s.charAt(i)==s1.charAt(j)){
                    count+=2;
                }
            }
        }
        if(len==count){
            System.out.print("TRUE");
        }else{
            System.out.print("FALSE");
        }
    }
}