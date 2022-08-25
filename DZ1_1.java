public class DZ1_1 {

    public static void duplicateZeros(int[] array) {
        int numP = 0;
        while (numP < array.length - 1) {
            if (array[numP] == 0) {
                int num0 = numP + 1;
                int i = array.length - 1;
                while ( i > num0 ) {
                    array[i] = array[i - 1];
                    i--;
                }
                array[num0++] = 0;
                numP++;
            }
            numP++;
            }
    }
}
    

