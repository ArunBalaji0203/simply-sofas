public class findsubword{
    public static void main(String[] args){
        int row=6,col=6;
        String s1[]={"S","A","A","W"};//GRAM
        String s[][]=   {{"T","H","I","S","I","S"},
                         {"J","A","V","A","P","R"},
                         {"O","G","R","A","M","M"},
                         {"I","N","G","W","E","L"},
                         {"C","O","M","E","S","Y"},
                         {"S","T","E","M","I","N"}};
                
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                getendindex(i,j,s,s1,row);
            }
        }
    }
    
    private static int getendindex(int i, int j, String[][] s, String[] s1, int row) {
        int incre=0,incre1=0,incre2=0;
        if(s[i][j]==s1[0]){
            incre=0;
            incre1=0;
            incre2=0;
            for(int k=i;k<=i;k++){
                for(int l=j;l<j+s1.length;l++){
                    if(l<row-1 && s[k][l]==s1[incre]){
                        incre++;
                        if(incre==s1.length){
                            System.out.print("start "+i+","+j+" end "+k+","+l);
                        }
                    }
                }
            }
            for(int k1=j;k1<=j;k1++){
                for(int l1=i;l1<i+s1.length;l1++){
                    if(l1<=5 && s[l1][k1]==s1[incre1]){
                        incre1++;
                        if(incre1==s1.length){
                            System.out.print("start "+i+","+j+" end "+l1+","+k1);
                        }
                    }
                }
            }
            int k2=i;
            for(int z=0;z<s1.length;z++){
                if(s[k2][k2]==s1[z]){
                    k2++;
                    incre2++;
                    if(incre2==s1.length){
                        System.out.print("start "+i+","+i+" end "+k2+","+k2);
                    }
                }
            }
        }
        return incre1;
    }
}