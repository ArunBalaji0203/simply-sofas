public class doublefraction{
    public static void main(String[] args){
        String s="2.20",s1="",s2="",s3="",s4="";
//reverse
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='.'){
            s4=s4+s.charAt(i);
            }else{
                break;
            }
        }
        for(int i=s.length()-1;i>=0;i--){
            s1=s1+s.charAt(i);
        }
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)=='.'){
                break;
            }else{
                s2=s2+s1.charAt(i);
            }
        }
        for(int i=s2.length()-1;i>=0;i--){
            s3=s3+s2.charAt(i);
        }
        int num=Integer.parseInt(s3);
        int gcd=1;
        for(int i=1;i<=num&&i<=100;i++)
		{
			if(num%i==0 && 100%i==0)
				gcd=i;
		}
        System.out.print(s4+" "+num/gcd+"/"+100/gcd);
    }
}