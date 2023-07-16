public class nameinvertical{
    public static void main(String[] args){
        int i,j;
        String s="ARUN";
        for(i=0;i<s.length();i++){
            for(j=0;j<s.length();j++){
               
                  if(j==0){
                     System.out.print(s.charAt(i)+" ");
                }
                 /*if(j==s.length()-1){
                    System.out.print(s.charAt((s.length()-1)-i)+" ");
                }*/else if(i==0){
                    System.out.print(s.charAt(j)+" ");
                }/*else if(i==s.length()-1){
                    System.out.print(s.charAt((s.length()-1)-j)+" ");
                }*/
               else if(i+j==s.length()){
                    System.out.print(s.charAt(s.length()-i-1));
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}