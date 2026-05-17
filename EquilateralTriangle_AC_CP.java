import java.util.*;

public class CP_EquilateralTriangle_AC {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int L = sc.nextInt();

        int[] d = new int[N - 1];
        for(int i = 0; i < N - 1; i++) {
            d[i] = sc.nextInt();
        }

        if (L % 3 != 0) {
            System.out.println(0);
            return;
        }


        int[] pos = new int[N];
        pos[0] = 0;
        for(int i = 1; i < N; i++) {
            pos[i] = (pos[i - 1] + d[i - 1]) % L;
        }


        Map<Integer, Integer> freq = new HashMap<>();
        for(int i = 0; i < N; i++) {
            freq.put(pos[i], freq.getOrDefault(pos[i], 0) + 1);
        }

        int gap = L / 3;
        long count = 0;


        for (int p : freq.keySet()) {
            int p2 = (p + gap) % L;
            int p3 = (p + 2 * gap) % L;


            if (freq.containsKey(p2) && freq.containsKey(p3)) {

                int[] sorted = new int[]{p, p2, p3};
                Arrays.sort(sorted);
                if (sorted[0] == p) {
                    count += 1L * freq.get(p) * freq.get(p2) * freq.get(p3);
                }
            }
        }

        System.out.println(count);
    }
}
