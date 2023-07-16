public class namepatterns{
    public static void main(String[] args){
        int i,j,k=0;
        String s="WELCOMETOZOHOCORPORATION";
        for(i=0;i<5;i++){
            for(j=0;j<5;j++){
                if(k<s.length()){
                System.out.print(s.charAt(k)+" ");
                k++;
                }/*else{
                    System.out.print(" ");
                }*/
            }
    
            System.out.println();
        }
    }
}