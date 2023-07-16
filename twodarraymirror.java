import java.util.Scanner;

public class twodarraymirror{
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
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("the mirrored array is ");
         for(int i=0;i<row;i++){
            for(int j=col-1;j>=0;j--){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}