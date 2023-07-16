public class patternwithspace{
    public static void main(String[] args){
        int i,j,row=6,col=6;
        for(i=1;i<=row;i++){
            for(j=col;j>=1;j--)
            {
                if(j<=i){
                 System.out.print(j);
                if(j!=1){
                    System.out.print("*");
                }
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }                                                                                                                                                                                                                                                                                                                                                                                                                    
    }
}   