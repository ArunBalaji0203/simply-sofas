import java.util.Scanner;

public class findpath{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s1="",s2="",s3="";
        System.out.print("enter the row value : ");
        int row=sc.nextInt();
        System.out.print("enter the column value : ");
        int col=sc.nextInt();
        String s[][]=new String[3][3];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.println("enter the array elements : ");
                s[i][j]=sc.next();
            }
        }
         for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i==0||j==col-1){
                    s1=s1+s[i][j];
                }
                if(j==0||i==row-1){
                    s2=s2+s[i][j];
                }
                if(i==j){
                    s3=s3+s[i][j];
                }
            }
        }System.out.print("the possible ways are : "+s1+", "+s2+", "+s3);

    }
}