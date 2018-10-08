public class ArrayTest {
    public static void main(String[] args) {
        ArrayComparator arrayComparator = new ArrayComparator();
        int [] tab1 = new int[] {1,3,5,2};
        int [] tab2 = new int[] {1,3,5,2};
        int [] tab3 = new  int[] {1,3,5,4};


        System.out.println(arrayComparator.compare(tab1, tab2));
        System.out.println(arrayComparator.compare(tab1,tab3));
    }
}
