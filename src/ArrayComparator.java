public class ArrayComparator {
    public boolean compare(int[] first, int[] second) {
        if (first == null && second == null)
            return true;
        if (first == null || second == null || first.length != second.length)
            return false;

        for (int i = 0; i < first.length; i++) {
            if (first[i] != second[i]) {
                return false;
            }
        }
        return true;
    }


}
