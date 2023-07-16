import java.util.Arrays;
import java.util.Scanner;

public class twodimensionarray{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the row value : ");
        int row=sc.nextInt();
        System.out.print("enter the column value : ");
        int col=sc.nextInt();
        int a[][]=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print("enter the array elements : ");
                a[i][j]=sc.nextInt();
            }
        }
      //  System.out.print(Arrays.toString(a));
       for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}