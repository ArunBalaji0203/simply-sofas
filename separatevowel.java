public class separatevowel{
    public static void main(String[] args){
        String s="zxcvbnmnb";
        for(int i=0;i<s.length();i++){
            if(isvowel(s.charAt(i))){
                System.out.print(s.charAt(i));
            }
            
        }
    }

    private static boolean isvowel(char charAt) {
        return (charAt=='a'||charAt=='e'||charAt=='i'||charAt=='o'||charAt=='u');
    }
}