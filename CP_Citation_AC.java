import java.util.Scanner;
import java.util.Arrays;
public class CP_Citation_AC {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i = 0; i<N; i++){
            A[i] = sc.nextInt();
        }
        Arrays.sort(A);
        int ans = -1;
        int low = 0, high = N-1;
        for(int i = 0; i<=A[N-1]; i++){
            low = 0; high = N-1;
            while(low<=high){
                int mid = low + (high-low)/2;
                if(A[mid]>=i) high = mid-1;
                else low = mid+1;
            }
            if(N-low>=i) ans = i;
            else break;
        }
        System.out.println(ans);
    }
}
