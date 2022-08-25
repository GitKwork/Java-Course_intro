public class DZ1_2 {

    public static int removeElement(int[] n, int k) {
		int t = 0;
		for (int i = 0; i < n.length; i++) {
            if (n[i] != k) {
				n[t] = n[i];
                t++;
		    }
		}
		return t;
	}
}