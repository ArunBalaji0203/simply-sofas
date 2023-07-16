import java.util.HashMap;
public class hashmap{
    public static void main(String[] args){
        int a[]={0,1,2,2,3,4,5,5,7};
        HashMap<Integer,Integer>hs=new HashMap<Integer,Integer>();
        for(int i=0;i<a.length;i++){
            if(hs.containsKey(a[i])){
                int count=hs.get(a[i]);
                hs.put(a[i],++count);
            }else{
                hs.put(a[i], 1);
            }
        }System.out.println(hs);
    }
}