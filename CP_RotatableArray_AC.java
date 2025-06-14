import java.util.*;
public class CP_RotatableArray_AC {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();

        int[] A = new int[N];
        for(int i = 0; i<N; i++){
            A[i] = i+1;
        }

        int shift = 0;
        for(int i = 1; i<=Q; i++){
            int query = sc.nextInt();

            if(query==1){
                int p = sc.nextInt();
                int x = sc.nextInt();
                A[(p-1+shift)%N] = x;
            }
            else if(query==2){
                int p = sc.nextInt();
                System.out.println(A[(p-1+shift)%N]);
            }
            else{
                int k = sc.nextInt();
                shift = (shift + k)%N;
            }
        }

    }
}
