public class btwnthevowels{
    public static void main(String[] args){
        int i,j,count=0,max=0,start=0,end=0;
        String s="arunkumar";
        for(i=0;i<s.length();i++){
            count=0;
            if(isvowel(s.charAt(i))){
                for(j=i+1;j<s.length();j++){
                    if(isvowel(s.charAt(j))){
                        break;
                    }else{
                        count++;
                        if(max<count){
                            max=count;
                            end=j;
                            start=i;
                        }
                    }
                }
            }
        }
        for(int x=start+1;x<=end;x++){
            System.out.print(s.charAt(x));
        }
    }

    private static boolean isvowel(char charAt) {
        return (charAt=='a'||charAt=='e'||charAt=='i'||charAt=='o'||charAt=='u');
    }
}