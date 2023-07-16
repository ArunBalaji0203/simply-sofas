public class newdff{
    public static void main(String[] args){
        String s="2.168",s1="",s2="";
        int div=1;
//reverse
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='.'){
            s1=s1+s.charAt(i);
            }else{
                for(int j=i+1;j<s.length();j++){
                    s2=s2+s.charAt(j);
                }
                break;
            }
        }
        for(int i=1;i<=s2.length();i++){
            div=div*10;
        }
        int num=Integer.parseInt(s2);
        int gcdd = findgcd(num,div);
        System.out.print(s1+" "+num/gcdd+"/"+div/gcdd);
    }
    private static int findgcd(int num,int div){
        if(num%div==0)
        return div;
        return findgcd(div,num%div);
    }
}