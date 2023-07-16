public class strswap{
    public static void main(String[] args){
        String s="by3e sky5 hi4 guy1 night9",s2="",s3="";
        String s1[]=new String[7];
        int k=0,h=0;
        int b[]=new int[7];
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                 k++;
                 s2="";
                continue;      
            }else{
                if(s.charAt(i)<='9'&&s.charAt(i)>=0){
                    b[h]=s.charAt(i)-48;
                    h++;
                }else{
                    s2=s2+s.charAt(i);
                    s1[k]=s2;
                }
            }
        }
        int max=0;
		for(int i=0;i<h;i++){
			for(int j=i+1;j<h;j++){
				if(b[i]>b[j]){
					s3=s1[i];
					s1[i]=s1[j];
					s1[j]=s3;
                    max=b[i];
                    b[i]=b[j];
                    b[j]=max;

				}
			}
		}
		for(int i=0;i<=k;i++){
		System.out.print(s1[i]+" ");
		}
    }
}