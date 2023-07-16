import java.util.Scanner;

public class findpathcopy{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the row value : ");
        int row=sc.nextInt();
        System.out.print("enter the column value : ");
        int col=sc.nextInt();
        int r=row-1,c=col-1;
        String s[][]=new String[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.println("enter the array elements : ");
                s[i][j]=sc.next();
            }
        }
        for(int m=0;m<row;m++){
         for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
             if(m!=1){
                if(i==m||j==c-m){
                    System.out.print(s[i][j]);
                }
            }else if(j==m||j>0&&i==r||i==0&&j<m){
                System.out.print(s[i][j]);
            }
            }
        }System.out.println();
    }
    

    }
}