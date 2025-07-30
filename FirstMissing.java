// import java.util.Arrays;
public class FirstMissing {
    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 1, 4};  
       // map every element with one - index   *like 4 with 3 index and make that index -ve
       for(int i=0;i<5;i++){
        int res=Math.abs(arr[i])*-1;
        arr[arr[i]-1]=res;
       }
       for(int i=0;i<5;i++){
        if(i>0){
            System.out.println(i+1);
        }
       }
    }
}
