public class patternwithif{
    public static void main(String[] args){
        int i,j,row=3,col=3;
        for(i=1;i<=row;i++){
            for(j=col;j>=1;j--)
            {
                if(j<=i){
                System.out.print("*"+j);
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }                                                                                                                                                                                                                                                                                                                                                                                                                    
    }
}   
// col/2+1;