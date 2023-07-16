public class stringspacs {
    public static void main(String[] args){
        String s="bye sky hello",s1="";
        int count=0;
        for(int i=s.length()-1;i>=0;i--){
            count++;
            if(s.charAt(i)==' '||i==0){
                for(int j=i;j<count+i;j++){
                    s1=s1+s.charAt(j);
                }
                s1=s1+" ";
                count=0;
            }
        }
        System.out.println(s1);
    }
}
