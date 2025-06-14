import java.util.*;
public class CP_HorseRace_AC {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i<N; i++){
            arr[i] = sc.nextInt();
        }
        int K = sc.nextInt();

        int count = 0;
        for(int e: arr){
            if(e>=K) count++;
        }
        System.out.println(count);
    }
}
