public class triangleornot{
    public static void main(String[] args){
        int b[][]= /*  {{0,0,0,0},
                    {1,0,0,0},
                    {1,1,0,0},
                    {1,1,1,0}};*/
                   {{0,1,1,1},
                     {0,0,7,1},
                     {0,0,0,1},
                     {0,0,0,0}};
                    /*  {{1,0,1,0},
                      {1,1,1,1},
                      {1,1,1,0},
                      {1,1,1,1}};*/
       if(isuppertraingleornot(b)==1)
       {
        System.out.print("upper triangle");
       }
       else if(isuppertraingleornot(b)==2)
       {
        System.out.print("lower triangle");
       }
       else{
        System.out.print("not a triangle");
       }
    }
    private static int isuppertraingleornot(int b[][]) {
       for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){     
                if(i==j||j==0||i==b.length-1){
                    if(b[i][j]!=0){
                    return 0;
                    }else{
                       continue;
                    }
                }else if(i==j||j==b.length-1||i==0){
                    if(b[i][j]!=0){
                        return 0;
                    }else{
                        return 2;
                    }
                }
            }
        }
    return 3;
    }
}
