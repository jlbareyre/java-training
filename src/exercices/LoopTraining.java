public class LoopTraining {

    /**
     * @param values, eg: {1, 2, 3}
     * @return the sum of the values, eg: 6
     */
    public static int sum(int[] values) {
        int ret = 0;
        for (int i : values) {
            ret += i;
        }
        return ret;
    }

    /**
     * @param values, eg: {"a", "b", "c"}
     * @return the concatenation of all values values, eg: "abc"
     */
    public static String concat(String[] values) {
        String ret = "";
        for (String string : values) {
            ret += string;
        }
        return ret;
    }

    /**
     * @param values, eg: {1, 3, 5}
     * @return if the array contains an even value, eg: false
     */
    public static boolean hasEven(int[] values) {
        boolean ret = false ;
        for (int i : values) {
            if ( i % 2 == 0 ) { ret = true; }
        }
        return ret;
    }

    /**
     * @param values, eg: {1, 2, 3}
     * @param search, eg: 2
     * @return the index of the searched value or -1 if the value isn't present, eg: 1
     */
    public static int indexOf(int[] values, int search) {
        int idx = -1;
        for (int i = 0; i < values.length; i++ ) {
            if (values[i] == search) { idx = i; break; }
        }
        return idx;
    }

    /**
     * @param values, eg: {1, 2, 3, 1, 2}
     * @param search, eg: 2
     * @return how many times the searched value occurred, eg: 2
     */
    public static int count(int[] values, int search) {
        int occ = 0;
        for (int i : values) {
            if (i == search) { occ += 1 ; }
        }
        return occ;
    }

    /**
     * @param values, eg: {1, 2, 3}
     * @param increment, eg: 2
     * @return add the increment to each value of the array, eg: {3, 4, 5}
     */
    public static int[] incrementEach(int[] values, int increment) {
        int[] tabInc = values.clone();
        for (int i = 0 ; i< values.length; i++) {
            tabInc[i] += increment;
        }
        return tabInc;
    }
}
