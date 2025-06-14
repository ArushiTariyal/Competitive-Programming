import java.util.*;
public class CP_ReverseProxy_AC {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();

        List<Integer> result = new ArrayList<>();
        int[] boxes = new int[N+1];
        for(int i = 0; i<Q; i++){
            int ball = sc.nextInt();
            if(ball>=1){
                boxes[ball]++;
                result.add(ball);
            }
            else{
                int min = Integer.MAX_VALUE;
                int ind = -1;
                for(int j = 1; j<=N; j++){
                    if(boxes[j]<min){
                        min = boxes[j];
                        ind = j;
                    }
                }
                boxes[ind]++;
                result.add(ind);
            }
        }
        for(int e: result){
            System.out.print(e + " ");
        }
    }
}
