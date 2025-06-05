import java.util.Scanner;

public class EnergyCrystals_CP {
    public static boolean canReach(int x, int k){
        int a = k/3;
        int b = (k+1)/3;
        int c = (k+2)/3;
        long total = (1L<<a) + (1L<<b) + (1L<<c);
        return total>=3L*x;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int x = sc.nextInt();
            int low = 0, high = 100;
            int ans = -1;
            while(low<=high) {
                int mid = low + (high-low)/2;
                if (canReach(x, mid)){
                    ans = mid;
                    high = mid - 1;
                }
                else low = mid + 1;
            }
            System.out.println(ans);
        }

    }
}
