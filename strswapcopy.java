import java.util.Arrays;

public class strswapcopy{
public static void main(String[] args){
        String s="bye2 sky5 hi4 guy1 night0",s2="",s3="",s4="",s5="";
        String s1[]=new String[5];
        int k=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                 k++;
                 s2="";
                continue;      
            }else{
               s2=s2+s.charAt(i);
               s1[k]=s2;
            }
        }
		int a[]=new int[k+1];
		int l=0;
		for(int i=0;i<=k;i++){
			s3=s1[i];
			s5="";
			for(int j=0;j<s3.length();j++){
				if(s3.charAt(j)<='9'&&s3.charAt(j)>='0'){
					a[l]=s3.charAt(j)-48;
					l++;
				}else{
					s5=s5+s3.charAt(j);
					s1[i]=s5;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]>a[j]){
					s4=s1[i];
					s1[i]=s1[j];
					s1[j]=s4;
				}
			}
		}
		for(int i=0;i<=k;i++){
		System.out.print(s1[i]+" ");
		}

    }
}