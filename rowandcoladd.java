public class rowandcoladd{
    public static void main(String[] args){
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        int row,col;
        for(int i=0;i<a.length;i++){
            row=0;
            col=0;
            for(int j=0;j<a[0].length;j++){
                col=col+a[j][i];
                row=row+a[i][j];
            }
            System.out.println("column is: "+col+"  ");
            System.out.print("row is : "+row+"  ");
        }
    }
} 