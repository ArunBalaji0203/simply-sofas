public class nameintwodimension{
    public static void main(String[]args){
        int i,j,k=0;
        String s="WELCOMETOZOHOCORPORATION";
        char s1[][]=new char[s.length()][s.length()];
        for(i=0;i<5;i++){
            for(j=0;j<5;j++){
                s1[i][j]=s.charAt(k);
                System.out.print(s1[i][j]);
                k++;
            }
            System.out.println();
        }
    }
}