public class sumapattern{
    public static void main(String[] args){
        int i,j,row=4,col=row*2-1,num;
        for(i=1;i<=row;i++){
            num=i;
            for(j=1;j<=col;j++){
                if(i+j<=row){
                    System.out.print("*");
                }
                else if(i==1&&num==1){
                    System.out.print(num);
                    break;
                }
                else if(num-1==1){
                    System.out.print(num);
                    num--;
                }
                else if(num==1){
                    System.out.print(num);
                }
               
            }
            num++;
            System.out.println();
        }

    }
}
/*{
                    System.out.print(num);
                    num--;
                    if(num==0){
                    break;
                    }
                    else if(num==1){
                        System.out.print(num++);
                    }
                }*/