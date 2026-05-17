public class CountKthRootsInARange_LC_CP {
    class Solution {
        public long power(long base, int p){
            int result =  1;
            for(int i = 1; i<=p; i++) result *= base;
            return result;
        }
        public int countKthRoots(int l, int r, int k) {
            int rbound = (int) Math.pow(r, 1.0/k) +1;

            while(power(rbound,k)>r) rbound--;

            int lbound = (int) Math.pow(l,1.0/k);

            while(power(lbound,k)<l) lbound++;

            return Math.max(rbound-lbound+1,0);
        }
    }
}
