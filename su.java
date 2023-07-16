public class su{
    public static void main(String[] args){
        String s="ABCDEF";
        String s1="FEDCBA",s2="";
        int i1=0;
        for(int i=0;i<s.length();i++){
            for(int j=s.length()-1;j>=i;j--){
                System.out.print(s.charAt(j)+" ");
            }
            System.out.println();
        }
        System.out.println(s2=s2+s1.charAt(i1)+" ");
        for(int i=0;i<s1.length();i++){
            i1=i;
            for(int k=0;k<s1.length();k++){
                    for(int j=0;j<=k;j++){
                        System.out.print(s1.charAt(j)+" ");
                    }
                    System.out.println("");
                }
                i1++;
                if(i1<s1.length()){
                   System.out.println(s2=s2+s1.charAt(i1)+" ");
                }else{
            s1="";
        }}
    }
}