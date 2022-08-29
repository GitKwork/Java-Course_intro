public class DZ2_1_Combinations {
    class Solution {
        List<List<Integer>> resl = new ArrayList<>();

        public List<List<Integer>> combine(int n, int k) {
            Variants(n, k, 0, new ArrayList<>());
            return resl;
        }

        private void Variants(int n, int k, int previosN, List<Integer> curVariant) {
            if (curVariant.size() == k) {
                resl.add(new ArrayList<>(curVariant));
            }

            for (int i = previosN + 1; i <= n; i++) {
                curVariant.add(i);
                Variants(n, k, i, curVariant);
                curVariant.remove(curVariant.size() - 1);
            }
        }
    }

}
