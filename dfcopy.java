public class dfcopy{
    public static void main(String[] args, int gcd){
        String s="2.20",s1="",s2="",s3="",s4="",s5="";
//reverse
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='.'){
            s4=s4+s.charAt(i);
            }else{
                for(int j=i+1;j<s.length();j++){
                    s5=s5+s.charAt(j);
                }
                break;
            }
            System.out.println(s5);
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
        findgreatestcommondivisor(num);
        System.out.print(s4+" "+num/gcd+"/"+100/gcd);
    }

    private static int findgreatestcommondivisor(int num) {
        int gcd=1;
        for(int i=1;i<=num&&i<=100;i++)
		{
			if(num%i==0 && 100%i==0)
				gcd=i;
		}
        return gcd;
    }
}