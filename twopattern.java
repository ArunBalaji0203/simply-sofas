public class twopattern{
    public static void main(String[] args){
        int a[][]=new int[3][3];
        int b[][]={{0,0,0},{9,0,0},{9,8,0}};
        int count=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<=i;j++){      //System.out.print(b[i][j]+" ");
             if(b[i][j]!=0){
                count++;
               break;
             }
            }   //  System.out.println();
        }
        if(count<=1){
        System.out.print("upper triangle");
        }
        else{
            System.out.print("lower triangle");
        }
    }
} 