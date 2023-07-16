public class twopatterncopy{
    public static void main(String[] args){
        int b[][]={{0,3,3,9},{0,0,8,4},{0,0,0,9},{0,0,0,0}};
       if(isuppertraingle(b)==false){
        System.out.print("upper triangle");
       }else{
        System.out.print("lower triangle");
       }
    }
    private static boolean isuppertraingle(int b[][]) {
       for(int i=0;i<3;i++){
            for(int j=0;j<=i;j++){     
                if(b[i][j]!=0){
                    return true;
                }
            }
        }
    return false;
    }
}
