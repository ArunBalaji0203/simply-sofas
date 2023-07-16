public class urgrnt{
    public static void main(String args[]){
        int count=0,count1=0;
         int a[][]=  {{0,0,0},
                      {5,0,0},
                      {1,2,0}};
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){ 
                if(i<=j){
                    if(a[i][j]!=0){
                        count++;
                    }
                }else if(i>=j){
                     if(a[i][j]!=0){
                        count1++;
                    }
                }
            }
        }
        if(count==0){
            System.out.print("upper triangle");
        }else if(count1==0){
            System.out.print("lower triangle");
        }else{
            System.out.print("not a triangle");
        }
    }
}